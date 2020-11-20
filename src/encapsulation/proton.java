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
public class proton {
    private String windows, headlights;
    
    //Encapsulation
    public void setFeatures(String newWindows, String newHeadlights){
        windows = newWindows;
        headlights = newHeadlights;
    }
    
    public String getWindows(){
        return windows;
    }
    
    public String getHeadlights(){
        return headlights;
    }
    
    //polymorphism
    void tyre(){
        System.out.println("    Dunlop");
    }
    
    void run(){
        System.out.println("Vehicle is running.");
    }
    
    void sum(int base, long standard){
        System.out.println(base + standard);
    }
    
    void sum(int base, int executive, int premium){
        System.out.println(base + executive + premium);
    }
}
