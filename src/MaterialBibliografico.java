public abstract class MaterialBibliografico {
    private String codigo;
    private String titulo;
    private int fecha;
    private static int contador;

    public String getCodigo() {return codigo;}

    public String getTitulo() {return titulo;}

    public int getFecha() {return fecha;}

    public static int getContador(){return contador;}

    public MaterialBibliografico(String codigo,String titulo,int fecha){
        this.codigo=codigo;
        this.titulo=titulo;
        this.fecha=fecha;
        contador++;
    }

    public abstract void mostrarInfo();
}
