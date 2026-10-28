import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int numero1 = 0;
        int resultado = 0;

        System.out.print("Escriba su número principal: ");
        numero = teclado.nextInt();

        System.out.println("MENÚ - Elija lo que quiere hacer: ");
        System.out.println("1. Sumar a su número");
        System.out.println("2. Restar a su número");
        System.out.println("3. Multiplicar su número");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce el número que quiere sumar a su número principal: ");
                numero1 = teclado.nextInt();
                resultado = suma(numero, numero1);
                break;
            case 2:
                System.out.print("Introduce el número que quiere restar a su número principal: ");
                numero1 = teclado.nextInt();
                resultado = resta(numero, numero1);
                break;
            case 3:
                System.out.print("Introduce el número por el que quiere multiplicar su número principal: ");
                numero1 = teclado.nextInt();
                resultado = multiplicar(numero, numero1);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}