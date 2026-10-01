import java.util.Scanner;

public class Exercio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo;
        int quantidade;
        int continuar;
        double preco;
        double totalProduto;
        double totalCompra;

        totalCompra = 0;
        continuar = 1;

        while (continuar == 1) {

            System.out.println("Digite o código do produto:");
            codigo = entrada.nextInt();

            System.out.println("Digite a quantidade:");
            quantidade = entrada.nextInt();

            preco = 0;

            if (codigo == 1) {
                preco = 1.20;
            } else if (codigo == 2) {
                preco = 1.30;
            } else if (codigo == 3) {
                preco = 1.50;
            } else if (codigo == 4) {
                preco = 1.20;
            } else if (codigo == 5) {
                preco = 1.30;
            } else if (codigo == 6) {
                preco = 1.00;
            }

            totalProduto = preco * quantidade;
            totalCompra = totalCompra + totalProduto;

            System.out.println("Valor do produto: " + totalProduto);

            System.out.println("Deseja continuar comprando? (1 = sim / 0 = não)");
            continuar = entrada.nextInt();
        }

        System.out.println("Valor total da compra: " + totalCompra);

        entrada.close();
    }
}