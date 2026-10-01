import java.util.Scanner;

public class exerc7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador;
        double altura;
        double peso;
        double imc;
        int quantidade;

        contador = 0;
        quantidade = 0;

        while (contador < 10) {

            System.out.println("Digite a altura:");
            altura = entrada.nextDouble();

            System.out.println("Digite o peso:");
            peso = entrada.nextDouble();

            imc = peso / (altura * altura);

            System.out.println("IMC: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                quantidade++;
            }

            contador++;
        }

        System.out.println("Quantidade de pessoas com IMC entre 18,5 e 24,9: " + quantidade);

        entrada.close();
    }
}