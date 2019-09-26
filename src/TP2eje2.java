import java.util.Scanner;

public class TP2eje2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arr[] = new int[10];
        int pares=0;
        int suma=0;

        for(int i=0;i<10;i++){
            System.out.println("Ingrese número en la posición "+i);
            arr[i]= entrada.nextInt();
        }

        for(int i=0;i<10;i++){
            if(i%2==0 && i!=0){
                pares++;
                suma=suma+arr[i];
            }
        }

        System.out.print("La media de las posiciones pares del arreglo es: "+suma/pares);
    }
}
