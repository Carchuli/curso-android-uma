import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce numeros, usa 0 para salir");
        int n;
        n=teclado.nextInt();
        int cont=0;
        int cont_neg=0;


        while(n!=0){
            if(n<0){
                cont_neg++;
            }

            cont++;

            n=teclado.nextInt();

        }
        System.out.println("Numero de negativos encontrados: " + cont_neg + "  Numero de numeros leidos totales: "+cont);
    }
}
