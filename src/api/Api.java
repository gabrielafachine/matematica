/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

/**
 *
 * @author Nyl
 */
public class Api {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conjunto<String> a = new Conjunto<>();
       a.elementos.add("a");
       a.elementos.add("b");
       Conjunto<String> b = new Conjunto<>();
       b.elementos.add("a");
       b.elementos.add("b");
       b.elementos.add("c");
       b.elementos.add("d");
       
      // Conjunto<String> c = b.subtracao(a);
       Conjunto<Tuple> c = a.produto(b);
        for (Tuple t : c.elementos) {
            System.out.println(t.a.toString());
             System.out.println(t.b.toString()+"\n");    
        }
    }
}
