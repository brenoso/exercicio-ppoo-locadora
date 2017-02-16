/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.gcc178._2016_2.prova.breno_oliveira;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) throws IOException, MaximoFilmesExcedidoException {
      Video f1 = new Filme("Poderoso Chefao", "1980", 15.0 , 200);
      Video s1 = new TemporadaSerie("The Big Bang Theory", "2005", 5.0, 12);
      Video f2 = new Filme("Laranja Mecanica", "1985", 20.0, 190);
      
      Cliente cliente = new Cliente("Roide", "17/03/1993");
      List<Video> listaVideos = new ArrayList<>();
      
      listaVideos.add(f1);
      listaVideos.add(s1);
      listaVideos.add(f2);
      
      Locacao locacao1 = new Locacao(cliente, listaVideos, "08/06/2016", "10/06/2016");
      
      SalvarLocacao recibo = new SalvarLocacao("ReciboRoide", locacao1);
      
      recibo.salvaArquivo();
              
    }
    
}
