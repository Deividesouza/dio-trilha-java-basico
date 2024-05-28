import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        // Todo conhecer a classe Scanner
        String nomecliente;
        String agencia ;
        int numero = 0;
        double saldo = 0;

        //Exbir as mensagens para o nosso usuario

        // obter pelo scanner os valores digitados no terminal

        System.out.println("Por favor, digite o nome do Cliente!");
        nomecliente = entrada.nextLine();
        System.out.println("Por favor, digite o numero da Agência!");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite o numero da Conta!");
        numero = entrada.nextInt();
        System.out.println("Por favor, digite o Saldo da Conta");
        saldo = entrada.nextDouble();

        //exbir a mensagem conta criada
        System.out.println("Olá " +  nomecliente +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo  + " já está disponível para saque.");
        entrada.close();
    }
}
