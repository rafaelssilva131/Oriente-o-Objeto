/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orientacaoobjeto;

/**
 *
 * @author stephane.cramagdesia
 */
public class Item {
    private int idItem;
    private Produto produto;
    private double quantidade;
    
    
    public Item(int id,Produto produto,double quantidade){
        this.idItem = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public double calcularTotal(){
        return getQuantidade()*(getProduto()).getPrecoProduto();
    }
    
}
