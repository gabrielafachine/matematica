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
    public boolean continencia(Conjunto<T> conj){
        int cont=0;
        for (T t : elementos) {
            for (T c : conj.elementos) {
                if (t.equals(c)){
                 cont++;   
                }
            }
            
        }
        return (cont==elementos.size()) ?  true :  false;
        
    }
    
   public Conjunto<T> uniao (Conjunto<T> conj){
       Conjunto<T> uniao = new Conjunto<>();
        for(T e : elementos){
            uniao.elementos.add(e);
        }
        Conjunto<T> maior;
        Conjunto<T> menor;
        if (conj.elementos.size() < uniao.elementos.size()){
            maior=conj;
            menor=uniao;
        }
        else{
            maior=uniao;
            menor=conj;
        }
       for (T t : menor.elementos) {
            if(!maior.pertinecia(t)){    
                maior.elementos.add(t);
            }
       }
       return (Conjunto<T>)uniao;
   }
   public Conjunto<T> intersecao(Conjunto<T> conj){
       Conjunto<T> intersecao= new Conjunto<>();
        Conjunto<T> maior;
        Conjunto<T> menor;
        if (conj.elementos.size() > this.elementos.size()){
            maior=conj;
            menor=this;
        }
        else{
            maior=this;
            menor=conj;
        }
       for (T t : menor.elementos) {
            if(maior.pertinecia(t)){    
                intersecao.elementos.add(t);
            }
       }
       return intersecao;
   }
   public Conjunto<T> subtracao(Conjunto<T> conj){
       Conjunto<T> intersecao = this.intersecao(conj);
       Conjunto<T> subtracao = new Conjunto<>();
        for(T e : elementos){
            subtracao.elementos.add(e);
        }       
       for (T t : intersecao.elementos) {
           subtracao.elementos.remove(t);
       }
       return subtracao;
       
   }
   
   public Conjunto<T> produto(Conjunto<T> conj){
       Conjunto<T> intersecao = this.intersecao(conj);
       Conjunto<T> subtracao = new Conjunto<>();
        for(T e : elementos){
            subtracao.elementos.add(e);
        }       
       for (T t : intersecao.elementos) {
           subtracao.elementos.remove(t);
       }
       return subtracao;
       
   }   
}
