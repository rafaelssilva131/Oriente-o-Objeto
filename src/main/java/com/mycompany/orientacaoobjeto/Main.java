/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.orientacaoobjeto;

/**
 *
 * @author stephane.cramagdesia
 */
public class Main {

    public static void main(String[] args) {
        Produto oP1 = new Produto(1,"Pote", 18.50);
        Produto oP2 = new Produto(2,"Pao", 118.50);
        Produto oP3 = new Produto(3,"Torrada", 8.50);
        Produto oP4 = new Produto(4,"Computador", 5.00);
        Produto oP5 = new Produto(5,"Ice", 50.00);
        
        Pedido oPed1 = new Pedido();
        oPed1.setNumPedido(23);
        oPed1.setClientePedido(new Cliente(131,"Rafael"));
        oPed1.incluirItem(6, oP1, 5);
        oPed1.incluirItem(7, oP2, 2);
        oPed1.incluirItem(8, oP3, 1);
        oPed1.incluirItem(9, oP4, 3);
        oPed1.incluirItem(5, oP5, 10);
        
        oPed1.gerarPedido();
        
    }
}
