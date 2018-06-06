import java.util.Scanner;

public class ej10 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el numero a encontrar");
        int numero=teclado.nextInt();
        int siguiente;
        boolean encontrado=false;
        System.out.println("Empieza la secuncia, utiliza 0 para terminar");
        do{
            siguiente=teclado.nextInt();
            if(siguiente==numero){
                encontrado=true;

            }

        }while(siguiente!=0);

        if(encontrado){
            System.out.println("Tu numero estaba en la secuencia");
        } else System.out.println("tu numero no estaba en la secuencia");
    }


}
