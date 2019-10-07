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
public class Arbol implements IContainer<Nodo>{           
    private List<Nodo> nodos;  
    
    public Arbol() {
        this.nodos = new ArrayList<Nodo>();                
    }      

    public List<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(List<Nodo> nodos) {
        this.nodos = nodos;
    }
    
    public void addNodo(Nodo nodo){
        nodos.add(nodo);
    }
    
    @Override                
    public IIterator<Nodo> createIterator() {
        return new TreeNodoIterator();
    }                            
    
    private class TreeNodoIterator implements IIterator<Nodo> {                  
        private int index = 0;   
        
        public TreeNodoIterator() {                        
        
        }
                                      
        @Override                    
        public boolean hasNext() {                        
            if (index >= nodos.size()) {                            
                return false;                        
            }
            return index < nodos.size();
        }
        
        @Override                    
        public Nodo next() {                        
            if (!hasNext()) {                            
                throw new RuntimeException("No hay más elementos");                        
            }
            return nodos.get(index++);                    
        }                
    }                            
    
    
    
}
