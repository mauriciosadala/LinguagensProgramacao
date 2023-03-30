import javax.swing.*;
import java.awt.Container;
import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class Tela extends JFrame{

    private static final long serialVersion =1L;

    public static void main(String[] args)
    {
        Tela field = new Tela();
        field.testaJFormattedTextField();
    }
    private void testaJFormattedTextField() {
        Container janela = getContentPane();
        setLayout(null);

        //Define os rótulos dos botões
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelNV = new JLabel("Nome Veículo: ");
        JLabel labelDC = new JLabel("Dados do cliente: ");
        JLabel labelPlaca = new JLabel("Placa: ");
        JLabel labelAno = new JLabel("Ano: ");
        JLabel labelDtaL = new JLabel("Data Locação: ");
        JLabel labelDtaE = new JLabel("Data Entrega: ");
        JLabel labelDV = new JLabel("Dados do veiculo: ");

        labelNome.setBounds(50, 40, 100, 20);
        labelTel.setBounds(50, 120, 100, 20);
        labelCpf.setBounds(50, 80, 100, 20);
        labelNV.setBounds(50, 200, 100, 20);
        labelDC.setBounds(35,15,200,20);
        labelPlaca.setBounds(50,240,100,20);
        labelAno.setBounds(50,280,100,20);
        labelDtaL.setBounds(50,320,100,20);
        labelDtaE.setBounds(50,360,100,20);
        labelDV.setBounds(35,175,200,20);

        //Define as máscaras
        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraNV = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraDtaL = null;
        MaskFormatter mascaraDtaE = null;

        try {

            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraPlaca = new MaskFormatter("???#?##");
            mascaraAno = new MaskFormatter("####");
            mascaraDtaL = new MaskFormatter("##/##/####");
            mascaraDtaE = new MaskFormatter("##/##/####");


            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraPlaca.setPlaceholderCharacter('_');
            mascaraAno.setPlaceholderCharacter('_');
            mascaraDtaL.setPlaceholderCharacter('_');
            mascaraDtaE.setPlaceholderCharacter('_');

        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        //Seta as máscaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextNv = new JFormattedTextField(mascaraNV);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextDtaL = new JFormattedTextField(mascaraDtaL);
        JFormattedTextField jFormattedTextDtaE = new JFormattedTextField(mascaraDtaE);
        jFormattedTextNome.setBounds(150, 40, 300, 20);
        jFormattedTextTel.setBounds(150, 120, 100, 20);
        jFormattedTextCpf.setBounds(150, 80, 100, 20);
        jFormattedTextNv.setBounds(150, 200, 100, 20);
        jFormattedTextPlaca.setBounds(150,240,100,20);
        jFormattedTextAno.setBounds(150,280,100,20);
        jFormattedTextDtaL.setBounds(150,320,100,20);
        jFormattedTextDtaE.setBounds(150,360,100,20);

        //Adiciona os rótulos e os campos de textos com máscaras na tela
        janela.add(labelNome);
        janela.add(labelTel);
        janela.add(labelCpf);
        janela.add(labelNV);
        janela.add(labelDC);
        janela.add(labelPlaca);
        janela.add(labelAno);
        janela.add(labelDtaL);
        janela.add(labelDtaE);
        janela.add(labelDV);
        janela.add(jFormattedTextNome);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextNv);
        janela.add(jFormattedTextPlaca);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextDtaL);
        janela.add(jFormattedTextDtaE);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
