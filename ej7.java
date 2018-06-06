import java.util.Scanner;

public class ej7 {
        static final int precio_unidad = 100;
        static final double iva = 0.12;
        static final double descuento =0.05;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de articulos que vas a comprar");
        int cantidad=teclado.nextInt();
        double precio=(cantidad*precio_unidad) +(cantidad*precio_unidad)*iva ;

        if(precio>300){
            precio-=(precio*descuento);
        }
        System.out.println("El precio final es " + precio);




    }
}
