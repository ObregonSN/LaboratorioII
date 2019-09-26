package TP5;

public class Estudiante {

    private String nombreEstudiante;

    private double notaMedia;

    private int nroEstudiante;

    private static int countId = 1;

    public Estudiante (String nombreEstudiante, double notaMedia){

        this.setNombreEstudiante(nombreEstudiante);
        this.setNotaMedia(notaMedia);
        this.countId++;


    }


    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getNroEstudiante() {
        return nroEstudiante;
    }

    public void setNroEstudiante(int nroEstudiante) {
        this.nroEstudiante = nroEstudiante;
    }
}
