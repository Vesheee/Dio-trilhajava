import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da Agência! ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        System.out.println("Digite a Agência! ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do Cliente! ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o seu Saldo! ");
        double saldo = scanner.nextDouble();
        
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                         nomeCliente, agencia, numero, saldo));

         scanner.close();

    }
}
