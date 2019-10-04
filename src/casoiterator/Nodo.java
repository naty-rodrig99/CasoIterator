/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author naty9
 */
public class Nodo implements IContainer<Nodo>{
    private int dato;            
    private int punteros;
    private List<Nodo> subordinates;  
    
    public Nodo(int dato,int puntero, Nodo... subordinates) {
        this.dato = dato;  
        this.punteros = puntero;
        this.subordinates = Arrays.asList(subordinates);                
    }                            
    
    @Override                
    public IIterator<Nodo> createIterator() {
        return new TreeNodoIterator();
    }                            
    
    private class TreeNodoIterator implements IIterator<Nodo> {
        private LinkedList<Nodo> list = new LinkedList<Nodo>();                    
        private int index = 0;   
        
        public TreeNodoIterator() {                        
            addRecursive(Nodo.this);                    
        }
        
        public void addRecursive(Nodo nodo) {
            list.add(nodo);                        
            
            if (nodo.getSubordinates() != null) {                            
                for (Nodo subordinate : nodo.getSubordinates()) {
                    addRecursive(subordinate);                            
                }                        
            }                    
        }                                
        
        @Override                    
        public boolean hasNext() {                        
            if (list.isEmpty()) {                            
                return false;                        
            }
            return index < list.size();
        }
        
        @Override                    
        public Nodo next() {                        
            if (!hasNext()) {                            
                throw new RuntimeException("No hay más elementos");                        
            }
            return list.get(index++);                    
        }                
    }                            
    
    public void setSubordinates(List<Nodo> subordinates) {                    
        this.subordinates = subordinates;                
    }                            
    
    public void addSubordinate(Nodo subordinate) {                    
        if (subordinate == null) {                        
            subordinates = new ArrayList<>();                    
        }                    
        subordinates.add(subordinate);                
    }                            
    
    @Override                
    public String toString() {                    
        return "Nodo(" + "dato=" + dato + ", punteros=" + punteros+ ")";                
    }                

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public int getPunteros() {
        return punteros;
    }

    public void setPunteros(int punteros) {
        this.punteros = punteros;
    }


    public List<Nodo> getSubordinates() {
        return subordinates;
    }
    
    
}
