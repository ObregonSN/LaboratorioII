package PPO;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class tienda {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int tamanio = teclado.nextInt();
        String tipo = teclado.next();
        Movil celular = new Movil(tamanio,tipo);
        System.out.println(celular.getInfo());

    }
}
