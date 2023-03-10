package br.com.newton.main;

import br.com.newton.agenda.Contato;

import javax.swing.*;
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
        nome = JOptionPane. showInputDialog("Digite o nome do contato");
        contato.setNome(nome);


        //utilizando o scanner para pegar os dados do teclado e atualizando via setter o atributo
        numero = JOptionPane. showInputDialog("Digite o numero do contato");
        contato.setNumero(numero);

        contato.Excluir(contato);
        contato.Incluir(contato);

        if (contato.getNumero().length() != 9)
            JOptionPane.showMessageDialog(null,"Numero de Telefone inválido: " + contato.getNumero());
        else
            JOptionPane.showMessageDialog(null,"Contato " + contato.getNome()+ " cadastrado");


    }
}