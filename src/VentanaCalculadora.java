import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCalculadora {
    private JButton Cerrar_botton;
    private JButton button_max;
    private JButton button_Suma;
    private JButton Button_Multiplicacion;
    private JButton button_Divisi;
    private JButton button_Resta;
    private JButton a9Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton ONEncender;
    private JButton a0Button;
    private JButton coma;
    private JPanel panel1;
    private JLabel Mostrar_Resultado;
    private JLabel texto_log;
    private JPanel panel_prin;
    private JButton button1;
    private JButton ACButton;
    private JButton button3;

    public VentanaCalculadora() {

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaCalculadora");
        frame.setContentPane(new VentanaCalculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
