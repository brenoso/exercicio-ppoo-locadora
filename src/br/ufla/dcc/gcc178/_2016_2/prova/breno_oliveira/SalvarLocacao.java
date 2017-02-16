/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178._2016_2.prova.breno_oliveira;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class SalvarLocacao {
    
    private String nomeArquivo;
    private Locacao locacao;
    FileWriter fw;

    public SalvarLocacao(String nomeArquivo, Locacao locacao) throws IOException {
        this.fw = new FileWriter(nomeArquivo + ".txt");
        this.nomeArquivo = nomeArquivo;
        this.locacao = locacao;
    }
    
    public void salvaArquivo() throws IOException{
       
        try {
            fw.write("Cliente: " + locacao.getCliente().getNome() + " (" + locacao.getCliente().getDataNascimento() + ")");
            fw.write("\nLocação: " +locacao.getDataLocacao() + " a " + locacao.getDataExpiracao());
            fw.write("\nVídeos:");
            
            for (int i=0; i< locacao.getListaVideos().size(); i++){
                fw.write("\n\t" + locacao.getListaVideos().get(i).getTitulo() + " (" + locacao.getListaVideos().get(i).getDuracaoFormatada() + ")"
                            + " R$ "+locacao.getListaVideos().get(i).getPreco()); // Eu ia fazer  mesmo esquema de polimorfismo para os Preços, como fiz para os min/temp., mas não vai dar tempo =\.
            }
            
            fw.write("\nValor total da locação: R$" + locacao.getvalorTotal());
        } catch (IOException ex) {
            Logger.getLogger(SalvarLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        fw.close();
    }
    
    
    
}
