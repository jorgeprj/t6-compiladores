package br.ufscar.dc.compiladores.build;

import br.ufscar.dc.compiladores.build.BUILDParser.MontagemContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {

    public static void main(String[] args) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        BUILDLexer lexer = new BUILDLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BUILDParser parser = new BUILDParser(tokens);
        MontagemContext arvore = parser.montagem();
        BuildSemantico as = new BuildSemantico();
        as.visitMontagem(arvore);

        SemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
        
        if(SemanticoUtils.errosSemanticos.isEmpty()) {
            BuildGeradorHTML agc = new BuildGeradorHTML();
            agc.visitMontagem(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
        }
    }
}
