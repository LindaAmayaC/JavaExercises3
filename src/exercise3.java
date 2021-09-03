import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        //Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por parámetro para que nos indique si es o no un número primo
        // debe devolver true si es primo sino false.
        //Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
        //Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int num = sc.nextInt();

        if(getEsprimo(num) == true){
            System.out.println("El numero si es primo");
        }else{
            System.out.println("El numero no es primo");
        }

    }

    private static boolean getEsprimo(int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2 ; i < num ; i++) {
            if (num % i < 1 ) {
                return false;
            }
        }
        return true;
    }
}
