package pkg9.descdiasemana;

import java.util.Scanner;

public class DescDiaSemana {

    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
      
        System.out.println("Introduzca la temperatura en Celsius: ");
        int temperatura = input.nextInt();
        
        if (temperatura <= 10 ) {
            System.out.println("El clima es frío.");
        } else if (temperatura <= 20) {
            System.out.println("El clima es nublado.");
        } else if (temperatura <= 30) {
            System.out.println("El clima es caluroso.");
        } else if (temperatura > 30) {
            System.out.println("El clima es tropical.");
        } 
        }
        
    }
