public class Libro extends MaterialBibliografico{
    private String autor;

    public Libro(String codigo, String titulo, int fecha, String autor) {
        super(codigo,titulo,fecha);
        this.autor = autor;
    }

    public Libro (String codigo, String titulo, String autor) {
        super(codigo,titulo,0);
        this.autor = autor;
    }

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    @Override
    public void mostrarInfo() {
        System.out.println("[Libro] " + getTitulo() + " - " + autor + " (" + getFecha() + ")");
    }




}