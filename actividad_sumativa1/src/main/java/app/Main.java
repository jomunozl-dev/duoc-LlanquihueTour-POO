package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

/**
 * Clase principal del sistema.
 *
 * Permite crear y mostrar objetos del modelo para
 * verificar el funcionamiento de la herencia,
 * composición y encapsulamiento.
 *
 * @author Jorge Munoz Leon
 * @version 1.0
 */

public class Main {

    /**
     * Método principal del programa.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        // Crear direcciones
        Direccion direccionCliente =
                new Direccion("Los Alerces 123", "Puerto Varas");

        Direccion direccionGuia =
                new Direccion("Lago Llanquihue 456", "Puerto Montt");

        Direccion direccionOperador =
                new Direccion("Volcán Osorno 789", "Frutillar");

        // Crear objetos
        Persona cliente = new Persona(
                "11.546.889-5",
                "Juan Pérez",
                direccionCliente);

        Empleado guia = new Empleado(
                "19.586.025-6",
                "María Soto",
                direccionGuia,
                "Guía Turístico");

        Empleado operador = new Empleado(
                "18.656.856-3",
                "Pedro González",
                direccionOperador,
                "Operador de Tours");

        // Mostrar información
        System.out.println("=== CLIENTE ===");
        System.out.println(cliente);

        System.out.println();

        System.out.println("=== GUÍA ===");
        System.out.println(guia);

        System.out.println();

        System.out.println("=== OPERADOR ===");
        System.out.println(operador);
    }
}