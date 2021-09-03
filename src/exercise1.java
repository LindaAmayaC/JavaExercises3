import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
        //Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área.
        // Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla
        //Aquí te mostramos que necesita cada figura:
        //Circulo: (radio^2)*PI
        //Triangulo: (base * altura) / 2
        //Cuadrado: lado * lado

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese La figura a calcular área");
        System.out.println("1. Circulo \n2. Triagulo\n3. Cuadrado");
        int figura = sc.nextInt();

        getCalcularArea(figura,sc);
    }
    private static void getCalcularArea(int figura, Scanner sc) {

        switch (figura){
            case 1:
                System.out.println("Ingrese el radio");
                double radio = sc.nextDouble();
                System.out.println("El área del Circulo es de: " + getAreaCirculo(radio));
                break;
            case 2:
                System.out.println("Ingrese la base");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura");
                double altura = sc.nextDouble();
                System.out.println("El área del Triagulo es de: " + getAreaTriangulo(base, altura));
                break;
            case 3:
                System.out.println("Ingrese el valor del lado");
                double lado = sc.nextDouble();
                System.out.println("El área del Cuadrado es de: " + getAreaCuadrado(lado));
                break;
            default:
                System.out.println("Ingrese un numero valido");
        }
    }

    private static double getAreaCirculo(double radio) {
        double areaCirculo = (Math.pow(radio,2)) * Math.PI;
        return areaCirculo;
    }
    private static double getAreaTriangulo(double base,double altura) {
        double areaTriagulo = (base * altura) / 2D;
        return areaTriagulo;
    }
    private static double getAreaCuadrado(double lado) {
        double areaCuadrado = lado * lado;
        return areaCuadrado;
    }

}
