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
        //Estas son pruebas no estan buenas
        Nodo nodos = new Nodo(3, 4,    
                        new Nodo(1, 2),
                        new Nodo(2, 2),
                        new Nodo(4, 2, 
                            new Nodo(6, 4,
                               new Nodo(7, 2,
                                    new Nodo(9, 4,
                                       new Nodo(10, 2)
                                    )
                                )
                            )
                        )
        );
        
        Nodo nodos2 = new Nodo(10, 2,
                        new Nodo(9, 4,
                            new Nodo(7, 2,
                                new Nodo(6, 4,
                                    new Nodo(3, 4,
                                        new Nodo(4, 2),
                                        new Nodo(5, 2),
                                        new Nodo(2, 2),
                                        new Nodo(1, 2)
                                    )
                                )
                            )
                        )
        );
        

        IIterator<Nodo> nodoIterator = nodos.createIterator();
        
        while (nodoIterator.hasNext()) {
            Nodo nodo = nodoIterator.next();
            System.out.println("nodo > " + nodo.toString());
        }
    }
    
}
