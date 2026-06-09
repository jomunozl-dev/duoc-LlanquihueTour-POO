package model;

/**
 * Clase que representa una dirección.
 *
 * Se utiliza para almacenar la ubicación de una persona.
 *
 * @author Jorge Munoz Leon
 * @version 1.0
 */

public class Direccion {

    private String calle;
    private String ciudad;

    /**
     * Constructor de la clase Direccion.
     *
     * @param calle Nombre de la calle.
     * @param ciudad Nombre de la ciudad.
     */
    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene la calle.
     *
     * @return Calle de la dirección.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica la calle.
     *
     * @param calle Nueva calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la ciudad.
     *
     * @return Ciudad de la dirección.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modifica la ciudad.
     *
     * @param ciudad Nueva ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Retorna la información de la dirección.
     *
     * @return Datos de la dirección.
     */
    @Override
    public String toString() {
        return "Calle: " + calle + ", Ciudad: " + ciudad;
    }
}