
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;


public class metodos {
   
       public static void main(String[] args) {
    Utilities Guia = new Utilities();
       String parrafo ="";
            parrafo="Un texto es una composición de signos codificados en un sistema de escritura que forma una unidad de sentido. Su tamaño puede ser variable. También es una composición de caracteres imprimibles generados por un algoritmo de cifrado que, aunque no tienen sentido para cualquier persona, sí puede ser descifrado por su destinatario original.";
       System.out.println(Guia.getresumen(parrafo));
       
       System.out.println(Guia.capitalizar(parrafo));
       System.out.println(Guia.contarCoincidencias("algo",parrafo));

       }
}
