package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App extends JFrame implements ActionListener {

    private JTextField tA, tB, tC, result, r1t, r2t;
    private JLabel lA, lB, lC, title, delta, r1, r2;
    private JPanel panel;
    private JButton compile, clean;

    public App() {

        setLayout(null);
        setResizable(false);
        setLocation(635, 300);

        title = new JLabel("Obliczanie delty i miejsc zerowych");
        title.setBounds(5, -25, 450, 100);
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(Color.BLUE);
        add(title);

        lA = new JLabel("A");
        lA.setBounds(25, 25, 100, 100);
        add(lA);

        tA = new JTextField();
        tA.setBounds(40, 63, 100, 25);
        add(tA);

        lB = new JLabel("B");
        lB.setBounds(170, 25, 100, 100);
        add(lB);

        tB = new JTextField();
        tB.setBounds(185, 63, 100, 25);
        add(tB);

        lC = new JLabel("C");
        lC.setBounds(310, 25, 100, 100);
        add(lC);

        tC = new JTextField();
        tC.setBounds(325, 63, 100, 25);
        add(tC);

        compile = new JButton("Oblicz");
        compile.setBounds(250, 100, 150, 25);
        compile.setFont(new Font("Arial", Font.ITALIC, 25));
        compile.addActionListener(this);
        add(compile);
        
        clean = new JButton("Clear");
        clean.setBounds(50, 100, 150, 25);
        clean.setFont(new Font("Arial", Font.ITALIC, 25));
        clean.addActionListener(this);
        add(clean);

        result = new JTextField();
        result.setBounds(80, 147, 400, 25);
        result.setBackground(Color.DARK_GRAY);
        add(result);

        delta = new JLabel("Delta =");
        delta.setBounds(5, 110, 100, 100);
        delta.setFont(new Font("Arial", Font.ITALIC, 18));
        add(delta);
    }

    public static void main(String[] args) {
        App t = new App();
        t.setTitle("Delta 1.0.0 ©mk");
        t.setVisible(true);
        t.setDefaultCloseOperation(EXIT_ON_CLOSE);
        t.setSize(500, 225);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object zrodlo = e.getSource();                // tutaj chyba tworzy sie wybor ktory button mozna uzyc w if... see below getSource()!!

        if (compile == zrodlo) {
            int a = Integer.parseInt(tA.getText());
            int b = Integer.parseInt(tB.getText());
            int c = Integer.parseInt(tC.getText());

            Oblicz a1 = new Oblicz(a, b, c);
            String r = a1.obliczanie();
            
            result.setForeground(Color.YELLOW);
            result.setFont(new Font("Arial", Font.BOLD, 12));
            result.setText(r);
        }
        else if (clean == zrodlo) {
            result.setText("");
            tA.setText("");
            tB.setText("");
            tC.setText("");
        }

    }

}


//dodac ify to delty