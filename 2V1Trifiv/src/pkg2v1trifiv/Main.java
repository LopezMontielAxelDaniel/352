/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2v1trifiv;
 
import java.util.Scanner;

/**
 *
 * @author axell
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    System.out.println("INGRESE EL NUMERO");
    int num = sc.nextInt();
    
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("TriFiv");
        } else if(num % 3 == 0) {
            System.out.println("Tri");
        } else if(num % 5 == 0) {
            System.out.println("Fiv");
        } else {
            System.out.println("El número no es múltiplo de 3 ni de 5");
        }
    }
    