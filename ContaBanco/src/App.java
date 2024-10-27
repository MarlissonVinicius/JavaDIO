import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int numero=0;  double saldo=0;
        String nome=" "; String agencia=" ";

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = scan.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = scan.nextInt();

        System.out.print("Digite o valor do depósito inicial: ");
        saldo = scan.nextDouble();
        scan.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = scan.nextLine();

        scan.close();
        System.err.println("");
        System.err.println("Olá "+nome+", obrigado por criar uma conta no nosso banco, o seu saldo inical é de R$"+saldo);

        
    }
}