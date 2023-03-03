package br.com.newton.main;
import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {

        String nome;
        String numero;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um nome de contato: ");
        nome = ler.next();
        System.out.println("Informe o numero de telefone do contato: ");
        numero = ler.next();

        if (numero.length() == 9) {
            System.out.println("Obrigado por utilizar este codigo: ");
        }
        else {
            System.out.println("O numero informado está inválido: ");
        }





    }
}
