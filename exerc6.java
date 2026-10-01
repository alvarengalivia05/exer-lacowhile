import java.util.Scanner;

public class exerc6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador;
        int numero;
        int menor;

        contador = 0;

        System.out.println("Digite o 1º número:");
        menor = entrada.nextInt();

        contador = 1;

        while (contador < 10) {

            System.out.println("Digite o " + (contador + 1) + "º número:");
            numero = entrada.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número é: " + menor);

        entrada.close();
    }
}