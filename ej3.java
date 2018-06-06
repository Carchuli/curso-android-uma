import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double teoria,practica;
        System.out.println("Introduce la nota de la teoria");
        teoria=teclado.nextDouble();
        System.out.println("Introduce la nota de la practica");
        practica=teclado.nextDouble();

        System.out.println("La nota final es: " + ((0.7*teoria)+(0.3*practica)));
    }
}
