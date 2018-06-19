package exercicio01;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Lucas Rodrigo Frederico
 */
public class Exercicio01 {

    private JFrame jFrame;
    private JLabel jLabelNome,
            jLabelIdade,
            jLabelRaca,
            jLabelApelido, 
            jLabelPreco, 
            jLabelDescricao;
    private JTextField jTextFieldNome, 
            jTextFieldIdade, 
            jTextFieldApelido,
            jTextFieldPreco, 
            jTextFieldDescricao;
    private JRadioButton jRadioButtonVivo, 
            jRadioButtonMorto,
            jRadioButtonRacao,
            jRadioButtonComeAlmocos;
    private JCheckBox jCheckBoxAdestrado,
            jCheckBoxCastrado, 
            jCheckBoxVacinado,
            jCheckBoxTemPedrigree;
    private JButton jButtonSalvar, jButtonCancelar;
    private JComboBox jComboBoxRaca;
    private JScrollPane jScrollPane;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        estilizarRadioButton();
        estilizarCheckBox();
        jFrame.setVisible(true);
        jFrame.getContentPane().setBackground(Color.decode("#d0d3d8"));
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(656, 450);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void instanciarComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelIdade = new JLabel("Idade");
        jLabelRaca = new JLabel("Raça");
        jLabelApelido = new JLabel("Apelido");
        jLabelPreco = new JLabel("Preço");
        jTextFieldNome = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldApelido = new JTextField();
        jTextFieldPreco = new JTextField();
        jComboBoxRaca = new JComboBox();
        jRadioButtonVivo = new JRadioButton();
        jRadioButtonVivo.setText("Vivo");
        jRadioButtonMorto = new JRadioButton();
        jRadioButtonMorto.setText("Morto");
        jRadioButtonRacao = new JRadioButton();
        jRadioButtonRacao.setText("Ração");
        jRadioButtonComeAlmocos = new JRadioButton();
        jRadioButtonComeAlmocos.setText("Come almoços, jantas");
        jCheckBoxAdestrado = new JCheckBox();
        jCheckBoxAdestrado.setText("Adestrado");
        jCheckBoxCastrado = new JCheckBox();
        jCheckBoxCastrado.setText("Castrado");
        jCheckBoxVacinado = new JCheckBox();
        jCheckBoxVacinado.setText("Vacinado");
        jCheckBoxTemPedrigree = new JCheckBox();
        jCheckBoxTemPedrigree.setText("Tem pedrigree");
        
    }

    private void gerarDimensoes() {
        jLabelNome.setSize(50, 28);
        jLabelIdade.setSize(50, 28);
        jLabelRaca.setSize(50, 28);
        jLabelApelido.setSize(50, 28);
        jLabelPreco.setSize(50, 28);
        jTextFieldNome.setSize(368, 25);
        jTextFieldIdade.setSize(207, 25);
        jTextFieldApelido.setSize(173, 25);
        jTextFieldPreco.setSize(207, 25);
        jComboBoxRaca.setSize(163, 25);
        jRadioButtonVivo.setSize(50, 28);
        jRadioButtonMorto.setSize(150, 28);
        jRadioButtonRacao.setSize(150, 28);
        jRadioButtonComeAlmocos.setSize(180, 28);
        jCheckBoxAdestrado.setSize(180, 28);
        jCheckBoxCastrado.setSize(180, 28);
        jCheckBoxVacinado.setSize(180, 28);
        jCheckBoxTemPedrigree.setSize(180, 28);
    }

    private void gerarLocalizacoes() {
        jLabelNome.setLocation(5, 5);
        jLabelIdade.setLocation(425, 5);
        jLabelRaca.setLocation(5, 60);
        jLabelApelido.setLocation(200, 60);
        jLabelPreco.setLocation(425, 60);
        jTextFieldNome.setLocation(8, 32);
        jTextFieldIdade.setLocation(427, 32);
        jTextFieldApelido.setLocation(203, 87);
        jTextFieldPreco.setLocation(427, 87);
        jComboBoxRaca.setLocation(7, 87);
        jRadioButtonVivo.setLocation(5, 125);
        jRadioButtonMorto.setLocation(5, 155);
        jRadioButtonRacao.setLocation(110, 125);
        jRadioButtonComeAlmocos.setLocation(110, 155);
        jCheckBoxAdestrado.setLocation(355, 125);
        jCheckBoxCastrado.setLocation(490, 125);
        jCheckBoxVacinado.setLocation(355, 155);
        jCheckBoxTemPedrigree.setLocation(490, 155);
        
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jLabelPreco);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jTextFieldApelido);
        jFrame.add(jTextFieldPreco);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jLabelApelido);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonComeAlmocos);
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jCheckBoxTemPedrigree);
    }
    
    private void estilizarRadioButton() {
        jCheckBoxAdestrado.setContentAreaFilled(false);
        jRadioButtonVivo.setContentAreaFilled(false);
        jRadioButtonMorto.setContentAreaFilled(false);
        jRadioButtonRacao.setContentAreaFilled(false);
        jRadioButtonComeAlmocos.setContentAreaFilled(false);
    }
    
    private void estilizarCheckBox() {
        jCheckBoxAdestrado.setContentAreaFilled(false);
        jCheckBoxCastrado.setContentAreaFilled(false);
        jCheckBoxVacinado.setContentAreaFilled(false);
        jCheckBoxTemPedrigree.setContentAreaFilled(false);
    }

    private void configurarJScrollPane() {
        
    }
   
}
