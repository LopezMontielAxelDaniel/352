/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.banderas;

/**
 *
 * @author axell
 */
public class Banderas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int edadJuan = 22; 
    int edadpedro = 20;
    boolean bandera1;
        boolean banderal = edadJuan > edadpedro;
    System.out.println( "Resultado de bandera: " + banderal );
    int edadLupe = 35;
    boolean bandera2;
    boolean bandera3;
            bandera2 = (edadLupe < edadpedro);
        bandera3 = ( banderal && bandera2 );
        System.out.println ("Resultado de bandera 3: " + bandera3);
        
                
            
    }
  
    
    
    }


