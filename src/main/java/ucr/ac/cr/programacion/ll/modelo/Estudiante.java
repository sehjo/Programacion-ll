/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.programacion.ll.modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
 
    private String carnet;
    private String nombre;
    
     public Estudiante(){
           this.carnet = "X0000";
           this.nombre = "none";
    
    }//fin del constructor
    
    public Estudiante(String carnet, String nombre){
           this.carnet = carnet;
           this.nombre = nombre;
    
    }//fin del constructor

    
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
