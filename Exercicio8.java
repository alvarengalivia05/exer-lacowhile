import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador;
        double nota1;
        double nota2;
        double media;

        contador = 0;

        while (contador < 5) {

            do {
                System.out.println("Digite a primeira nota:");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.println("Digite a segunda nota:");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;

            System.out.println("Média do aluno: " + media);

            contador++;
        }

        entrada.close();
    }
}