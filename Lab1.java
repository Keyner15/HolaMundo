import java.util.Scanner;
import java.util.ArrayList;

class Libro {
    //Atributos de la clase lirbo
    int codigo;
    String titulo;
    boolean disponible;

    //Constructor de la clase libro
    Libro(int codigo, String titulo, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    //Gets and set de los atributos titulo y disponible de la clase Libro
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponibre(boolean disponible){
        this.disponible = disponible;
    }
}

public abstract class Lab1 {
    public static void main(String[] args){

        //Utilizamos un Scanner para poder interactuar con el usuario en el menú
        Scanner scanner = new Scanner(System.in);

        //Creamos dos constantes en este cas de secciones y de la cantidad de libros de las mismas
        int NUM_SECCIONES = 5;
        int NUM_LIBROS_POR_SECCION = 9;

        //Creamos una lista de listas de libros y su estado actual
        ArrayList<ArrayList<Libro>> secciones = new ArrayList<>(NUM_SECCIONES);

        //Realizaoms un ciclo for para que recorra la lista de libros de cada seccion
        for (int i = 0; i < NUM_SECCIONES; i++) {
            secciones.add(new ArrayList<>(NUM_LIBROS_POR_SECCION));
        }

        //Se realiza la insercion de la información de los libros de la sección número 1 
        secciones.get(0).add(new Libro(1,"Introducción a la Programación", true));
        secciones.get(0).add(new Libro(2,"Estructuras de Datos y Algoritmos", false));
        secciones.get(0).add(new Libro(3,"Principios de Bases de Datos", true));
        secciones.get(0).add(new Libro(4,"Sistemas Operativos", true));
        secciones.get(0).add(new Libro(5,"Redes de Computadoras", false));
        secciones.get(0).add(new Libro(6,"Inteligencia Artificial", true));
        secciones.get(0).add(new Libro(7,"Desarrollo Web", true));
        secciones.get(0).add(new Libro(8,"Programación Orientada a Objetos", false));
        secciones.get(0).add(new Libro(9,"Arquitectura de Computadoras", true));

        //Se realiza la insercion de la información de los libros de la sección número 2
        secciones.get(1).add(new Libro(1,"Cálculo Diferencial", true));
        secciones.get(1).add(new Libro(2,"Álgebra Lineal", false));
        secciones.get(1).add(new Libro(3,"Estadística Aplicada", true));
        secciones.get(1).add(new Libro(4,"Matemáticas Discretas", true));
        secciones.get(1).add(new Libro(5,"Ecuaciones Diferenciales", false));
        secciones.get(1).add(new Libro(6,"Teoría de Números", true));
        secciones.get(1).add(new Libro(7,"Probabilidad y Estadística", false));
        secciones.get(1).add(new Libro(8,"Matemáticas Financieras", true));
        secciones.get(1).add(new Libro(9,"Geometría Analítica", true));

        //Se realiza la insercion de la información de los libros de la sección número 3
        secciones.get(2).add(new Libro(1,"Física General", false));
        secciones.get(2).add(new Libro(2,"Electromagnetismo", true));
        secciones.get(2).add(new Libro(3,"Mecánica Clásica", true));
        secciones.get(2).add(new Libro(4,"Termodinámica", false));
        secciones.get(2).add(new Libro(5,"Física Moderna", true));
        secciones.get(2).add(new Libro(6,"Óptica", true));
        secciones.get(2).add(new Libro(7,"Física Cuántica", false));
        secciones.get(2).add(new Libro(8,"Astrofísica", true));
        secciones.get(2).add(new Libro(9,"Física de Partículas", true));

        //Se realiza la insercion de la información de los libros de la sección número 4
        secciones.get(3).add(new Libro(1,"Química General", true));
        secciones.get(3).add(new Libro(2,"Química Orgánica", false));
        secciones.get(3).add(new Libro(3,"Química Inorgánica", true));
        secciones.get(3).add(new Libro(4,"Bioquímica", true));
        secciones.get(3).add(new Libro(5,"Química Analítica", false));
        secciones.get(3).add(new Libro(6,"Química Industrial", true));
        secciones.get(3).add(new Libro(7,"Química Física", false));
        secciones.get(3).add(new Libro(8,"Química Ambiental", true));
        secciones.get(3).add(new Libro(9,"Química de Materiales", true));

        //Se realiza la insercion de la información de los libros de la sección número 5
        secciones.get(4).add(new Libro(1,"Biología General", true));
        secciones.get(4).add(new Libro(2,"Genética", false));
        secciones.get(4).add(new Libro(3,"Microbiología", true));
        secciones.get(4).add(new Libro(4,"Ecología", true));
        secciones.get(4).add(new Libro(5,"Biología Molecular", false));
        secciones.get(4).add(new Libro(6,"Fisiología Humana", true));
        secciones.get(4).add(new Libro(7,"Zoología", false));
        secciones.get(4).add(new Libro(8,"Botánica", true));
        secciones.get(4).add(new Libro(9,"Anatomía Humana", true));

        //Creamos las variables que se van a utlizar en el menú
        int seccion;
        int salir;
        int codigo;
        String opcion;

        //Creamos un siclo Do while para que cada vex que la opcion sea diferete a "D" se repita el menú
        do{
            limpiarPantalla();
            System.out.println("Bienvenido a la biblioteca, elija la opcion que desea realizar:\n a)Prestar un Libro\n b)Devolver un libro\n c)Mostrar Los libros de una sección\n d)Salir");

            opcion = scanner.next();

            //Utilizamos una condicional "Switch" para que el usuario pueda elegir su opcion deseada
            switch (opcion.toUpperCase()) {
                case "A":

                    //Utilizamos un ciclo "do while" para que si la opcion es diferente a 2 se repida la opcion A
                    do{
                        limpiarPantalla();
                        System.out.println("Elije la sección que deas ver:\n 1)Sección 1\n 2)Sección 2\n 3)Sección 3\n 4)Sección 4\n 5)Sección 5\n 6)Volver al menú");

                        //EL dato lo resivimos y le restamos 1 ua que las listas comiensan desde el 0
                        seccion = scanner.nextInt() - 1;
                        scanner.nextLine();

                        //Creamos una condicional que lo que va hacer es revisar si la seccion es valida ya que contamos solo con 5 secciones entoces si el usuario quiere una sexta sección le dara un mensahe de Error.
                        if (seccion < 0 || seccion >= NUM_SECCIONES) {
                            System.out.println("Sección inválida.");
                            return;
                        }

                        //En esta seccion el ciclo "For me va a recorrer y mostrar todos los datos de las lista escogida para que el usuario pueda seleccionar y ver si el libro esta diponible"
                        System.out.println("Libros en la Sección " + (seccion + 1) + ":");
                        for (Libro libro : secciones.get(seccion)) {
                            String estado = libro.disponible ? "Disponible" : "Prestado";
                            System.out.println(libro.codigo + "- " + libro.titulo + " (" + estado + ")");
                        }
                        
                        //En esta sección el usuario ingresa el codigo del libro
                        System.out.print("Ingrese el Codigo del libro: ");
                        codigo = scanner.nextInt();
                        //Este ciclo "for" me recorre la secion completa hasta que llega al libro escogido por el codigo y si esta disponible dara un mensaje de Exito y si no un Error.
                        for (Libro libro : secciones.get(seccion)) {
                            if (libro.codigo == codigo) {
                                if (libro.disponible) {
                                    libro.disponible = false;
                                    System.out.println("Libro prestado exitosamente.");
                                } else {
                                    System.out.println("El libro ya está prestado.");
                                }
                                break;
                            }
                        }
                        //En esta opcion le pide al usaurio si desea otro libro si la respuesta es 1 se repetira el ciclo do while y si no lo devolvera al menu principal
                        System.out.println("Desea qpedir otro libro?\n 1)si\n 2)no");
                        salir = scanner.nextInt();
                    }while (salir != 2);
                    break;
                case "B":

                    do{
                        
                        limpiarPantalla();
                        System.out.println("Elije la sección que deas ver:\n 1)Sección 1\n 2)Sección 2\n 3)Sección 3\n 4)Sección 4\n 5)Sección 5\n 6)Volver al menú");
                        seccion = scanner.nextInt() - 1;
                        scanner.nextLine();  // Consumir el salto de línea
                
                         //Creamos una condicional que lo que va hacer es revisar si la seccion es valida ya que contamos solo con 5 secciones entoces si el usuario quiere una sexta sección le dara un mensahe de Error.
                        if (seccion < 0 || seccion >= NUM_SECCIONES) {
                            System.out.println("Sección inválida.");
                            return;
                        }

                        //En esta seccion el ciclo "For me va a recorrer y mostrar todos los datos de las lista escogida para que el usuario pueda seleccionar y ver si el libro esta diponible"
                        System.out.println("Libros en la Sección " + (seccion + 1) + ":");
                        for (Libro libro : secciones.get(seccion)) {
                            String estado = libro.disponible ? "Disponible" : "Prestado";
                            System.out.println(libro.codigo + "- " + libro.titulo + " (" + estado + ")");
                        }
                
                        System.out.print("Ingrese el código del libro: ");
                        codigo = scanner.nextInt();
                
                         //Este ciclo "for" me recorre la secion completa hasta que llega al libro escogido por el codigo y si esta disponible dara un mensaje de error y si no un mensaje de que se devolvio con exito el libro.
                        for (Libro libro : secciones.get(seccion)) {
                            if (libro.codigo == codigo) {
                                if (!libro.disponible) {
                                    libro.disponible = true;
                                    System.out.println("Libro devuelto exitosamente.");
                                } else {
                                    System.out.println("El libro ya estaba disponible.");
                                }
                                break;
                            }
                        }
                         //En esta opcion le pide al usaurio si desea devolver otro libro si la respuesta es 1 se repetira el ciclo do while y si no lo devolvera al menu principal
                        System.out.println("Desea que le den otro libro?\n 1)si\n 2)no");
                        salir = scanner.nextInt();
                    }while(salir != 2);
                    
                    break;
                case "C":

                    do{

                        limpiarPantalla();

                        System.out.println("Elije la sección que deas ver:\n 1)Sección 1\n 2)Sección 2\n 3)Sección 3\n 4)Sección 4\n 5)Sección 5\n 6)Volver al menú");
                        seccion = scanner.nextInt() - 1;
                        scanner.nextLine();  // Consumir el salto de línea
                
                        //Creamos una condicional que lo que va hacer es revisar si la seccion es valida ya que contamos solo con 5 secciones entoces si el usuario quiere una sexta sección le dara un mensahe de Error.
                        if (seccion < 0 || seccion >= NUM_SECCIONES) {
                            System.out.println("Sección inválida.");
                            return;
                        }

                        //En esta seccion el ciclo "For me va a recorrer y mostrar todos los datos de las lista escogida para que el usuario pueda seleccionar y ver si el libro esta diponible"
                        System.out.println("Libros en la Sección " + (seccion + 1) + ":");
                        for (Libro libro : secciones.get(seccion)) {
                            String estado = libro.disponible ? "Disponible" : "Prestado";
                            System.out.println(libro.codigo + "- " + libro.titulo + " (" + estado + ")");
                        }

                        //En esta opcion le pide al usaurio si desea ver otra sección si la respuesta es 1 se repetira el ciclo do while y si no lo devolvera al menu principal
                        System.out.println("¿Desea ver otra sección?\n 1)si\n 2)no");
                        salir = scanner.nextInt();
                    }while(salir != 2);

                    break;
                case "D":
                    
                    //En la opcion 4 dira gracias por utilizar el  sistema y se saldra del sistema
                    System.out.println("¡Gracias por utilizar el sistema!");
                    scanner.nextLine();
                    System.exit(0);
                default:
                    System.out.println("Esta opcion no se encuentra en el systema");
                    scanner.next();
                    break;
            }

        }while(opcion.toUpperCase() != "D");
        scanner.close();
    }

    //Este procedimiento me va a limpiar la terminal cada vez que sea colocado
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

