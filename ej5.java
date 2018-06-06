import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int primero = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        int segundo =teclado.nextInt();

        if(segundo%primero==0){
            System.out.println( primero + " es divisor de " +segundo);

        }else if (primero%segundo==0){
            System.out.println( segundo + " es divisor de " +primero);

        } else System.out.println("no ocurre nada");

    }
}
