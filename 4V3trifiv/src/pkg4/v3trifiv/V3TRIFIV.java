package pkg4.v3trifiv;


import java.util.Scanner;
public class V3TRIFIV {

  
    public static void main(String[] args) {
    //Declaracion de variables 
    Scanner entrada = new Scanner(System.in);
    int numero;
    //Entrada de datos
    System.out.println("Dame el numero");
numero = entrada.nextInt();
//Salida de datos
System.out.println(retornaMultiplo(numero));
    }
    public static String retornaMultiplo( int num ){
  
    
     
          // declaracion de datos
          int mult3;
          int mult5;
          //proceso de datos
          mult3 = num % 3;
          mult5 = num % 5;
          // salida de datos 
          if ( mult3 == 0 && mult5 == 0){
              return " TriFiv";
          } else if (mult3 == 0){
              return " Tri";
          } else if ( mult5 == 0){
              return "Fiv";
          }
          return "ningun caso";
                
         
                
    }
}
