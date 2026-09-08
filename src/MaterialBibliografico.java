public abstract class MaterialBibliografico {
    private String codigo;
    private String titulo;
    private int fecha;
    private int id;
    private static int contador;

    public String getCodigo() {return codigo;}

    public String getTitulo() {return titulo;}

    public int getFecha() {return fecha;}

    public int getId() {return id;}

    public static int getContador(){return contador;}

    public MaterialBibliografico(){
        this("", "", 0);
    }

    public MaterialBibliografico(String codigo,String titulo,int fecha){
        this.codigo=codigo;
        this.titulo=titulo;
        this.fecha=fecha;
        contador++;
        this.id = contador;
    }

    public abstract void mostrarInfo();
}
