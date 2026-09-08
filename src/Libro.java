public class Libro extends MaterialBibliografico implements Prestable {
    private String autor;
    private boolean prestado;

    public Libro(String codigo, String titulo, int fecha, String autor) {
        super(codigo,titulo,fecha);
        this.autor = autor;
        this.prestado = false;
    }

    public Libro (String codigo, String titulo, String autor) {
        super(codigo,titulo,0);
        this.autor = autor;
        this.prestado = false;
    }

    public Libro (String codigo, String titulo) {
        super(codigo,titulo,0);
        this.autor = "";
        this.prestado = false;
    }

    public Libro (String codigo) {
        super(codigo,"",0);
        this.autor = "";
        this.prestado = false;
    }

    public Libro () {
        super();
        this.autor = "";
        this.prestado = false;
    }



    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    @Override
    public void mostrarInfo() {
        System.out.println("[Libro #" + getId() + "] " + getTitulo() + " - " + autor + " (" + getFecha() + ")" + (prestado ? " [PRESTADO]" : " [DISPONIBLE]"));
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println(getTitulo() + " ha sido prestado.");
        } else {
            System.out.println(getTitulo() + " ya estaba prestado.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(getTitulo() + " ha sido devuelto.");
        } else {
            System.out.println(getTitulo() + " no estaba prestado.");
        }
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }




}