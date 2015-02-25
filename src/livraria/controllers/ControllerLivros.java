/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria.controllers;

import java.util.ArrayList;
import java.util.List;
import livraria.modelos.Livro;

/**
 *
 * @author thales.pereira
 */
public class ControllerLivros {
   private static ControllerLivros instance = null;
   private final List<Livro> livros = new ArrayList();
   
   public ControllerLivros() {
      
   }
   
   public static ControllerLivros getInstance() {
      if(instance == null) {
         instance = new ControllerLivros();
      }
      return instance;
   }
   
   public void salvar(Livro livro) {
       this.livros.add(livro);
   }
   
   public void atualizar(int posicao, Livro livroNovo) {
       this.livros.get(posicao).setAutor(livroNovo.getAutor());
       this.livros.get(posicao).setCategoria(livroNovo.getCategoria());
       this.livros.get(posicao).setDataCadastro(livroNovo.getDataCadastro());
       this.livros.get(posicao).setDescricao(livroNovo.getDescricao());
       this.livros.get(posicao).setEstoque(livroNovo.getEstoque());
       this.livros.get(posicao).setFigura(livroNovo.getFigura());
       this.livros.get(posicao).setISBN(livroNovo.getISBN());
       this.livros.get(posicao).setPreco(livroNovo.getPreco());
       this.livros.get(posicao).setTitulo(livroNovo.getTitulo());
   }
   
   public void remover(Livro livro) {
       this.livros.remove(livro);
   }
      
   public List<Livro> todos() {
       return this.livros;
   }
}
