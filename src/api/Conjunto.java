/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.awt.List;
import java.util.ArrayList;
import sun.net.www.content.text.Generic;
import sun.org.mozilla.javascript.internal.ObjArray;

/**
 *
 * @author Nyl
 */
public class Conjunto <T> implements Comparable {
    ArrayList<T> elementos;
    public Conjunto(){
        elementos =  new ArrayList<>();
    }
    public boolean pertinecia(T ele){
        for (T t : elementos) {
            if(t.equals(ele))
                return true;
        }
         return false;
    }
    @Override
    public int compareTo(Object o) {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
