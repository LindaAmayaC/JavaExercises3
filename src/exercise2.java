import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        //Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado.
        //Crea un método donde pasamos como parámetros entre que números queremos que los genere, podemos pedirlas por teclado antes de generar los números.
        //Este método devolverá un número entero aleatorio. Muestra estos números por pantalla.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros aleatorios a solicitar");
        int cantidadNum = sc.nextInt();
        System.out.println("Ingrese el primer numero");
        int numIncial = sc.nextInt();
        System.out.println("ingrese el ultimo numero");
        int numFinal = sc.nextInt();

        getNumeroAleatorio(numIncial,numFinal,cantidadNum);
    }
    private static void getNumeroAleatorio(int numIncial, int numFinal, int cantidadNum) {

        for(int i = 0 ; i < cantidadNum ; i++ ){
            int numAleatorio = (int) Math.floor(Math.random()*(numIncial-(numFinal+1))+(numFinal));
            System.out.println(numAleatorio);
        }
    }
}
