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
public class MaximoFilmesExcedidoException extends RuntimeException {
 
    private int nroFilmes;
    private Cliente cliente;
 
    public MaximoFilmesExcedidoException(Cliente cliente, int nroFilmes) {
        super("Cliente " + cliente.getNome() + " não pode levar " + nroFilmes + " filmes.");
       
        this.cliente = cliente;
        this.nroFilmes = nroFilmes;
    }
   
    public Cliente getCliente() {
        return cliente;
    }
   
    public int getNroFilmes() {
        return nroFilmes;
    }  
}
