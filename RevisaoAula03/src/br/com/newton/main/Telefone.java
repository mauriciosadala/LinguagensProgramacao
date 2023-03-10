package br.com.newton.main;

import br.com.newton.agenda.Contato;

import java.util.Scanner;

public class Telefone {

    public static void main(String[] args) {

        // metodo scanner
        Scanner ler = new Scanner(System.in);


        // criando objeto da classe contato
        Contato contato = new Contato();


        //atributos
        String numero, nome;


        //utilizando o scanner para pegar os dados do teclado e atualizando via setter o atributo
        System.out.println("Digite o nome do contato: ");
        nome = ler.next();
        contato.setNome(nome);


        //utilizando o scanner para pegar os dados do teclado e atualizando via setter o atributo
        System.out.println("Digite  o número do contato: ");
        numero = ler.next();
        contato.setNumero(numero);

        contato.Excluir(contato);

        if (contato.getNumero().length() == 9) {
            System.out.println("Obrigado por utilizar este código: ");
        }

        else {
            System.out.println("O número informado é inválido: ");
        }

    }
}