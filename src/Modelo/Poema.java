package Modelo;

import Excepciones.ExcepcionesPoema.ErrorCargaPoemaException;
import Excepciones.ExcepcionesPoema.PosicionPoemaInvalidaException;
import Excepciones.ExcepcionesPoema.PalabraNoEncontradaException;
import Excepciones.ExcepcionesPoema.PalabraMuyCortaException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Poema {
    private String [] palabras;

    // SE CREA UN CONSTRUCTOR PARA: CARGAR EL POEMA AL CREAR EL OBJETO
    public Poema (String ruta) throws ErrorCargaPoemaException {
        cargarPoema(ruta);
    }

    // PARA PODER LEER EL ARCHIVO Y LLENAR EL VECTOR
    private void cargarPoema (String ruta) throws ErrorCargaPoemaException {
        ArrayList <String> lista = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            String linea;
                while((linea = lector.readLine())) != null) {
                linea = linea.replaceAll("[,.]","");
                String [] palabrasLinea = linea.trim().split ("\\s+");
                for (String palabra : palabrasLinea) {
                    if (! palabra.isEmpty()) {
                        lista.add (palabra);
                    }
                }
            }
            // CREAR EL VECTOR CON EL TAMAÑO
            palabras = new String [lista.size()];
            for (int i = 0; i< lista.size(); i++) {
                palabras [i] = lista.get (i);
            }
        } catch (IOException e) {
            throw new
        }
    }
}