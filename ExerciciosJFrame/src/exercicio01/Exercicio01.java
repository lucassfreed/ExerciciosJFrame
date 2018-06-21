package exercicio01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
            jTextFieldPreco;
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
    private JTextArea jTextAreaDescricao;
    private JScrollPane jScrollPaneDescricao;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        estilizarRadioButton();
        estilizarCheckBox();
        estilizarComboBox();
        acaoBotaoCancelar();
        acaoBotaoSalvar();
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
        jLabelDescricao = new JLabel("Descrição");
        jButtonCancelar = new JButton("Cancelar");
        jButtonSalvar = new JButton("Salvar");
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
        jTextAreaDescricao = new JTextArea();
        jScrollPaneDescricao = new JScrollPane();

    }

    private void gerarDimensoes() {
        jLabelNome.setSize(50, 28);
        jLabelIdade.setSize(50, 28);
        jLabelRaca.setSize(50, 28);
        jLabelApelido.setSize(50, 28);
        jLabelPreco.setSize(50, 28);
        jLabelDescricao.setSize(80, 28);
        jButtonCancelar.setSize(145, 80);
        jButtonSalvar.setSize(145, 80);
        jTextFieldNome.setSize(368, 25);
        jTextFieldIdade.setSize(207, 25);
        jTextFieldApelido.setSize(173, 25);
        jTextFieldPreco.setSize(207, 25);
        jComboBoxRaca.setSize(163, 25);
        jRadioButtonVivo.setSize(50, 28);
        jRadioButtonMorto.setSize(100, 28);
        jRadioButtonRacao.setSize(100, 28);
        jRadioButtonComeAlmocos.setSize(180, 28);
        jCheckBoxAdestrado.setSize(120, 28);
        jCheckBoxCastrado.setSize(120, 28);
        jCheckBoxVacinado.setSize(120, 28);
        jCheckBoxTemPedrigree.setSize(120, 28);
        jScrollPaneDescricao.setSize(627, 90);
    }

    private void gerarLocalizacoes() {
        jLabelNome.setLocation(5, 5);
        jLabelIdade.setLocation(425, 5);
        jLabelRaca.setLocation(5, 60);
        jLabelApelido.setLocation(200, 60);
        jLabelPreco.setLocation(425, 60);
        jLabelDescricao.setLocation(5, 185);
        jButtonCancelar.setLocation(333, 320);
        jButtonSalvar.setLocation(488, 320);
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
        jScrollPaneDescricao.setLocation(7, 215);

    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelRaca);
        jFrame.add(jLabelPreco);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonCancelar);
        jFrame.add(jLabelDescricao);
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
        jFrame.add(jScrollPaneDescricao);
    }

    private void estilizarComboBox() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(
                new Object[]{
                    "Pastor-alemão",
                    "Poodle",
                    "Beagle",
                    "Golden retriever",
                    "Chihuahua",
                    "Pug",
                    "Rottweiler",
                    "Boxer",
                    "Buldogue francês"
                }
        );
        jComboBoxRaca.setModel(modelo);
        jComboBoxRaca.setSelectedIndex(-1);
    }

    private void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String texto = "Os seguintes campos não foram preenchidos:";
                if (jTextFieldNome.getText().equals("")) {
                    texto += "\n • Nome";
                    jTextFieldNome.requestFocus();
                }
                
                if (jComboBoxRaca.getSelectedIndex() == -1) {
                    texto += "\n • Raça";
                    jComboBoxRaca.requestFocus();
                }
                
                if (jTextFieldApelido.getText().equals("")) {
                    texto += "\n • Apelido";
                    jTextFieldApelido.requestFocus();
                }
                
                if (jTextFieldPreco.getText().equals("")) {
                    texto += "\n • Preço";
                    jTextFieldNome.requestFocus();
                }
                
                if (jRadioButtonVivo.isSelected()) {
                    texto += "\n • Vivo";
                    jRadioButtonVivo.requestFocus();
                }
                
                if (jRadioButtonMorto.isSelected()) {
                    texto += "\n • Morto";
                    jRadioButtonMorto.requestFocus();
                }
                
                if (jRadioButtonRacao.isSelected()) {
                    texto += "\n • Ração";
                    jRadioButtonRacao.requestFocus();
                }
                
                if (jRadioButtonComeAlmocos.isSelected()) {
                    texto += "\n • Come almoços, jantas";
                    jRadioButtonComeAlmocos.requestFocus();
                }
                
                if (jCheckBoxAdestrado.isSelected()) {
                    texto += "\n • Adestrado";
                    jCheckBoxAdestrado.requestFocus();
                }
                
                if (jCheckBoxVacinado.isSelected()) {
                    texto += "\n • Vacinado";
                    jCheckBoxVacinado.requestFocus();
                }
                
                if (jCheckBoxCastrado.isSelected()) {
                    texto += "\n • Castrado";
                    jCheckBoxCastrado.requestFocus();
                }
                
                if (jCheckBoxTemPedrigree.isSelected()) {
                    texto += "\n • Tem Pedrigree";
                    jCheckBoxTemPedrigree.requestFocus();
                }
                
                if (jTextAreaDescricao.getText() == "") {
                    texto += "\n • Descrição";
                    jTextAreaDescricao.requestFocus();
                }
                
                JOptionPane.showMessageDialog(null, texto);
            }
        });

    }

    private void acaoBotaoCancelar() {
        jButtonCancelar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jTextFieldNome.setText(null);
                jTextFieldIdade.setText(null);
                jComboBoxRaca.setSelectedIndex(-1);
                jTextFieldApelido.setText(null);
                jTextFieldPreco.setText(null);
                jRadioButtonVivo.setSelected(false);
                jRadioButtonMorto.setSelected(false);
                jRadioButtonRacao.setSelected(false);
                jRadioButtonComeAlmocos.setSelected(false);
                jCheckBoxAdestrado.setSelected(false);
                jCheckBoxVacinado.setSelected(false);
                jCheckBoxCastrado.setSelected(false);
                jCheckBoxTemPedrigree.setSelected(false);
                jTextAreaDescricao.setText(null);
            }
        });
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
        jScrollPaneDescricao.setViewportView(jTextAreaDescricao);
        jScrollPaneDescricao.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneDescricao.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaDescricao.setLineWrap(true);

    }

}
