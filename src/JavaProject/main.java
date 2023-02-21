/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProject;
import java.util.Scanner;

/**
 *
 * @author 3w0o
 */
public class main {
     public static void main(String[] args) {
        Tv t1 = new Tv(2000, "LG");
        Tv t2 = new Tv(3000, "Samsung");
        
       // this is for the 2 tv that we have int for the price and sting for the maker 
        
        
        Oven o1 = new Oven(7500,"bosch","gas","oil");
        Oven o2 = new Oven(9000,"LG","electro","oil");
        // for the 2 ovens and a bit differeant we have the gas which is the powersource and the oil which is the cockWay
        
       
        Scanner in = new Scanner(System.in);
        // a scanner so the user can use the program
        System.out.println("welcome to our store:"
                + " what would you like to buy.TV or Oven");
        // char will only thake the first letter from TV and OVEN
        char buy = in.next().charAt(0);
        //so the cheapest option in this store is 2000 for the tv if u have less than 2000 it will say that you dont have the money
        System.out.println("how much do you have? ");
        int money = in.nextInt();
        
        if(money<2000){
            System.out.println("Sorry your money is not enough.");
        }
        else { // and if he has the money it will give him these options 
            if (buy =='T'|| buy =='t'){
                System.out.println("the first one :");
                t1.Remotecontroller();
                System.out.println("The second one");
                t2.Remotecontroller();
                System.out.println("choose 1/2");
                int i = in.nextInt();
                System.out.println("Thank you for visting us at the store we hope you a good day.");
            }
            if(buy =='O'|| buy =='o'){
                System.out.println("the first one :");
                
               o1.cockmethod();
               o1.getenergysource();
               System.out.println("The second one");
               o2.cockmethod(); 
               System.out.println("choose 1/2");
               int l = in.nextInt();
               System.out.println("Thank you for visting us at the store we hope you a good day.");
            }
        }
    }
}
