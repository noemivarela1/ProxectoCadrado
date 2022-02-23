/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxectocadrado;

/**
 *
 * @author nvarela
 */
public class ProxectoCadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cadrado cadrado1=new Cadrado();
        
        System.out.println("cadrado1: "+cadrado1.toString());
        cadrado1.setLado(5);
        System.out.println("cadrado1: "+cadrado1.toString());
        
        Cadrado cadrado2=new Cadrado(15);
            System.out.println("cadrado2: "+cadrado2.toString());
    }
    
}
