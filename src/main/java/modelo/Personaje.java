/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dremi7w7
 */
public class Personaje {
    private String nombre; 
    private String poder; 
    private String transporte; 
    private String universo; 
    private int edad; 

    public Personaje(String nombre, String poder, String transporte, String universo, int edad) {
        this.nombre = nombre;
        this.poder = poder;
        this.transporte = transporte;
        this.universo = universo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPoder() {
        return poder;
    }

    public String getTransporte() {
        return transporte;
    }

    public String getUniverso() {
        return universo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", poder=" + poder + 
                ", transporte=" + transporte + ", edad=" + edad + ", universo=" + universo + '}';
    }


    
    
    
    
    
    
    
    
    
    
    
}
