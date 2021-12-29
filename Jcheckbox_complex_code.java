import javax.swing.*;
import java.awt.event.*;
public class Jcheckbox_complex_code extends JFrame implements  ActionListener {
    JButton jButton;
    JCheckBox c1 , c2 , c3 , c4 ;
    JLabel jLabel;
    Jcheckbox_complex_code(){
        jLabel = new JLabel("Food ordering system");
        jLabel.setBounds(80,50,300,20);
        c1 = new JCheckBox("Pizza @100");
        c1.setBounds(100,100,150,20);
        c2 = new JCheckBox("Burger @50");
        c2.setBounds(100,150,150,20);
        c3 = new JCheckBox(" Cold Coffee @40");
        c3.setBounds(100,200,150,20);
        c4 = new JCheckBox("Chowmein @30");
        c4.setBounds(100,250,150,20);
        jButton = new JButton("Order");
        jButton.setBounds(150,300,80,30);
        add(jButton);add(c1);add(c2);add(c4);add(c3);
        add(jLabel);
        setLayout(null); setSize(400,400);setVisible(true);
        jButton.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int amount =0;
        String str ="";
        if (c1.isSelected()){
            amount+=100;
            str +="Pizza: 100\n";
        }if (c2.isSelected()){
            amount+=50;
            str +="Burger: 50\n";
        }if (c3.isSelected()){
            amount+=40;
            str +="Cold Coffee: 40\n";
        }if (c4.isSelected()){
            amount+=30;
            str +="Chowmein: 30\n";
        }
        str = str +"----------------------\n";
        JOptionPane.showMessageDialog(this,str+"Total: "+amount);
    }

    public static void main(String[] args) {
    new Jcheckbox_complex_code();
    }
}
