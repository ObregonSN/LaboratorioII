/*package TP5;

public class Facultad {

    private String nombreFacultad;

    private int cantMaxEstudiantes;

    private Estudiante estudiantes[];

    private static int nroEstudiante;

    private int contEstudiantes;


    public Facultad(String nombreFacultad, int cantMaxEstudiantes){

        this.nombreFacultad = nombreFacultad;

        this.cantMaxEstudiantes = cantMaxEstudiantes;

        estudiantes = new Estudiante[this.cantMaxEstudiantes];

        nroEstudiante = 1;

        contEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante est){

        estudiantes[contEstudiantes] = est;
        estudiantes[contEstudiantes].setNroEstudiante(nroEstudiante);
        contEstudiantes++;
        nroEstudiante++;
    }

    public void listar(){

        System.out.println("Lista de estudiantes: ");

        for (int i = 0; i < estudiantes.length; i++) {

            System.out.println("Nombre: " + estudiantes[i].getNombreEstudiante() + "\tNota media: " + estudiantes[i].getNotaMedia() + "\tNumero de estudiante: " + estudiantes[i].getNroEstudiante());
        }

    }

    public void buscarEstudiante(String nombre){

        boolean encontrado = false;

        for (int i = 0; i < estudiantes.length; i++) {

            if(estudiantes[i].getNombreEstudiante().equals(nombre)){

                encontrado = true;

                System.out.println("Info del estudiante seleccionado:");

                System.out.println();

                System.out.print("Nombre: " + estudiantes[i].getNombreEstudiante() + "\tNota media: " + estudiantes[i].getNotaMedia() + "Numero de estudiante: " + estudiantes[i].getNroEstudiante());

            }
        }

        if(encontrado=false){
            System.out.println("No se encontro el alumno seleccionado.\n");
        }
    }

    public void modifNotaMedia(String nombre, int nota){

        boolean encontrado = false;

        for (int i = 0; i < estudiantes.length; i++) {

            if(estudiantes[i].getNombreEstudiante().equals(nombre)){

                encontrado = true;

                estudiantes[i].setNotaMedia(nota);

                System.out.println("Nueva info del alumno: \n");

                System.out.print("Nombre: " + estudiantes[i].getNombreEstudiante() + "\tNota media: " + estudiantes[i].getNotaMedia() + "Numero de estudiante: " + estudiantes[i].getNroEstudiante());

            }
        }

        if(encontrado=false){
            System.out.println("No se encontro el alumno seleccionado.\n");
        }
    }
}*/