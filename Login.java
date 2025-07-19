import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JTextField cardTextField;
    JButton login, clear, signup;
    JPasswordField pinTextField;
    Login() {
        setTitle("Automatic Teller Machine");
        setLayout(null);

        // Load image correctly
        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/logo.jpg"));
        
        // Scale the image properly
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        // Create JLabel after defining the image
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100); // Corrected position
        add(label);
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Oswald", Font.BOLD,38));  // ✅ Correct instantiation
        text.setBounds(200, 40, 400, 40 );
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));  // ✅ Correct instantiation
        cardno.setBounds(120, 150, 150, 30 );
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));  // ✅ Correct instantiation
        pin.setBounds(120, 220, 230, 30 );
        add(pin);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

     login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login); 


         clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear); 

         signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup); 
        // Set background color
        getContentPane().setBackground(Color.WHITE);

        // Set window properties
        setSize(800, 480);
        setLocation(100, 100);
        setVisible(true);
    };

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");

        }else if(ae.getSource()==login){

        }else if(ae.getSource()==signup){

        }
 }
    public static void main(String[] args) {
        new Login();
    }
}
