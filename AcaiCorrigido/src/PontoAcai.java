import javax.swing.*;

public class PontoAcai {
    public static void main(String[] args) {

        String tamanho, desejaSorvete;

        tamanho = JOptionPane.showInputDialog("Ponto do Acai\nEscolha a opção:\nP - 300ml\nM - 500ml\nG - 700ml");
        desejaSorvete = JOptionPane.showInputDialog("Deseja acrescimo de sorvete?\nS - SIM\nN - NÃO");

        Acai acai = new Acai();

        Boolean acrescimoSorvete;

        if (desejaSorvete.equals("S")){
            acrescimoSorvete = true;
        }
        else {
            acrescimoSorvete = false;
        }
        double valorTotal = acai.CalculaValor(acrescimoSorvete, tamanho);

        JOptionPane.showMessageDialog(null,"O valor é\n"+ valorTotal);

        }
    }

