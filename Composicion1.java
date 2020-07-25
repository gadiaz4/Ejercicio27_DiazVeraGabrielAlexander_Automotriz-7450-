package composicion1;
import java.util.*;
class Pagina {

    //ATRIBUTOS DE INSTANCIA
    private String contenido;
    private int numero;

    //CONSTRUCTOR DE PARAMETROS
    public Pagina(String contenido, int numero) {
        this.contenido = contenido;
        this.numero = numero;
    }

    //METODOS DE INSTANCIA
    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String nuevo_contenido) {
        this.contenido = nuevo_contenido;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int nuevo_numero) {
        this.numero = nuevo_numero;
    }


}

class Libro {

    //ATRIBUTOS
    private String titulo;
    private  long isbn;
    private String autor;
    private int anioPublicacion;

    //ATRIBUTOS REPRESENTANDO LA RELCION DE COMPOSICION
    private Pagina[] paginas;
    private int numeroPaginas;

    //CONSTRUCTOR
    public Libro(String titulo, long isbn, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;

        //RESERVAMOS UN ESPACION DE MEMORIA PARA EL OBJETO"array"
        this.paginas = new Pagina[999];
        //RESERVAMOS ESPACIO EN MEMORIA PARA LAS Paginas
        for (int i = 0; i < 999; i++) {
            this.paginas[i] = new Pagina("",0);
        }
        this.numeroPaginas = 0;
    }

    //METODOS DE INSTACIA
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public long getIsbn() {
        return this.isbn;
    }
    public void setIsbn(long nuevo_isbn) {
        this.isbn = nuevo_isbn;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String nuevo_autor) {
        this.autor = nuevo_autor;
    }
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }
    public void setAnioPublicacion(int nuevo_anioPublicacion) {
        this.anioPublicacion = nuevo_anioPublicacion;
    }
    //METODOS PARA TRABAJR CON LA CLASE COMPOSISICON
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
    public int setNumeroPginas(){
        return this.numeroPaginas;
    }
    public void AniadirPagina(Pagina nueva_Pagina) {
        if (this.numeroPaginas < 999) {
            this.paginas[this.numeroPaginas] = nueva_Pagina;
            this.numeroPaginas++;
        }
    }
    public Pagina getPaginaNumero(int numero_Pagina) {
        for (int i = 0; i < this.numeroPaginas; i++) {
            if (this.paginas[i].getNumero() == numero_Pagina) {
                return this.paginas[i];
            }
        }
        return null;
    }
}
/**
 *
 * @author Gabriel Alexander Díaz Vera
 */
public class Composicion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n");
         System.out.println("Nombre: Díaz Vera Gabriel Alexander");
         System.out.println("Asignatura: Programación");
         System.out.println("Nrc: 7450");
         System.out.println("Tema: Agregacion / composicion\n ");


        // DECLARACION Y DEFINICION DE OBJETOS
        Libro Controles_Instrumentos = new Libro("Arranque y apagado del motor", 1234345296,"Chevrolet", 2020);
        Pagina pagina1 = new Pagina("Asegurese de que todos los interruptores esten en a posicion descativada", 4);
        Pagina pagina2 = new Pagina("Gire el interruptor de arranque a posiscion ON verificque luces y combustible normal", 5);

        //PASAMOS AL OBJETO libro LOS OBJETOS DEL TIPO Pagina
        Controles_Instrumentos.AniadirPagina(pagina1);
        Controles_Instrumentos.AniadirPagina(pagina2);
        System.out.println(" \t\t\t"+Controles_Instrumentos.getTitulo());
        System.out.println("" + pagina1.getContenido()+" "+pagina1.getNumero());
        System.out.println("" + pagina2.getContenido()+" "+pagina2.getNumero());
        System.out.println("El Autor es: "+Controles_Instrumentos.getAutor());
        System.out.println("El Isbn es: "+Controles_Instrumentos.getIsbn());
        System.out.println("El anio de publicacion es: "+Controles_Instrumentos.getAnioPublicacion());
        System.out.println("El numero de paginas es: "+Controles_Instrumentos.getNumeroPaginas());
    }
}
