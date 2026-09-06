public class Main{
    public static void main(String[] args){
        /*Libro libro1=new Libro("C001", "Cien años de soledad", 1967, "Gabriel García Márquez");
        Libro libro2=new Libro("C001", "Cien años de soledad", 1967, "Gabriel García Márquez");
        System.out.println(libro1.getTitulo()+ "-" +"(" + libro1.getAutor()+")");
        System.out.println(libro1.getContador());*/

        Libro libro = new Libro("C001", "Cien años de soledad", 1967, "Gabriel García Márquez");

        libro.mostrarInfo();

        LibroDigital librodigital = new LibroDigital("C001", "Cien años de soledad", 1967, "Gabriel García Márquez",40.6);

        librodigital.getTamanoArchivoMB();
    }




}