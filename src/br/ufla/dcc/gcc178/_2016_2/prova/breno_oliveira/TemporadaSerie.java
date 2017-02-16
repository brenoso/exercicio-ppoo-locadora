/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178._2016_2.prova.breno_oliveira;

/**
 *
 * @author aluno
 */
public class TemporadaSerie extends Video{
    
    
    public TemporadaSerie(String titulo, String anoLancamento, double preco, int quantidadeEpisodios) {
        super(titulo, anoLancamento, preco, quantidadeEpisodios);
    }
    
    @Override
    public String getDuracaoFormatada(){
        return super.getDuracao() +"ep";
    }
}
