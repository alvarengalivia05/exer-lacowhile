import java.util.Scanner;

public class exerc2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador;
        int numero;
        int pares;
        int impares;

        contador = 0;
        pares = 0;
        impares = 0;

        while (contador < 10) {

            System.out.println("Digite o " + (contador + 1) + "º número:");
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);

        entrada.close();
    }
}