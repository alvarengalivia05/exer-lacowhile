import java.util.Scanner;

public class exerc3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador;

        System.out.println("Digite um número inteiro:");
        numero = entrada.nextInt();

        contador = 1;

        while (contador <= numero) {
            System.out.println(contador);
            contador = contador * 2;
        }

        entrada.close();
    }
}