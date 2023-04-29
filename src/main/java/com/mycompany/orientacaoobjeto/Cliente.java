/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orientacaoobjeto;

/**
 *
 * @author stephane.cramagdesia
 */
public class Cliente {
    private int idCliente;
    private String nomeCliente;
    
    public Cliente(int id,String nome){
        this.idCliente = id;
        this.nomeCliente = nome;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public void setIdCliente(int id){
        this.idCliente = id;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }
    
    public void mostrarCliente(){
        System.out.println("Cod.Cliente: "+getIdCliente()+" - "+"Nome: "+getNomeCliente());
    }
}
