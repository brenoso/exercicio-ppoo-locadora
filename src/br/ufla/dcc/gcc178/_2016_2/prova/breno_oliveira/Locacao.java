/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178._2016_2.prova.breno_oliveira;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Locacao {
    
    private Cliente cliente;
    private List<Video> listaVideos;
    private String dataLocacao;
    private String dataExpiracao;

    public Locacao(Cliente cliente, List<Video> listaVideos, String dataLocacao, String dataExpiracao) {
        this.cliente = cliente;
        this.listaVideos = listaVideos;
        this.dataLocacao = dataLocacao;
        this.dataExpiracao = dataExpiracao;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Video> getListaVideos() {
        return listaVideos;
    }

    public void setListaVideos(List<Video> listaVideos) {
        this.listaVideos = listaVideos;
    }
    
    public double getvalorTotal(){
        double total = 0;
        for (int i=0; i < listaVideos.size(); i++){
            total+= listaVideos.get(i).getPreco();
        }
        return total;
    }
    
}
