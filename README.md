# Gestión de Bibliotecas

## Estructura del proyecto

```
src/
├── MaterialBibliografico.java
├── Libro.java
├── Revista.java
├── LibroDigital.java
├── Prestable.java
├── Descargable.java
├── Biblioteca.java
└── Main.java
```

## Cómo compilar y ejecutar

Desde la raíz del proyecto:

```bash
cd src
javac *.java
java Main
```

O desde IntelliJ IDEA: abrir el proyecto y ejecutar `Main.java`.

## Uso

Al ejecutar, se muestra el siguiente menú:

```
BIBLIOTECA UNIVERSITARIA
1. Registrar libro
2. Registrar revista
3. Registrar libro digital
4. Mostrar materiales
5. Prestar material
6. Devolver material
7. Descargar material digital
8. Mostrar estadísticas
0. Salir
```

Cada material se identifica por un código único, que se usa luego para prestarlo, devolverlo o descargarlo. Si se intenta prestar un material que no tiene esa capacidad (por ejemplo, un libro digital) o descargar uno que no la tiene (por ejemplo, un libro físico), el sistema lo indica sin producir errores.
