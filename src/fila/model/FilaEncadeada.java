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
public class FilaEncadeada {
    public No prim;
    public No ult;
    public int tamanho;
    
    public FilaEncadeada(){
        this.prim = null;
        this.ult = null;
        this.tamanho = 0;
    }
    
    public void inserirFila(Object elemento){
        No novo = new No();
        novo.setElemento(elemento);
        novo.setProx(null);
        
        if(this.prim == null){
            this.prim = novo;
        }else{
            ult.setProx(novo);
        }
        this.ult = novo;
        this.tamanho++;     
    }
    public String SairFila() throws Exception{
        No elemento = null;
        if(this.tamanho == 0){
            throw new Exception("Fila Vazia");
        }
        else if(this.prim.equals(this.ult)){
            elemento = this.ult = prim.getProx();
        }
        this.prim = prim.getProx();
        this.tamanho--;
        return String.valueOf(elemento);
    
    }
}
