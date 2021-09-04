import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        //Crea una aplicación que nos cuente el número de cifras de un número entero positivo (hay que controlarlo) pedido por teclado.
        //Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int num = sc.nextInt();

        System.out.println("el numero tiene "+ getCifras(num) +" cifras");
    }

    private static int getCifras(int num) {
        int numCifras = 0;
        int novalido =0;
        if (num / 10 == 0 && num >= 0) {
            return numCifras = 1;
        }
        if (num / 100 == 0 && num >= 0) {
            return numCifras = 2;
        }
        if (num / 1000 == 0 && num >= 0) {
            return numCifras = 3;
        }
        if (num / 10000 == 0 && num >= 0) {
            return numCifras = 4;
        }
        return novalido;
    }
}
