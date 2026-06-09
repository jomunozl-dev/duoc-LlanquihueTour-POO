package model;

/**
 * Clase que representa a un empleado de la empresa.
 *
 * Hereda los atributos de Persona y agrega un cargo.
 *
 * @author Jorge Munoz Leon
 * @version 1.0
 */

public class Empleado extends Persona {

    private String cargo;

    /**
     * Constructor de la clase Empleado.
     *
     * @param rut Rut del empleado.
     * @param nombre Nombre del empleado.
     * @param direccion Dirección del empleado.
     * @param cargo Cargo que desempeña.
     */
    public Empleado(String rut, String nombre, Direccion direccion, String cargo) {
        super(rut, nombre, direccion);
        this.cargo = cargo;
    }

    /**
     * Obtiene el cargo.
     *
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Modifica el cargo.
     *
     * @param cargo Nuevo cargo.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Retorna la información completa del empleado.
     *
     * @return Datos del empleado.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", Cargo: " + cargo;
    }
}