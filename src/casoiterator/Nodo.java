/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author naty9
 */
public class Nodo {
    private int dato;
    private List<Nodo> anteriores;  
    private List<Nodo> posteriores; 

    public Nodo(int dato) {
        this.dato = dato;  
        this.anteriores = new ArrayList<>();    
        this.posteriores = new ArrayList<>(); 
    } 

    public void setAnteriores(List<Nodo> anteriores) {                    
        this.anteriores = anteriores;                
    }     
    
    public List<Nodo> getAnteriores() {
        return anteriores;
    }
    
    public void addAnteriores(Nodo anterior) {                    
        if (anterior == null) {                        
            anteriores = new ArrayList<>();                    
        }                    
        anteriores.add(anterior);                
    }   
    
    public void setPosteriores(List<Nodo> posteriores) {                    
        this.posteriores = posteriores;                
    }     
    
    public List<Nodo> getPosteriores() {
        return posteriores;
    }
    
    public void addPosteriores(Nodo posterior) {                    
        if (posterior == null) {                        
            posteriores = new ArrayList<>();                    
        }                    
        posteriores.add(posterior);                
    }   
                  
    public String toString() {                    
        return "Nodo(" + "dato=" + dato + ")";                
    }                

}
