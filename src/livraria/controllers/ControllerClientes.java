/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livraria.controllers;

import java.util.ArrayList;
import java.util.List;
import livraria.modelos.Cliente;

/**
 *
 * @author thales
 */
public class ControllerClientes {
   private static ControllerClientes instance = null;
   private final List<Cliente> clientes = new ArrayList();
   
   public ControllerClientes() {
      
   }
   
   public static ControllerClientes getInstance() {
      if(instance == null) {
         instance = new ControllerClientes();
      }
      return instance;
   }
   
   public void salvar(Cliente cliente) {
       this.clientes.add(cliente);
   }
   
   public void atualizar(int posicao, Cliente clienteNovo) {
       this.clientes.get(posicao).setNome(clienteNovo.getNome());
       this.clientes.get(posicao).setEmail(clienteNovo.getEmail());
       this.clientes.get(posicao).setFone(clienteNovo.getFone());
       this.clientes.get(posicao).setBairro(clienteNovo.getBairro());
       this.clientes.get(posicao).setCEP(clienteNovo.getCEP());
       this.clientes.get(posicao).setCidade(clienteNovo.getCidade());
       this.clientes.get(posicao).setComplemento(clienteNovo.getComplemento());
       this.clientes.get(posicao).setEstado(clienteNovo.getEstado());
       this.clientes.get(posicao).setNumero(clienteNovo.getNumero());
       this.clientes.get(posicao).setRua(clienteNovo.getRua());
       this.clientes.get(posicao).setLogin(clienteNovo.getLogin());
       this.clientes.get(posicao).setSenha(clienteNovo.getSenha());
   }
   
   public void remover(Cliente cliente) {
       this.clientes.remove(cliente);
   }
      
   public List<Cliente> todos() {
       return this.clientes;
   }
}