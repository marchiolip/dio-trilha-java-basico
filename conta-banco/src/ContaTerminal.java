import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta.");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência.");
        String agencia = sc.nextLine();
        System.out.println("Número da agência: "+agencia);
        

        System.out.println("Digite o seu nome.");
        String nome = sc.nextLine();
        System.out.println("Olá, " + nome + "! Bem-vindo!");
        
        System.out.println("Digite o seu saldo.");
        double saldo = sc.nextDouble();
        
        
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
