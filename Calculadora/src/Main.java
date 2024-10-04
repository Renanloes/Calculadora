
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultado;

    public Main(){

    setTitle("calculadora");
    setSize(1000, 100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    //num1Field.setBounds(200, 150, 100, 50);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());

    num1Field = new JTextField(10);
    num2Field = new JTextField(10);
    JButton addbotao = new JButton("Adicionar");
    JButton subtrairbotao = new JButton("Subtrair");
    JButton multiplicarbotao = new JButton("Multiplicar");
    JButton divbotao = new JButton("Dividir");
    resultado = new JLabel("Resultado");

    panel.add(new JLabel("Numero 1"));

    panel.add(num1Field);
    panel.add(new JLabel("Numero 2"));
    panel.add(num2Field);
    panel.add(addbotao);
    panel.add(subtrairbotao);
    panel.add(multiplicarbotao);
    panel.add(divbotao);
    panel.add(resultado);
    add(panel);

    addbotao.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            operacaoMatematica('+');
        }
    });

    subtrairbotao.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            operacaoMatematica('-');
        }
    });

    multiplicarbotao.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            operacaoMatematica('*');
        }
    });

    divbotao.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            operacaoMatematica('/');
        }
    });

    }
    private void operacaoMatematica(char operador){

    try {
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double resultadob = 0;

        switch (operador) {
            case '+':resultadob = num1+num2; break;
            case '-':resultadob = num1-num2; break;
            case '*':resultadob = num1*num2; break;
            case '/':
                 if (num2 !=0){
                    resultadob = num1/num2;
                 }else{
                    resultado.setText("Erro: Divisão por zero!");
                    return;
        }
        break;
    }
    resultado.setText("Resultado: "+ resultadob);
    }catch (Exception e){
        resultado.setText("Erro: Entrada inválida");
    }
}
        

    public static void main(String[] args) throws Exception {
        Main frame = new Main();
        frame.setVisible(true);
    }
}
