package br.ufscar.dc.compiladores.build;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum TipoBUILD{
        NUMERO,
        PECA,
        CADEIA,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoBUILD tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoBUILD tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoBUILD tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoBUILD verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}

