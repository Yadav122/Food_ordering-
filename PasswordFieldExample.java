import  javax.swing.*;
import  java.awt.event.*;
class password1 extends JFrame implements ActionListener{
    JFrame f ;
    JTextField text;
    final  JPasswordField value;
    final JLabel label;
    password1(){
       label = new JLabel();
        label.setBounds(20,150, 200,50);
        value = new JPasswordField(5);
        value.setBounds(100,75,100,30);
        JLabel l1=new JLabel("Username:");
        l1.setBounds(20,20, 80,30);
        JLabel l2=new JLabel("Password:");
        l2.setBounds(20,75, 80,30);
        final JButton b = new JButton("Login");
        b.setBounds(100,120, 80,30);
       text  = new JTextField();
        text.setBounds(100,20, 100,30);
        setSize(300,300);
        setVisible(true);
        setLayout(null);
        add(label);
        add(value);add(b);add(l1);add(l2);add(value); add(text);
        b.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String data = "Username :" + text.getText();
        data += ", Password: " +  new String(value.getPassword());
        label.setText(data);
    }
}
public class PasswordFieldExample{
        public static void main(String[] args) {
      new password1();
    }
}
