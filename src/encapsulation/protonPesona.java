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
public class protonPesona extends proton {
    private int space;
    private String radio;
    
    //Encapsulation
    public void setSpecialFeatures(int newSpace){
        space = newSpace;
    }
    
    public int getSpace(){
        return space;
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
        System.out.println("Proton Pesona is running safely");
        super.run();
    }
    
    void color(String colour1,String colour2) {
		System.out.println(colour1 + colour2);
	}
}
