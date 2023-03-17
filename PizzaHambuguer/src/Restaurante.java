import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {

        String opcao = JOptionPane.showInputDialog(null, "Infome o pedido: \n1-Hamburguer \n2-Pizza \n3-Sair");
        if (opcao.equals("2")) {

            Pizza pizza = new Pizza();

            pizza.getNome() = JOptionPane.showInputDialog("Informe o nome da pizza:");

            pizza.getValor() = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da pizza:"));

            String bordaDigitada = JOptionPane.showInputDialog("Você deseja borda recheada?\nsim\nnao");

            boolean bordaParaCalculo;

            if(bordaDigitada.equals("sim")){
                bordaParaCalculo = true;
            }
            else {
                bordaParaCalculo = false;
            }


            double valorTotal= pizza.CalcularValor(bordaParaCalculo);

            JOptionPane.showMessageDialog(null,"Pedido" + valorTotal, "Pedido",JOptionPane.INFORMATION_MESSAGE);



        }
        String opcao = JOptionPane.showInputDialog(null, "Infome o pedido: \n1-Hamburguer \n2-Pizza \n3-Sair");
        if (opcao.equals("2")) {

            Hamburguer hamburguer = new Hamburguer() ;

            hamburguer.getNome() = JOptionPane.showInputDialog("Informe o nome do hamburguer:");

            hamburguer.getValor() = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do hamburguer:"));

            String artesanal = JOptionPane.showInputDialog("É artesanal\nsim\nnao");

            boolean artesanalParaCalculo;

            if(artesanal.equals("sim")){
                artesanalParaCalculo = true;
            }
            else {
                artesanalParaCalculo = false;
            }


            double valorTotal= hamburguer.calcularValor(artesanalParaCalculo);

            JOptionPane.showMessageDialog(null,"Pedido" + valorTotal, "Pedido",JOptionPane.INFORMATION_MESSAGE);



        }
    }
}
