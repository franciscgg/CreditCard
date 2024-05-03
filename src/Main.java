import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = leitura.nextDouble();
        CreditCard card = new CreditCard(limite);

        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao,valor);
            boolean compraRealizada = card.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:");
        for (Compra c : card.getCompras()) {
            System.out.printf("%s %.2fR$\n", c.getDescricao(), c.getValor());
        }
        System.out.printf("\nSaldo do cartão: %.2fR$\n", card.getSaldo());
        System.out.println("***********************");
    }
}
