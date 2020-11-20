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
public class protonSaga extends proton{
    private String fuel, radio;
    
    //Encapsulation
    public void setSpecialFeatures(String newFuel){
        fuel = newFuel;
    }
    
    public String getFuel(){
        return fuel;
    }
    
    public void setRadio(String newRadio){
        radio = newRadio;
    }
    
    public String getRadio(){
        return radio;
    }
    
    //polymorphism
    void tyre(){
        System.out.println("Tyres Brand :-");
        super.tyre();
    } 
    
    void run(){
        System.out.println("Proton Saga is running safely");
        super.run();
    }
    
    void color(String colour1,String colour2) {
		System.out.println(colour1 + colour2);
	}
}
