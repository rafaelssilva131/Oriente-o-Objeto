/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orientacaoobjeto;

/**
 *
 * @author stephane.cramagdesia
 */
public class Pedido {
    private int numPedido;
    private Item itemPedido[] = new Item[5];
    private Cliente clientePedido;
    private int proximo = 0;

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }

    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }
    
    public void incluirItem(int id, Produto p, double q){
        if(proximo<5){
            itemPedido[proximo] = new Item(id,p,q);
            proximo++;
        }else {
            System.out.println("Pedido maior doque cinco");
        }
    }
    public void gerarPedido(){
        double total = 0;
        System.out.println("----------------------------- Pedido SENAC -----------------------------");
        System.out.println("Numero Pedido: "+getNumPedido());
        getClientePedido().mostrarCliente();
        System.out.println("------------------------------------------------------------------------");
        for(int i = 0; i< itemPedido.length;i++){
            if(itemPedido[i] != null){
                System.out.println(itemPedido[i].getProduto().getNomeProduto()+"\t"+itemPedido[i].getQuantidade()+"\t"+itemPedido[i].calcularTotal());
                total += itemPedido[i].calcularTotal();
            }
        }
        System.out.println("Total:\t"+total);
    }
}
