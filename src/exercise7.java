import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        // Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda,
        // estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio (void).
        //El cambio de divisas son:
        //
        //0.86 libras es un 1 €
        //1.28611 $ es un 1 €
        //129.852 yenes es un 1 €
        Scanner sc = new Scanner(System.in);

        System.out.println("Convertir a: \ndolar\nlibras\nyenes ");
        String moneda = sc.nextLine();

        System.out.println("Ingrese la cantidad de Euros");
        int num = sc.nextInt();

        getcambioDeMoneds(num,moneda);
    }

    private static void getcambioDeMoneds(int num, String moneda) {
        double libras = 0.86;
        double dolar = 1.28611;
        double yenes = 129.852;

        switch (moneda){
            case "libras":
                System.out.println("El valor en Libras es de: "+(String.format("%.2f",(libras*num))));
                break;
            case "dolar":
                System.out.println("El valor en dolares es de: "+(String.format("%.5f",(dolar*num))));
                break;
            case "yenes":
                System.out.println("El valor en yenes es de: "+((String.format("%.3f",yenes*num))));
                break;
            default:
                System.out.println("Ingrese una moneda valida");
        }
    }
}
