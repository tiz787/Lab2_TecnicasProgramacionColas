public class LibroDigital extends MaterialBibliografico {
    private String autor;
    private double tamanoArchivoMB;

    public LibroDigital(String codigo, String titulo, int fecha, String autor, double tamanoArchivoMB) {
        super(codigo, titulo, fecha);
        this.autor = autor;
        this.tamanoArchivoMB = tamanoArchivoMB;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanoArchivoMB() {
        return tamanoArchivoMB;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[LibroDigital] " + getTitulo() + " - " + autor + " (" + tamanoArchivoMB + " MB)");
    }
}