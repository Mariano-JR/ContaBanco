import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Banco da DIO.");
        System.out.println("Para que possamos processeguir com sua solicitação, precisaremos de alguns dados que seram solicitados a seguir:");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, Digite o número da Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, Digite o Nome do Cliente: ");
        String nome = scanner.next();

        System.out.println("Por favor, Digite o Sobrenome do Cliente: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor, Digite o valor do seu primeiro Deposito: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque!");
    }
}
