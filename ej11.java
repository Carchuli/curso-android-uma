import java.util.Scanner;

public class ej11 {
    static boolean esPrimo(int n) {
        if (n==1) return false;
        for(int i=2; i<n; i++) {
            if(n%i==0)return false;
        }
        return true;


    }
    public static void main(String[] args) {
        int suma=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("comienza a introducir tu lista d enumero, cero para terminar");
        int siguiente;
        do{
            siguiente=teclado.nextInt();
            if(esPrimo(siguiente)){
                suma+=siguiente;
            }


        }while(siguiente!=0);
        System.out.println("La suma de los primos contenidos en la cadena es :" + suma);
    }

}
