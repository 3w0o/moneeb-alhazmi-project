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
public class Tv extends Electronics  {
      public Tv(int a, String b) {
        super(a, b);
        
        // the tv class taks the maker and the price 
    }
    
    public void Remotecontroller(){
        System.out.println("The TV made by "+ maker +" which costs " + Price +" is operated by remote control only.");
    }
}
