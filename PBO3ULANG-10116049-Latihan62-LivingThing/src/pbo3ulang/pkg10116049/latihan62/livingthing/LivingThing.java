/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan62.livingthing;

/**
 *
 * @author ibadguthwara
 */
public abstract class  LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println("Bernafas");
        
    }
    
    public void eat(String nama){
        System.out.println("Makan");
        
    }
    
}
