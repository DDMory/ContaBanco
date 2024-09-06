
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("DIGITE O NUMERO DA AGENCIA: ");
        int numero = scanner.nextInt();
        
        
        System.out.println("DIGITE O ID DA AGENCIA: ");
        String agencia = scanner.next();
        
        
        System.out.println("DIGITE SEU NOME E SOBRENOME: ");
        String nomeCliente = scanner.next() + scanner.nextLine();
        
        System.out.println("DIGITE O SALDO QUE QUER INSERIR: ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia );
        System.out.print(", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");
    
    }
}
