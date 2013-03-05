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
       if(a.pertinecia("c"))
           System.out.print("certo");
        else
            System.out.print("errado");
    }
}
