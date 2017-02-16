/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178._2016_2.prova.breno_oliveira;

import java.util.Date;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Cliente {
    
    private String nome;
    private String dataNascimento;
    //private List<Video> listaVideos;

    public Cliente(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
