import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        IO.print("Escriba su número principal: ");
int numeroPrincipal = teclado.nextInt();

    IO.print("MENÚ - Elija lo que quiere hacer: ");

    IO.print("Sumar a su número");
        IO.print("¿Cuánto le quiere sumar a su número principal? ");
        int numeroParaSumar = teclado.nextInt();


    IO.print("Restar a su número");
        IO.print("¿Cuánto le quiere restar a su número principal? ");
        int numeroParaRestar = teclado.nextInt();


    IO.print("Multiplicar su número");
        IO.print("¿Por qué número quiere multiplicar su número principal? ");
        int numeroParaMultiplicar = teclado.nextInt();
    }
}