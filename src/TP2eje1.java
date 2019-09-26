import java.util.Scanner;

public class TP2eje1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arr[] = new int[10];
        int posi=0;
        int nega=0;
        int cero=0;

        for(int i=0;i<10;i++){
            System.out.println("Ingrese número en la posición "+i);
            arr[i]= entrada.nextInt();
        }

        for(int valor:arr) {
            if(valor>0) {
                posi++;
            }else {
                if(valor<0) {
                    nega++;
                }else {
                    cero++;
                }
            }
        }

        System.out.print("En el arreglo hay "+cero+ "ceros, "+ posi+" números positivos y "+nega+" números negativos");
    }
}
