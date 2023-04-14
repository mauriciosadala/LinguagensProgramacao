import javax.swing.*;

public class Cantina {
    public static void main(String[] args) {

        //apos identificar a nossa identidade fote pedido iniciamos criando uma instancia de Pedido
        //mas entendendo que Pedido possui itens dentro dele que prescisarao ser preenchidos.
        Pedido p = new Pedido();
        //Cliente já é um Pedido que prescisamos instanciar
        Cliente c = new Cliente();

        String nome = JOptionPane.showInputDialog("informe o nome do cliente: ");
        c.nome = nome;
        p.c = c;

        //Massa será o próximo objeto a ser preenchido
        Massa m = new Massa();
        String tipoMassa = JOptionPane.showInputDialog("informe o nome da massa: ");
        m.tipo = tipoMassa;
        double valorMassa = Double.parseDouble(JOptionPane.showInputDialog("informe o valor da massa: "));
        m.valor = valorMassa;
        p.m = m;

        int opcao = 0;

        Ingrediente ingrediente = new Ingrediente();

        while (opcao != 5){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "informe os ingredientes escolhidos:\n1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Sair"));

            if(opcao == 1){
                ingrediente.nome = "Bacon";
                p.listaIngredientes.add(ingrediente);
            }
            if(opcao == 2){
                ingrediente.nome = "Mussarela";
                p.listaIngredientes.add(ingrediente);
            }
            if(opcao == 3){
                ingrediente.nome = "Tomate";
                p.listaIngredientes.add(ingrediente);
            }
            if(opcao == 4){
                ingrediente.nome = "Queijo";
                p.listaIngredientes.add(ingrediente);
            }
            if(opcao == 5){

            }
        }
    }
}
