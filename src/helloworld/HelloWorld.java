/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
import java.util.Scanner;

/**
 *
 * @author nguillard
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Exo 
        System.out.println("Bonjour");
        System.out.println("tout le monde");*/
        
        //Exo 4//
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        
        System.out.println("Choisissez une valeur pour x : ");
        x = sc.nextInt();
        System.out.println("Choisissez une valeur pour y : ");
        y = sc.nextInt();
        z = y;
        
        System.out.println("Avant la permutation : x = " + x + " y = " + y);
        y = x;
        System.out.println("Apres la permutation : x = " + z + " y = " + y);
        
    }
    
}
