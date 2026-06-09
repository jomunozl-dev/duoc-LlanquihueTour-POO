package model;

/**
 * Clase base que representa una persona vinculada a la empresa.
 *
 * Una persona posee datos básicos como rut, nombre y dirección.
 *
 * @author Jorge Munoz Leon
 * @version 1.0
 */
public class Persona {

    private String rut;
    private String nombre;
    private Direccion direccion;

    /**
     * Constructor de la clase Persona.
     *
     * @param rut Rut de la persona.
     * @param nombre Nombre de la persona.
     * @param direccion Dirección de la persona.
     */
    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    /**
     * Obtiene el rut.
     *
     * @return Rut de la persona.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Modifica el rut.
     *
     * @param rut Nuevo rut.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Obtiene el nombre.
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección.
     *
     * @return Dirección de la persona.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección.
     *
     * @param direccion Nueva dirección.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Retorna la información de la persona.
     *
     * @return Datos de la persona.
     */
    @Override
    public String toString() {
        return "Rut: " + rut
                + ", Nombre: " + nombre
                + ", Dirección: [" + direccion + "]";
    }
}