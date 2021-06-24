import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ForgotPassword extends JFrame {
    private JPanel contentPane;
    private JLabel username;
    private JLabel password;

    ForgotPassword()
    {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,500,200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.decode("#eaecf3"));

        username = new JLabel("Email: elena.alexe@gmail.com");
        username.setFont(new Font("Arial", Font.PLAIN,18));
        username.setForeground(Color.black);
        username.setBounds(30,20,250,100);
        contentPane.add(username);

        password = new JLabel("Password: Maya16");
        password.setFont(new Font("Arial", Font.PLAIN,18));
        password.setForeground(Color.black);
        password.setBounds(30,50,200,100);
        contentPane.add(password);
    }


}
