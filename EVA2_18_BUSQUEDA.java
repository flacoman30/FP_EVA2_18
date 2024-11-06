/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA2_18_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos={10,50,85,73,11,25,43,5,0,6};
        int valor,posi=-1;
        Scanner captu = new Scanner(System.in);
        System.out.println("VALOR A BUSCAR");
        valor = captu.nextInt();
        for (int i = 0;i<datos.length;i++){
                if(valor == datos[i])
                    //reguesa la posicion
                    posi = i;
                //apagalo oton
                break;
        
        }if(posi == -1){
       System.out.println("valor no encontado");
        }else{ 
       System.out.println("valor  encontado papu");
 
        }
    
     }
    
    
}
