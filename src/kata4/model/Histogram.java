/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.model;

import java.util.*;

public class Histogram <Key>{
    
    private final Map<Key, Integer> map;
    
    
    public Histogram(){
        map = new HashMap<>();
    }
    
    public int get(Key obj){
        return map.get(obj);
    }
    
    public Set<Key> keySet(){
        return map.keySet();
    }
    
    public void increment(Key obj){
       //Comment
       map.put(obj, map.containsKey(obj)? map.get(obj)+ 1 : 1); 
    }
    
}
