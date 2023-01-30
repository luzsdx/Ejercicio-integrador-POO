/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPOO;

/**
 *
 * @author luzsd
 */
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    public Persona(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    public String nombreCompleto(){
    return nombre+" "+apellido;
    }

}
