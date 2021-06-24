import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class About extends JFrame {

    private JPanel contentPane;
    private JLabel about;
    private JLabel volunteer;
    private JLabel asociatii;
    private JLabel studies;
    private JLabel education;
    private JLabel lives;
    private JLabel lives2;
    private JLabel from;
    private JLabel from2;
    private JLabel birthday;
    private JLabel birthday2;
    private JLabel contact;
    private JLabel email;
    private JLabel phone;
    private JLabel instagram;

    public About()
    {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,600,550);
        setTitle("Elena Alexe - About");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.decode("#eaecf3"));

        about = new JLabel("About");
        about.setFont(new Font("Arial", Font.PLAIN,30));
        about.setBounds(50,20,100,100);
        about.setForeground(Color.decode("#727ea0"));
        contentPane.add(about);

        volunteer = new JLabel("Working: ");
        volunteer.setFont(new Font("Arial", Font.BOLD, 18));
        volunteer.setForeground(Color.decode("#4d4e4e"));
        volunteer.setBounds(30,60,100,100);
        contentPane.add(volunteer);

        asociatii = new JLabel("<html>Volunteer at OSUT - Organizatia Studentilor din Universitatea Tehnica Cluj-Napoca<br>Former Volunteer at ASPR - Asociatia Studentilor<br>Psihologi din Romania");
        asociatii.setBounds(120,35,400,200);
        asociatii.setFont(new Font("Arial", Font.BOLD, 14));
        asociatii.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(asociatii);

        studies = new JLabel("Education: ");
        studies.setFont(new Font("Arial", Font.BOLD, 18));
        studies.setForeground(Color.decode("#4d4e4e"));
        studies.setBounds(30,140,150,100);
        contentPane.add(studies);

        education = new JLabel("<html>Studies at Facultatea de Automatica si Calculatoare, Universitatea Tehnica din Cluj-Napoca<br>Studied at Faculatea de Psihologie si Stiinte ale Educatiei - Universitatea Babes-Bolyai</html>");
        education.setBounds(140,115,400,200);
        education.setFont(new Font("Arial", Font.BOLD, 14));
        education.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(education);

        lives = new JLabel("Lives:");
        lives.setFont(new Font("Arial", Font.BOLD, 18));
        lives.setForeground(Color.decode("#4d4e4e"));
        lives.setBounds(30,220,150,100);
        contentPane.add(lives);


        lives2 = new JLabel("in Cluj-Napoca, Romania");
        lives2.setBounds(120,170,400,200);
        lives2.setFont(new Font("Arial", Font.BOLD, 14));
        lives2.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(lives2);

        from = new JLabel("From:");
        from.setFont(new Font("Arial", Font.BOLD, 18));
        from.setForeground(Color.decode("#4d4e4e"));
        from.setBounds(30,250,150,100);
        contentPane.add(from);

        from2 = new JLabel("Bucharest, Romania");
        from2.setBounds(120,200,400,200);
        from2.setFont(new Font("Arial", Font.BOLD, 14));
        from2.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(from2);

        birthday = new JLabel("Birthday:");
        birthday.setFont(new Font("Arial", Font.BOLD, 18));
        birthday.setForeground(Color.decode("#4d4e4e"));
        birthday.setBounds(30,280,150,100);
        contentPane.add(birthday);

        birthday2 = new JLabel("<html>16 November 1997<br>22 years old</html>");
        birthday2.setBounds(120,238,400,200);
        birthday2.setFont(new Font("Arial", Font.BOLD, 14));
        birthday2.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(birthday2);

        contact = new JLabel("Contact:");
        contact.setFont(new Font("Arial", Font.BOLD, 18));
        contact.setForeground(Color.decode("#4d4e4e"));
        contact.setBounds(30,320,150,100);
        contentPane.add(contact);

        email = new JLabel("Email: aelexa16@gmail.com");
        email.setBounds(120,270,400,200);
        email.setFont(new Font("Arial", Font.BOLD, 14));
        email.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(email);

        phone = new JLabel("Phone: 0720957276");
        phone.setBounds(120,295,400,200);
        phone.setFont(new Font("Arial", Font.BOLD, 14));
        phone.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(phone);

        instagram = new JLabel("Instagram: elenalexe__");
        instagram.setBounds(120,320,400,200);
        instagram.setFont(new Font("Arial", Font.BOLD, 14));
        instagram.setForeground(Color.decode("#4d4e4e"));
        contentPane.add(instagram);

    }


}
