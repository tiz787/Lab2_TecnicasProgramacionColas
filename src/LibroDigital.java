public class LibroDigital extends MaterialBibliografico implements Descargable {
    private String autor;
    private double tamanoArchivoMB;

    public LibroDigital() {
        super();
        this.autor = "";
        this.tamanoArchivoMB = 0.0;
    }

    public LibroDigital(String codigo, String titulo, int fecha, String autor, double tamanoArchivoMB) {
        super(codigo, titulo, fecha);
        this.autor = autor;
        this.tamanoArchivoMB = tamanoArchivoMB;
    }

    public String getAutor() {return autor;}
    public void setAutor(String autor){this.autor=autor;};

    public double getTamanoArchivoMB() {return tamanoArchivoMB;}
    public void setTamanoArchivoMB(double tamanoArchivoMB){this.tamanoArchivoMB=tamanoArchivoMB;}

    @Override
    public void mostrarInfo() {
        System.out.println("[LibroDigital #" + getId() + "] " + getTitulo() + " - " + autor + " (" + tamanoArchivoMB + " MB)");
    }

    @Override
    public void descargar() {
        System.out.println(getTitulo() + " se está descargando (" + tamanoArchivoMB + " MB)...");
    }
}