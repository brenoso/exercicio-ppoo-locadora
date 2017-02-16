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
public class Video {
    
    private String titulo;
    private String anoLancamento;
    private double preco;
    private int duracao;

    public Video(String titulo, String anoLancamento, double preco, int duracao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    public String getDuracaoFormatada(){
        return "Nenhum dado para mostrar";
    }
    
    
    
    
}
