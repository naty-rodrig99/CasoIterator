/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoiterator;

/**
 *
 * @author naty9
 */
public class CasoIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo adyacente1 = new Nodo(1);
        Nodo adyacente2 = new Nodo(2);
        Nodo adyacente4 = new Nodo(4);
        Nodo adyacente5 = new Nodo(5);
        Nodo adyacente7 = new Nodo(7);
        Nodo adyacente10 = new Nodo(10);
        Nodo principal3 = new Nodo(3);
        Nodo principal6 = new Nodo(6);
        Nodo principal9 = new Nodo(9);
        
        adyacente1.addPosteriores(principal3);
        adyacente2.addPosteriores(adyacente7);
        
        principal3.addAnteriores(adyacente1);
        principal3.addAnteriores(adyacente2);
        principal3.addPosteriores(adyacente4);
        principal3.addPosteriores(adyacente5);
        
        adyacente4.addAnteriores(principal3);
        adyacente4.addPosteriores(principal6);
        adyacente5.addAnteriores(principal3);
        adyacente5.addPosteriores(principal6);
        
        principal6.addAnteriores(adyacente4);
        principal6.addAnteriores(adyacente5);
        principal6.addPosteriores(adyacente7);
        
        adyacente7.addAnteriores(principal6);
        adyacente7.addPosteriores(principal9);
        
        principal9.addAnteriores(adyacente7);
        principal9.addPosteriores(adyacente10);
        
        Arbol arbol = new Arbol();
        arbol.addNodo(adyacente1);
        arbol.addNodo(adyacente2);
        arbol.addNodo(principal3);
        arbol.addNodo(adyacente4);
        arbol.addNodo(adyacente5);
        arbol.addNodo(principal6);
        arbol.addNodo(adyacente7);
        arbol.addNodo(principal9);
        arbol.addNodo(adyacente10);
        
        IIterator<Nodo> nodoIterator = arbol.createIterator();
        while (nodoIterator.hasNext()) {
            Nodo nodo = nodoIterator.next();
            System.out.println("nodo > " + nodo.toString());
        }
    }   
}
