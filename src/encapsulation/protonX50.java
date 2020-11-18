/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author user
 */
public class protonX50 extends proton{
    private String parking, key;
    
    //Encapsulation
    public void setSpecialFeatures(String newParking){
        parking = newParking;
    }
    
    public String getParking(){
        return parking;
    }
   
    public void setKey(String newKey){
        key = newKey;
    }
    
    public String getKey(){
        return key;
    }
    
    //polymorphism
    void tyre(){
        System.out.println("Tyres Brand :-");
        super.tyre();
    } 
    
    void run(){
        System.out.println("Proton X50 is running safely.");
        super.run();
    }
}
