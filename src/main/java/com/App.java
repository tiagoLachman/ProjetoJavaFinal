package com;

import com.controller.*;
import com.model.*;


public class App {
    public static void main( String[] args ) {
        Cliente cliente = new Cliente();
        Produto teclado = new Produto();
        Produto mouse = new Produto();
        Produto tv = new Produto();
        Pedido pedido = new Pedido();
        try {
            int id = 13;
            cliente = ClienteController.buscarClientePorId(1);
            mouse = ProdutoController.buscarProdutoPorNome("mouse");
            tv = ProdutoController.buscarProdutoPorNome("tv");
            teclado = ProdutoController.buscarProdutoPorNome("teclado");

            pedido = PedidoController.buscarPedidoPorId(id);

            PedidoController.adicionarNoCarrinho(pedido, tv, 10);
            //PedidoController.removerDoCarrinho(pedido, tv);
            
            //PedidoController.alterarPedido(pedido.getId(), pedido);

            //pedido.setCliente(cliente);
            //PedidoController.adicionarNoCarrinho(pedido, tv, 10);
            //PedidoController.adicionarNoCarrinho(pedido, mouse, 1);
            //PedidoController.adicionarNoCarrinho(pedido, teclado, 1);

            //PedidoController.cadastrarPedido(pedido);
            pedido = PedidoController.buscarPedidoPorId(id);

            System.out.println("DADOS\n\n\n");
            System.out.println(pedido);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
