package br.ufscar.dc.compiladores.build;

import br.ufscar.dc.compiladores.build.BUILDParser.MontagemContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.util.List;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) throws IOException {
        // Lê o arquivo de entrada
        CharStream cs = CharStreams.fromFileName(args[0]);
        BUILDLexer lexer = new BUILDLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BUILDParser parser = new BUILDParser(tokens);
        MontagemContext arvore = parser.montagem();

        // Realiza a análise semântica
        BuildSemantico as = new BuildSemantico();
        as.visitMontagem(arvore);

        // Obtém o nome base do arquivo de saída (sem extensão)
        Path outputPath = Paths.get(args[1]);
        String outputFileName = outputPath.getFileName().toString();
        String baseName = outputFileName.substring(0, outputFileName.lastIndexOf('.'));

        // Caminho para o arquivo de erros semânticos na pasta "casos-de-teste"
        String erroFilePath = Paths.get("casos-de-teste", baseName + "_erros.txt").toString();

        // Gera arquivo de saída para erros semânticos
        List<String> errosSemanticos = SemanticoUtils.errosSemanticos;
        try (PrintWriter erroWriter = new PrintWriter(erroFilePath)) {
            if (errosSemanticos.isEmpty()) {
                erroWriter.println("Nenhum erro semântico encontrado.");
            } else {
                errosSemanticos.forEach(erroWriter::println);
            }
        }

        // Exibe os erros semânticos no console
        errosSemanticos.forEach((s) -> System.out.println(s));

        // Se não houver erros, gera o arquivo de saída HTML
        if (errosSemanticos.isEmpty()) {
            BuildGeradorHTML agc = new BuildGeradorHTML();
            agc.visitMontagem(arvore);
            try (PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
        }
    }
}