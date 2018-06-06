import java.util.Scanner;

     //Se lanza una excepcion porque el teclado esta esperando un int,
     // y yo le estoy metiendo un string
public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        System.out.println("tu numero es: " + numero);

    }
}
