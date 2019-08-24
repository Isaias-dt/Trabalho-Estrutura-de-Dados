/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.model;

import java.util.Arrays;

/**
 *
 * @author isaia
 */
public class Fila {
    private Object[] elementos;
    private int tamanho;
    private Object prim, ult, prox, senhaPassada;
    
    public Fila(int capacidade){
        elementos = new Object[capacidade];
        this.tamanho = 0;
    }
    
    public void enqueue(Object elemento){
        if(this.tamanho == 0){
            this.prim = this.elementos[tamanho] = elemento;
            tamanho++;
        }else{
            this.elementos[tamanho] = elemento;
            tamanho++;
        }    
    }
    //Erro quando a lista esta cheia gera um erro apos apagar.
    public void dequeue(){
        //Gravando valor do primeiro elemento na variável para não perder.
        this.senhaPassada = this.prim;
        for(int i = 0; i < this.tamanho; i++){
            if(i < elementos.length-1)
                this.elementos[i] = this.elementos[i+1];
            else
                this.elementos[i] = null;
                
        }
        this.prim = this.elementos[0];
        this.tamanho--;
    }
    //Retorna tamanho da Fila.
    public int size(){
        return this.tamanho;
    }
    //Retorna se  Fila está Vazia ou não.
    public boolean isEmpty(){
        return this.tamanho == 0;
    }
    //Retorna se a Fila está cheia ou não.
    public boolean isFull() throws Exception{
        return this.tamanho == this.elementos.length;
    }
    //Retorna o primeiro elemento da fila).
    public Object front(){
        return this.prim;
    }
    //Retorna o segundo elemento da fila;
    public Object getProx(){
        if(isEmpty()){
           return null;
        }else{
            this.prox = this.elementos[1];
            return this.prox;
        }
    }
    //Retorna o elemento que acabou de sair da fila.
    public Object getSenhaPassada(){
        return this.senhaPassada; 
    }
    
    //Exibi itens da lista com toString sobrescrevendo com @Override.    
    @Override
    public String toString(){
        return Arrays.toString(elementos);
    }
    //Retorna elemento na tabela.
    public Object exibeElementoTbl(){
        return elementos[this.tamanho-1];     
    }
}
