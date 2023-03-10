package br.com.newton.agenda;

public class Contato {
    private String nome, numero;


    //metodo sem retorno que tem como parametro um contato
    public void Excluir(Contato excluir){
        System.out.println("Excluindo este contato: " + excluir.nome);
    }

    //metodo sem retorno que tem como parametro um contato, na qual adicionara um novo contato.
    public void Incluir(Contato incluir){
        System.out.println("Digite o nome e o numero do contato:" );
        System.out.println("nome: " + getNome() + "numero: " + getNumero());
    }



    // metodo setter e getter ALT+INSERT ou botao direito depois de ter declarado as váriaveis.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}

