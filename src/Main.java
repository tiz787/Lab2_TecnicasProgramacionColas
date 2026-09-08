import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("biblioteca");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\nBIBLIOTECA");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("4. Mostrar materiales");
            System.out.println("5. Prestar material");
            System.out.println("6. Devolver material");
            System.out.println("7. Descargar material digital");
            System.out.println("8. Mostrar estadísticas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: {
                        System.out.print("Código: ");
                        String codigo = sc.nextLine();
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Año: ");
                        int fecha = Integer.parseInt(sc.nextLine());
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        Libro libro = new Libro(codigo, titulo, fecha, autor);
                        biblioteca.agregarMaterial(libro);
                        System.out.println("Libro registrado.");
                        break;
                    }
                    case 2: {
                        System.out.print("Código: ");
                        String codigo = sc.nextLine();
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Año: ");
                        int fecha = Integer.parseInt(sc.nextLine());
                        System.out.print("Edición: ");
                        String edicion = sc.nextLine();
                        Revista revista = new Revista(codigo, titulo, fecha, edicion);
                        biblioteca.agregarMaterial(revista);
                        System.out.println("Revista registrada.");
                        break;
                    }
                    case 3: {
                        System.out.print("Código: ");
                        String codigo = sc.nextLine();
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Año: ");
                        int fecha = Integer.parseInt(sc.nextLine());
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Tamaño del archivo (MB): ");
                        double tamano = Double.parseDouble(sc.nextLine());
                        LibroDigital libroDigital = new LibroDigital(codigo, titulo, fecha, autor, tamano);
                        biblioteca.agregarMaterial(libroDigital);
                        System.out.println("Libro digital registrado.");
                        break;
                    }
                    case 4:
                        biblioteca.mostrarMateriales();
                        break;
                    case 5: {
                        System.out.print("Código del material a prestar: ");
                        String codigo = sc.nextLine();
                        biblioteca.prestarMaterial(codigo);
                        break;
                    }
                    case 6: {
                        System.out.print("Código del material a devolver: ");
                        String codigo = sc.nextLine();
                        biblioteca.devolverMaterial(codigo);
                        break;
                    }
                    case 7: {
                        System.out.print("Código del material a descargar: ");
                        String codigo = sc.nextLine();
                        biblioteca.descargarMaterial(codigo);
                        break;
                    }
                    case 8:
                        biblioteca.mostrarEstadisticas();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Vuelve a intentarlo.");
            }
        }

        sc.close();
    }
}
