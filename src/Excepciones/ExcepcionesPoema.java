package Excepciones;

public class ExcepcionesPoema {

    // 1. VALIDACIÓN DEL CONTENIDO EXCEPCIÓN: "PalabraNoEncontradaException"

    public static class PalabraNoEncontradaException extends Exception {
        public PalabraNoEncontradaException (String mensaje){
            super(mensaje);
        }
    }
    // 2. VALIDACIÓN DE LONGITUD EXCEPCIÓN: "PalabraMuyCortaException"
    public static class PalabraMuyCortaException extends Exception {
        public PalabraMuyCortaException (String mensaje) {
            super (mensaje);
        }
    }
    // 3. ERROR DE LECTURA ENCAPSULADO EXCEPCIÓN: "ErrorCargaPoemaException"
    public static class ErrorCargaPoemaException extends Exception {
        public ErrorCargaPoemaException (String mensaje) {
            super (mensaje);
        }
    }
    // 4.ERROR DE INDICE ENCAPSULADO EXCEPCIÓN: "PosiciónPoemaInvalidaExceptión"
    public static class PosicionPoemaInvalidaException extends Exception {
        public PosicionPoemaInvalidaException (String mensaje) {
            super (mensaje);
        }
    }
}
