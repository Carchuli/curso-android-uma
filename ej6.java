import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce 3 numeros");
        int primero,segundo,tercero;
        primero=teclado.nextInt();
        segundo=teclado.nextInt();
        tercero=teclado.nextInt();

        int mayor=primero;
        if(segundo > mayor){
            mayor=segundo;
        }
        if(tercero>mayor){
            mayor=tercero;
        }
        System.out.println("El mayor es "+ mayor);

    }
}
