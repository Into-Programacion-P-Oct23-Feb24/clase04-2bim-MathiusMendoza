/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //  String miCiudad = obtenerCiudadMayuscula("Loja");
        //  System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50);

        String miMensaje = obtenerMultiplicaciondos(7, 50);
        System.out.printf("%s\n", miMensaje);
    }
        // Se crearon nuevos metodos al principio para poder crear la tabla de 
        // multiplicar y asi establecer hasta un limite.
        // Seguidamente creamos un metodo de tipo cadena.
    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static String obtenerMultiplicaciondos(int tabla, int limite) {
        int resultado = 0;
        String cadenaFinal = "";
        for (int i = 0; i <= limite; i++) {
            resultado = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n", cadenaFinal,
                    tabla, i, resultado);

        }
        return cadenaFinal;

    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        int resultado = 0;
        String cadenaFinal = "";
        for (int i = 0; i <= limite; i++) {
            resultado = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n", cadenaFinal,
                    tabla, i, resultado);

        }
        System.out.printf(cadenaFinal);

    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
