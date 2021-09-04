import javax.swing.*;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        //Crea una aplicación que nos convierta un número en base decimal a binario.
        //Esto lo realizara un método al que le pasaremos el numero como parámetro,
        //devolverá un String con el numero convertido a binario. Para convertir un numero decimal a binario,
        //debemos dividir entre 2 el numero y el resultado de esa división se divide entre 2 de nuevo hasta que no se pueda dividir mas,
        //el resto que obtengamos de cada división formara el numero binario, de abajo a arriba.
        int num = 105;

        System.out.println(getBinario(num));
    }

    private static String getBinario(int num) {
     int divisor = 2;
     String binario = "";
     for(int i = num; i > 0; i/=2){
       String resto = String.valueOf((i % divisor));
       binario = resto + binario;
     }
     return binario;
    }
}
