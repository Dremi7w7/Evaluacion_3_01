/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Personaje;
import servicio.PersonajeServicio;

/**
 *
 * @author Dremi7w7
 */
public class PersonajeControl {
    
    private final PersonajeServicio personajeServicio = new PersonajeServicio();
    
    public Personaje crear(String [] params){
    
        var personaje = new Personaje(params[0],params[1],params[2],params[4],Integer.valueOf(params[3])); 
              
        this.personajeServicio.crear(personaje);
        return personaje;
    }
    
    
    
    public List<Personaje> listar(){
        return this.personajeServicio.listar();
    }
    
    
}
