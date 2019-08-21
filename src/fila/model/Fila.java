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
    private Object prim, ult;
    
    public Fila(int capacidade){
        elementos = new Object[capacidade];
        this.tamanho = 0;
        capFila = capacidade;
        
    }
    
    public void enqueue(Object elemento) throws Exception{
        if(this.tamanho == 0){
            this.elementos[tamanho] = elemento;
            tamanho++;
        }else{
            this.elementos[tamanho] = elemento;
        }   tamanho++;
    }
    
    public Object dequeue(){
        
        return null;
    }
    
    public int size(){
        return this.tamanho;
    }
    
    public boolean isEmpty(){
        return this.tamanho == 0;
    }
    
    public boolean isFull(){
        return this.tamanho == capFila;        
    }
}
