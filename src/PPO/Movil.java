package PPO;

public class Movil {

    private int tamanioPantalla;
    private String tipo;

    public Movil(int tamanioPantalla, String tipo){
        this.tamanioPantalla = tamanioPantalla;
        this.tipo = tipo;
    }

    public String getInfo(){
        return ("tamaño de pantalla: "+this.tamanioPantalla+"tipo: "+this.tipo);
    }
}
