package org.rafael.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class ContaTerminal{

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static void main(String[] args) {

        iniciaConta();
    }


    static void iniciaConta(){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do CLiente !");
        String nome = scanner.next();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nome, saldo);
        contaTerminal.exibeConta();
    }

    public void exibeConta(){
        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }


}
