import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Dados iniciais do cliente: ");
        System.out.print("Nome: ");
        String nome = leia.nextLine();
        System.out.print("Tipo de conta: ");
        String conta = leia.nextLine();
        System.out.print("Saldo da conta: ");
        double saldo = leia.nextDouble();
        //

        System.out.println();

        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo da conta: " + saldo);

        System.out.println();
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Operações"
                    + "\n"
                    + "1 - Consultar saldos\n"
                    + "2 - Receber valor\n"
                    + "3 - Transferir valor\n"
                    + "4 - Sair\n"
                    + "\n"
                    + "Digite a opção");
            opcao = leia.nextInt();

            System.out.println();
            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite um valor para deposito: ");
                    double deposito = leia.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite um valor para transferir: ");
                    double transferir = leia.nextDouble();
                    saldo -= transferir;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


        leia.close();
    }
}
