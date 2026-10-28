import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        int resta=0;
        int numero1=0;
        int numero2=0;
        int multiplicar=0;
        System.out.print("Escriba su número principal: ");
        numero = teclado.nextInt();

        System.out.print("MENÚ - Elija lo que quiere hacer: ");
        System.out.print("1. Sumar a su número");
        System.out.print("2. Restar a su número");
        System.out.print("3. Multiplicar su número");
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Introduce dos numeros: ");
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                return suma;
                break;
            case 2:
                System.out.print("Introduce el número que quiere restar a su número principal: ");
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                return resta;
                break;
            case 3:
                System.out.print("Introduce el número por el que quiere multiplicar su número principal: ");
                numero1 = teclado.nextInt();
                numero2 = teclado.nextInt();
                return multiplicar;
                break;
        }
    }
}