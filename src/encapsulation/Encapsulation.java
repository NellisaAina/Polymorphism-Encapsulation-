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
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        protonX70 x7 = new protonX70();
        
        System.out.println("Proton X70 features :");
        //x70 class
        x7.setSpecialFeatures("Auto Drive");
        System.out.println("Special Features: " + x7.getDrive());
        //proton class
        x7.setFeatures("Up/Down" , "On/Off");
        System.out.println("Windows: " + x7.getWindows());
        System.out.println("Headlights: " + x7.getHeadlights());
        x7.tyre();
        x7.color("Colour: Red", ",Black");
        
        x7.setRadio("Sony");
        System.out.println("Radio Brand: " + x7.getRadio());
        x7.run();
        
        protonX50 x5 = new protonX50();
        
        System.out.println("\nProton X50 features :");
        //x50 class
        x5.setSpecialFeatures("Auto Parking");
        System.out.println("Special features: " + x5.getParking());
       //proton class
        x5.setFeatures("Up/Down" , "On/Off");
        System.out.println("Windows: " + x5.getWindows());
        System.out.println("Headlights: " + x5.getHeadlights());
        x5.tyre();
        x5.color("Colour: Red", ",Blue");
        
        x5.setKey("Auto key");
        System.out.println("Extra Features: " + x5.getKey());
        x5.run();
        
        protonSaga s = new protonSaga();
        
        System.out.println("\nProton Saga features :");
        //saga class
        s.setSpecialFeatures("Fuel efficient");
        System.out.println("Special features: " + s.getFuel());
       //proton class
        s.setFeatures("Up/Down" , "On/Off");
        System.out.println("Windows: " + s.getWindows());
        System.out.println("Headlights: " + s.getHeadlights());
        s.tyre();
        s.color("Colour: Red", ",White");
        
        s.setRadio("Kenwood");
        System.out.println("Radio brand: "+ s.getRadio());
        s.run();
        
        protonPesona p = new protonPesona();
        
        System.out.println("\nProton Pesona features :");
        //pesona class
        p.setSpecialFeatures(150);
        System.out.println("Special features: " + p.getSpace());
       //proton class
        p.setFeatures("Up/Down" , "On/Off");
        System.out.println("Windows: " + p.getWindows());
        System.out.println("Headlights: " + p.getHeadlights());
        p.tyre();
        p.color("Colour: Red", ",Black");
        
        p.setRadio("Kenwood");
        System.out.println("Radio brand: " +p.getRadio());
        p.run();
    }
}
