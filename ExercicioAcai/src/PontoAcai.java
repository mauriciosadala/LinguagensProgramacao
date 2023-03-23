import javax.swing.*;

public class PontoAcai {
    public static void main(String[] args) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Açaí desejado:\n1 - 300 ml\n2 - 500 ml\n3 - 700 ml"));
        boolean acrescimo = JOptionPane.showConfirmDialog(null, "Deseja acréscimo de sorvete?") == JOptionPane.YES_OPTION;
        Acai acai = new Acai(200, acrescimo);
        double valor = acai.calculaValor();
        JOptionPane.showMessageDialog(null, "O seu açaí ficou no valor de: R$ " + String.format("%.2f", valor));
    }
}
