/*package TP6;
import java.util.Random;

public class GeneradorContraseñas {
    private Random random = new Random();

    private String[] contraseñas;

    private char[] caracteres={'0','1','2','3','4','5','6','7','8','9',
            'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','ñ','o','p','q','r','s',
            't','u','v','w','x','y','z',
            'A','B','C','D','E','F','G','H','I','J',
            'K','L','M','N','Ñ','O','P','Q','R','S',
            'T','U','V','W','X','Y','Z'};

    private String contraseña = "";

    //metodo que genera las contraseñas

    public GeneradorContraseñas(int cantContr, int largContr) { //se le pasa como parametro la cantidad y longitud de contraseñas que introdujo el usuario
        this.contraseñas = new String[cantContr]; //se establece la dimension del arreglo de contraseñas
        for (int i = 0; i < this.contraseñas.length; i++) {
            this.contraseñas[i] = "";
            for (int j = 0; j < largContr; j++) {
                this.contraseñas[i] += String.valueOf(caracteres[random.nextInt(64)]); //se generan las contraseñas con random (pasandole el arreglo de caracteres), y se las convierte a string con ValueOf
            }
        }
    }

    //constructor

    public GeneradorContraseñas(String contr) {
        this.contraseña = contr;
    }

    //devuelve el arreglo de contraseñas

    public String[] getContraseñas() {
        return contraseñas;
    }

    //devuelve la contraseña generada

    public String getContraseña () {
        return this.contraseña;
    }

    //devuelve la longitud de la contraseña generada

    public int getLongitud (String contr) {
        return contr.length();
    }

    //método para determinar la seguridad de la contraseña

    public String getSeguridad (String contra) {
        int mayuscula = 0, minuscula = 0, numeros = 0;
        for (int i = 0; i < contra.length(); i++) { //ciclo for para recorrer cada una de las contraseñas
            if (Character.isUpperCase(contra.charAt(i))) { //evalúa si en la posicion del contador hay una mayúscula
                mayuscula++;
            }else if(Character.isLowerCase(contra.charAt(i))){ //evalúa si en la posicion del contador hay una minúscula
                minuscula++;
            }else{
                numeros++;
            }
        }

        if (numeros > 5 && minuscula > 1 && mayuscula > 2  ){ //una vez terminado el ciclo for, determina la seguridad de las contraseñas
            return "Fuerte";
        }else return "Débil";

    }
}
*/