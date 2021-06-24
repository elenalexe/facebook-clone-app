
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.Color.*;


public class FaceBookLogin extends JFrame {
   private JPanel contentPane;
   private JLabel facebookLabel;
   private JLabel userLabel;
   private JLabel passwordLabel;
   private JLabel forgotPassword;
   private JTextField userField;
   private JTextField passwordField;
   private JButton loginButton;
   private JLabel label;
   private ImageIcon fb;
   private JOptionPane forgot;

   public FaceBookLogin()
   {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(100,100,950,550);
       contentPane = new JPanel();
       contentPane.setBorder(new EmptyBorder(5,5,5,5));
       setContentPane(contentPane);
       contentPane.setLayout(null);
       contentPane.setBackground(Color.decode("#4267B2"));

       facebookLabel = new JLabel("facebook");
       facebookLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
       facebookLabel.setForeground(white);
       facebookLabel.setBounds(60,25, 250,30);
       contentPane.add(facebookLabel);

       fb = new ImageIcon(getClass().getResource("facebook.png"));
       label = new JLabel(fb);
       label.setBounds(0, 90, 1000, 500);
       contentPane.add(label);

       userLabel = new JLabel("Email: ");
       userLabel.setFont(new Font("Arial", Font.PLAIN, 18));
       userLabel.setForeground(white);
       userLabel.setBounds(300,30,100,20);
       contentPane.add(userLabel);

       userField = new JTextField();
       userField.setBounds(360, 29, 100,20);
       contentPane.add(userField);

       passwordLabel = new JLabel("Password: ");
       passwordLabel.setFont(new Font("Arial", Font.PLAIN, 18));
       passwordLabel.setForeground(white);
       passwordLabel.setBounds(489, 30,100,20);
       contentPane.add(passwordLabel);

       passwordField = new JTextField();
       passwordField.setBounds(580, 29,100,20);
       contentPane.add(passwordField);

       forgotPassword = new JLabel("Forgot Password");
       forgotPassword.setFont(new Font("Arial", Font.ITALIC, 15));
       forgotPassword.setForeground(white);
       forgotPassword.setBounds(510, 49,200,20);
       forgotPassword.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
       forgotPassword.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               ForgotPassword panel = new ForgotPassword();
               panel.setVisible(true);
           }
       });
       contentPane.add(forgotPassword);

       loginButton = new JButton("Login");
       loginButton.setFont(new Font("Arial", Font.BOLD, 18));
       loginButton.setForeground(Color.decode("#4267B2"));
       loginButton.setBackground(white);
       loginButton.setBounds(700,29,100,20);
       contentPane.add(loginButton);
       loginButton.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               if (e.getSource() == loginButton)
               {
                   String userText;
                   String passwordText;
                   userText = userField.getText();
                   passwordText = passwordField.getText();
                   if (userText.equalsIgnoreCase("elena.alexe@gmail.com") && passwordText.equalsIgnoreCase("Maya16"))
                   {
                       FacebookAccount page = new FacebookAccount();
                       page.setVisible(true);
                   }
                   else
                       { forgot = new JOptionPane();
                       forgot.showMessageDialog(null, "Email or Password wrong, check Forgot Password");
                   }
               }

           }


       });
   }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FaceBookLogin frame  = new FaceBookLogin();
                frame.setVisible(true);
            }
        });
    }
}
