/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxectocadrado;

/**
 *
 * @author nvarela
 */
public class Cadrado {
    private int lado;
    
    //construtor por defecto

    /**
     * Construtor por defecto
     */

    public Cadrado() {
        this.lado=0;
    }
    
    //construtor cun parámetro
    public Cadrado(int lado) {
        this.lado = lado;
    }
    
    //getter de lado
    public int getLado() {
        return lado;
    }
    //setter de lado
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cadrado{" + "lado=" + lado + '}';
    }
    
    
    
}
