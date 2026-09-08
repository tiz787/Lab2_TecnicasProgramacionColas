public class Revista extends MaterialBibliografico implements Prestable {
    private String edicion;
    private boolean prestado;

    public Revista(){
        super();
        this.edicion = "";
        this.prestado = false;
    }

    public Revista(String codigo, String titulo, int fecha, String edicion){
        super(codigo,titulo,fecha);
        this.edicion=edicion;
        this.prestado = false;
    }

    public Revista(String codigo, String titulo, String edicion){
        super(codigo,titulo,0);
        this.edicion=edicion;
        this.prestado = false;
    }

    public String getEdicion(){return edicion;}
    public void setEdicion(String edicion){this.edicion=edicion;}

    @Override
    public void mostrarInfo() {
        System.out.println("[Revista #" + getId() + "] " + getTitulo() + " - " + "edicion:" + edicion + (prestado ? " [PRESTADA]" : " [DISPONIBLE]"));
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println(getTitulo() + " ha sido prestada.");
        } else {
            System.out.println(getTitulo() + " ya estaba prestada.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println(getTitulo() + " ha sido devuelta.");
        } else {
            System.out.println(getTitulo() + " no estaba prestada.");
        }
    }

    @Override
    public boolean isPrestado() {
        return prestado;
    }
}
