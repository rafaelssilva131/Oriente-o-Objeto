/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orientacaoobjeto;

/**
 *
 * @author stephane.cramagdesia
 */
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private double precoProduto;
    
    public Produto(int id,String nome, double preco){
        this.idProduto= id;
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    
    public void mostrarProduto(){
        System.out.println("Codigo: "+getIdProduto());
        System.out.println("Nome: "+getNomeProduto());
        System.out.println("Preço: "+getPrecoProduto());
    }
}
