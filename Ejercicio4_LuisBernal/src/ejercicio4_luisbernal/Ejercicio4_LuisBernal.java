/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_luisbernal;

import java.io.IOException;

/**
 *
 * @author vergo_000
 */
public class Ejercicio4_LuisBernal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        while (System.in.available() == 0) {
            int rand = (int) (Math.random() * 6) + 1;
         System.out.println("Presione enter para salir del ciclo");
            System.out.println(rand);

    }
    
}
}
