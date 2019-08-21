/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.model;

/**
 *
 * @author isaia
 */
public class Fila {
    private Object[] elementos;
    private int tamanho, capFila;
    private Object prim, ult, prox;
    
    public Fila(int capacidade){
        elementos = new Object[capacidade];
        this.tamanho = 0;
        capFila = capacidade;
        
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
    
    public void dequeue(){
        for(int i = 0; i < this.tamanho; i++){
            
            this.elementos[i] = this.elementos[i+1];   
        }
        this.prim = elementos[0];
        this.tamanho--;
    }
    
    public int size(){
        return this.tamanho;
    }
    
    public boolean isEmpty(){
        return this.tamanho == 0;
    }
    
    public boolean isFull() throws Exception{
        return this.tamanho == capFila;
    }
    
    public Object front(){
        return this.prim;
    }
    
    public Object getProx(){
        if(isEmpty()){
           return isEmpty();
        }else{
            this.prox = this.elementos[1];
            return this.prox;
        }
    }
}
