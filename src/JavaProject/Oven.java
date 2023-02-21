/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject;

/**
 *
 * @author 3w0o
 */


// this oven calls bequeathed and impelemnt the kitchenware class 
public class Oven extends Electronics implements KitchenWare {
     String energysource;  // its a sting to know what is the energy that is used
    String cookway;    // its a sting to know how to cock it

    
    // this is the object which is the oven for this one
    public Oven(int a, String b, String c, String d) {
        super(a, b); // a and b we took it from the electronics (bequeathed)
        energysource = c;
        cookway =d;
    }
    

    
   
    @Override
   public String getenergysource(){
      
    return energysource;    
    }

    @Override
    public void cockmethod() {
        System.out.println("The Oven made by "+ maker +" which costs "+ Price +" is using " + energysource +" to cock food using " + cookway);
     
    }
}
