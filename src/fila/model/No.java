/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.model;


public class No {
    
    private Object elemento;
    private No prox;
    
    public Object getElemento(){
        return elemento;
    }
    
    public void setElemento(Object elemento){
        this.elemento = elemento;
    }
    
    public No getProx(){
        return prox;
    }
    
    public void setProx(No prox){
        this.prox = prox;
    }
}
