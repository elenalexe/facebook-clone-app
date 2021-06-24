import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Photos extends JFrame{

    private JPanel contentPane;
    private JLabel photos;
    private ImageIcon img1;
    private JLabel imagine1;
    private JLabel descriere1;
    private ImageIcon img2;
    private JLabel imagine2;
    private JLabel descriere2;
    private ImageIcon img3;
    private JLabel imagine3;
    private JLabel descriere3;
    private ImageIcon img4;
    private JLabel imagine4;
    private JLabel descriere4;
    private ImageIcon img5;
    private JLabel imagine5;
    private JLabel descriere5;
    private ImageIcon img6;
    private JLabel imagine6;
    private JLabel descriere6;

    public Photos()
    {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,1140,700);
        setTitle("Elena Alexe - Photos");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.decode("#eaecf3"));

        photos = new JLabel("Photos");
        photos.setFont(new Font("Arial", Font.PLAIN,30));
        photos.setBounds(50,0,100,100);
        photos.setForeground(Color.decode("#727ea0"));
        contentPane.add(photos);

        img1 = new ImageIcon(getClass().getResource("poza1.png"));
        imagine1 = new JLabel(img1);
        imagine1.setBounds(10, 70,300,200);
        contentPane.add(imagine1);

        descriere1 = new JLabel("Cineva e tare fericita ca sunt mereu acasa");
        descriere1.setFont(new Font("Arial", Font.BOLD,14));
        descriere1.setForeground(Color.decode("#4d4e4e"));
        descriere1.setBounds(10,235,300,100);
        contentPane.add(descriere1);

        img2 = new ImageIcon(getClass().getResource("poza2.png"));
        imagine2 = new JLabel(img2);
        imagine2.setBounds(400, 70,300,200);
        contentPane.add(imagine2);

        descriere2 = new JLabel("8 Martie");
        descriere2.setFont(new Font("Arial", Font.BOLD,14));
        descriere2.setForeground(Color.decode("#4d4e4e"));
        descriere2.setBounds(400,235,300,100);
        contentPane.add(descriere2);

        img3 = new ImageIcon(getClass().getResource("pzoa3.png"));
        imagine3 = new JLabel(img3);
        imagine3.setBounds(800, 70,300,200);
        contentPane.add(imagine3);

        descriere3 = new JLabel("Movie night");
        descriere3.setFont(new Font("Arial", Font.BOLD,14));
        descriere3.setForeground(Color.decode("#4d4e4e"));
        descriere3.setBounds(800,235,300,100);
        contentPane.add(descriere3);

        img4 = new ImageIcon(getClass().getResource("poza4.png"));
        imagine4 = new JLabel(img4);
        imagine4.setBounds(10, 400,300,200);
        contentPane.add(imagine4);

        descriere4 = new JLabel("Mayu");
        descriere4.setFont(new Font("Arial", Font.BOLD,14));
        descriere4.setForeground(Color.decode("#4d4e4e"));
        descriere4.setBounds(10,570,300,100);
        contentPane.add(descriere4);

        img5 = new ImageIcon(getClass().getResource("poza5.png"));
        imagine5 = new JLabel(img5);
        imagine5.setBounds(800, 400,300,200);
        contentPane.add(imagine5);

        descriere5 = new JLabel("Girls Time");
        descriere5.setFont(new Font("Arial", Font.BOLD,14));
        descriere5.setForeground(Color.decode("#4d4e4e"));
        descriere5.setBounds(800,570,300,100);
        contentPane.add(descriere5);

        img6 = new ImageIcon(getClass().getResource("poza6.png"));
        imagine6 = new JLabel(img6);
        imagine6.setBounds(400, 400,300,200);
        contentPane.add(imagine6);

        descriere6 = new JLabel("Friends");
        descriere6.setFont(new Font("Arial", Font.BOLD,14));
        descriere6.setForeground(Color.decode("#4d4e4e"));
        descriere6.setBounds(400,570,300,100);
        contentPane.add(descriere6);
    }

}
