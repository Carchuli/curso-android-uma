import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de bytes :");
        int bytes=teclado.nextInt();
        int kb=0;
        do{
            bytes-=1024;
            kb++;

        }while (bytes> 1024);
        int mb=0;
        do{
            kb-=1024;
            mb++;

        }while(kb>1024);
        System.out.println("MB: " + mb + "  KB: "+kb+ "  Bytes: "+bytes);
    }
}
