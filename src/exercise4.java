import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        //Crea una aplicación que nos calcule el factorial de un número pedido por teclado, lo realizara mediante un método al que le pasamos el número como parámetro.
        // Para calcular el factorial, se multiplica los números anteriores hasta llegar a uno. Por ejemplo, si introducimos un 5, realizara esta operación 5*4*3*2*1=120.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int num = sc.nextInt();
        System.out.println("El resultado del factorial es: "+getFactorial(num));

    }
    private static int getFactorial(int num) {
        int acumulado = 1;
        for(int i = 1; i <= num ; i++){
            acumulado=acumulado*i;
        }
        return acumulado;
    }
}
