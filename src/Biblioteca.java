import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<MaterialBibliografico> materiales;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.materiales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void agregarMaterial(MaterialBibliografico material) {
        materiales.add(material);
    }

    public void mostrarMateriales() {
        if (materiales.isEmpty()) {
            System.out.println("No hay materiales registrados.");
            return;
        }
        for (MaterialBibliografico m : materiales) {
            m.mostrarInfo();
        }
    }

    public MaterialBibliografico buscarPorCodigo(String codigo) {
        for (MaterialBibliografico m : materiales) {
            if (m.getCodigo().equals(codigo) ) {
                return m;
            }
        }
        return null;
    }

    public void prestarMaterial(String codigo) {
        MaterialBibliografico m = buscarPorCodigo(codigo);
        if (m == null) {
            System.out.println("No existe un material con ese código.");
            return;
        }
        if (m instanceof Prestable) {
            ((Prestable) m).prestar();
        } else {
            System.out.println(m.getTitulo() + " no tiene la capacidad de préstamo.");
        }
    }

    public void devolverMaterial(String codigo) {
        MaterialBibliografico m = buscarPorCodigo(codigo);
        if (m == null) {
            System.out.println("No existe un material con ese código.");
            return;
        }
        if (m instanceof Prestable) {
            ((Prestable) m).devolver();
        } else {
            System.out.println(m.getTitulo() + " no tiene la capacidad de préstamo.");
        }
    }

    public void descargarMaterial(String codigo) {
        MaterialBibliografico m = buscarPorCodigo(codigo);
        if (m == null) {
            System.out.println("No existe un material con ese código.");
            return;
        }
        if (m instanceof Descargable) {
            ((Descargable) m).descargar();
        } else {
            System.out.println(m.getTitulo() + " no tiene la capacidad de descarga.");
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("Total de materiales creados (histórico): " + MaterialBibliografico.getContador());
        System.out.println("Total de materiales en \"" + nombre + "\": " + materiales.size());
    }
}
