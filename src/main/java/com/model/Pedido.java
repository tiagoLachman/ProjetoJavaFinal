package com.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.*;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double valorTotal;
    private LocalDateTime dataPedido;
    private Double desconto = 0.00;

    @OneToMany

    private Cliente cliente;
    HashMap<Produto, Integer> produtos = new HashMap<>();

    public Pedido(double valorTotal, LocalDateTime dataPedido, Double desconto) {
        this.valorTotal = valorTotal;
        this.dataPedido = dataPedido;
        this.desconto = desconto;
    }

    public void addProduto(Produto p, int qnt) {
        produtos.put(p, qnt);
    }

    public Integer getQuantidade(Produto p) {
        if (!produtos.containsKey(p))
            return null;
        return produtos.get(p);
    }

    public Produto getProdutoByIndex(int index) {
        if (produtos.size() < index)
            return null;
        return new ArrayList<Produto>(produtos.keySet()).get(index);
    }

    public Integer getQuantidadeByIndex(int index) {
        if (produtos.size() < index)
            return null;
        return new ArrayList<Integer>(produtos.values()).get(index);
    }

    public Pedido() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public HashMap<Produto, Integer> getProdutos() {
        return produtos;
    }

    public void setProdutos(HashMap<Produto, Integer> produtos) {
        this.produtos = produtos;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

}
