import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce n");
        int n = teclado.nextInt();
        int suma=0;
        int cont=0;
        while(cont<=n){
            suma+=cont;
            cont++;

        }
        System.out.println("Suma usando while: "+ suma);

        suma=0;
        cont=0;
        do{
            suma+=cont;
            cont++;
        }while(cont<=n);
        System.out.println("Suma usando do-while: "+ suma);

        suma=0;


        for(cont=0;cont<=n;cont++){
            suma+=cont;

        }
        System.out.println("Suma usando for: "+ suma);
    }


}
