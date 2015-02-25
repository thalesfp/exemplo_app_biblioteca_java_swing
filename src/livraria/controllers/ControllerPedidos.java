/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria.controllers;

import java.util.ArrayList;
import java.util.List;
import livraria.modelos.Pedido;

/**
 *
 * @author thales.pereira
 */
public class ControllerPedidos {
   private static ControllerPedidos instance = null;
   private List<Pedido> pedidos = new ArrayList();
   
   public ControllerPedidos() {
      
   }
   
   public static ControllerPedidos getInstance() {
      if(instance == null) {
         instance = new ControllerPedidos();
      }
      return instance;
   }
   
   public void salvar(Pedido pedido) {
       this.pedidos.add(pedido);
   }
   
   public void atualizar(int posicao, Pedido pedidoNovo) {
       this.pedidos.get(posicao).setCliente(pedidoNovo.getCliente());
       this.pedidos.get(posicao).setDataEmissao(pedidoNovo.getDataEmissao());
       this.pedidos.get(posicao).setEntrega(pedidoNovo.getEntrega());
       this.pedidos.get(posicao).setFormaPagamento(pedidoNovo.getFormaPagamento());
       this.pedidos.get(posicao).setItensPedidos(pedidoNovo.getItensPedidos());
       this.pedidos.get(posicao).setSituacao(pedidoNovo.isSituacao());
       this.pedidos.get(posicao).setValorTotal(pedidoNovo.getValorTotal());
   }
   
   public void remover(Pedido pedido) {
       this.pedidos.remove(pedido);
   }
      
   public List<Pedido> todos() {
       return this.pedidos;
   }
}
