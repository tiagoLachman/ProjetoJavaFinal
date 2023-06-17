package com.controller;

import java.util.List;

import com.dal.PedidoDao;
import com.model.Pedido;

public abstract class PedidoController {

    public static void cadastrarPedido(Pedido pedido) throws Exception {
        try {
            PedidoDao.cadastrarPedido(pedido);
        } catch (Exception e) {
            throw new Exception("Erro ao cadastrar pedido, CAUSA:" + e.getMessage());
        }
    }

    public static void alterarPedido(Pedido pedido) throws Exception {
        try {
            if(PedidoDao.buscarPedido(pedido.getId()) != null){
                PedidoDao.alteraPedido(pedido);
            }
        } catch (Exception e) {
            throw new Exception("Erro ao alterar pedido, CAUSA:" + e.getMessage());
        }
    }

    public static void deletarPedido(int id) throws Exception {
        try {
            if(PedidoDao.buscarPedido(id) != null){
                PedidoDao.deletaPedido(PedidoDao.buscarPedido(id));
            }
        } catch (Exception e) {
            throw new Exception("Erro ao deletar pedido, CAUSA:" + e.getMessage());
        }
    }

    public static List<Pedido> listarPedidos() throws Exception {
        try {
            return PedidoDao.listarPedidos();
        } catch (Exception e) {
            throw new Exception("Erro ao listar pedido, CAUSA:" + e.getMessage());
        }
    }

    public static Pedido buscarPedidoPorId(int id) throws Exception {
        try {
            if(id == 0) throw new Exception();
            return PedidoDao.buscarPedido(id);      
        } catch (Exception e) {
            throw new Exception("Erro ao buscar pedido, CAUSA:" + e.getMessage());
        }
    }

    public static List<Pedido> buscarPedidoPorNome(String nome) throws Exception {
        try {
            return PedidoDao.buscarPedidoPorNome(nome);      
        } catch (Exception e) {
            throw new Exception("Erro ao buscar pedido, CAUSA:" + e.getMessage());
        }
    }
}
