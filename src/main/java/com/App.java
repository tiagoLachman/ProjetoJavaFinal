package com;

import com.controller.*;
import com.model.*;


public class App {
    public static void main( String[] args ) {
        Cliente cliente = new Cliente("tiago","asd",101,"101", "asd", "asd", "@asd", 123, "asd");
        Funcionario funcionario = new Funcionario("asd","asd",101,"101", "asd", "asd", "@asd", 123, 123,"asd");
        Produto produto = new Produto("teclado", 1, 2.0, "asd");

        try {
            ProdutoController.alterarProduto(1, produto);
        } catch (Exception e) {
            System.out.println("erro ao salvar " + e.getMessage());
        }
    }
}
