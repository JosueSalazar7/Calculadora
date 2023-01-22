import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCalculadora {
    String guardar1, signo,guardar3;
    private JButton Cerrar_botton;
    private JButton button_max;
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
    private JLabel texto_log;
    private JPanel panel_prin;
    private JButton button1;
    private JButton ACButton;
    private JButton button3;
    private JLabel Pantalla;
    private JButton Suma;
    private JButton Multiplcar;

    public VentanaCalculadora() {

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"1");
            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"2");
            }
        });


        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"3");
            }
        });


        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"4");
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"5");
            }
        });


        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"6");
            }
        });


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"7");
            }
        });


        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"8");
            }
        });


        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText(Pantalla.getText()+"9");
            }
        });
        coma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String punto;
                punto=Pantalla.getText();
                if (punto.length()<=0){
                    Pantalla.setText("0.");
                }else {
                    if (!existepunto(Pantalla.getText())){
                        Pantalla.setText(Pantalla.getText()+".");
                    }
                }
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena;
                cadena=Pantalla.getText();

                if (cadena.length()>0){
                    cadena=cadena.substring(0,cadena.length()-1);
                    Pantalla.setText(cadena);
                }
            }
        });
        ONEncender.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla.setText("");
            }
        });
        button_Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Pantalla.getText().equals("")){
                    guardar1=Pantalla.getText();
                    signo="-";
                    Pantalla.setText("");
                }
            }
        });
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Pantalla.getText().equals("")){
                    guardar1=Pantalla.getText();
                    signo="+";
                    Pantalla.setText("");
                }
            }
        });
        Multiplcar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Pantalla.getText().equals("")){
                    guardar1=Pantalla.getText();
                    signo="*";
                    Pantalla.setText("");
                }
            }
        });
        button_Divisi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!Pantalla.getText().equals("")){
                    guardar1=Pantalla.getText();
                    signo="/";
                    Pantalla.setText("");
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respuesta;
                guardar3=Pantalla.getText();

                if (!guardar3.equals("")){
                    respuesta=calculadora(guardar1,guardar3,signo);
                    Pantalla.setText(respuesta);
                }
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
    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado=false;

        for (int i=0;i<cadena.length();i++){
            if (cadena.substring(i,i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    public static String calculadora(String memoria1,String memoria2, String signo){
        double resultado=0.0;
        String respuesta;

        if (signo.equals("-")){
            resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
        }
        if (signo.equals("+")){
            resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
        }
        if (signo.equals("*")){
            resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
        }
        if (signo.equals("/")){
            resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
        }
        respuesta= String.valueOf(resultado);
        return respuesta;
    }
}
