package Friends;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import Friends.Friends;


public class AddFriend extends JFrame {

    private JPanel contentPane;
    private JLabel name;
    private JTextField nameText;
    private JLabel birthday;
    private JTextField birthdayText;
    private JLabel lives;
    private JTextField livesText;
    private JLabel from;
    private JTextField fromText;
    private ButtonGroup group;
    private JButton addFriend;
    private FriendsRepository repo;

    public AddFriend(FriendsRepository repo)
    {
        this.repo = repo;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100,100,400,300);
        setTitle("Facebook - Add Friend");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.decode("#eaecf3"));

        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD,16));
        name.setBounds(20,10,100,100);
        name.setForeground(Color.decode("#727ea0"));
        contentPane.add(name);

        nameText = new JTextField();
        nameText.setBounds(80,50,200,25);
        contentPane.add(nameText);

        birthday = new JLabel("Birthday:");
        birthday.setFont(new Font("Arial", Font.BOLD,16));
        birthday.setBounds(20,50,100,100);
        birthday.setForeground(Color.decode("#727ea0"));
        contentPane.add(birthday);

        birthdayText = new JTextField();
        birthdayText.setBounds(100, 90,200,25);
        contentPane.add(birthdayText);

        lives = new JLabel("Lives:");
        lives.setFont(new Font("Arial", Font.BOLD,16));
        lives.setBounds(20,90,100,100);
        lives.setForeground(Color.decode("#727ea0"));
        contentPane.add(lives);

        livesText = new JTextField();
        livesText.setBounds(80,130,200,25);
        contentPane.add(livesText);

        from = new JLabel("From:");
        from.setFont(new Font("Arial", Font.BOLD,16));
        from.setBounds(20,130,100,100);
        from.setForeground(Color.decode("#727ea0"));
        contentPane.add(from);

        fromText = new JTextField();
        fromText.setBounds(80,170,200,25);
        contentPane.add(fromText);

        addFriend = new JButton("Add friend");
        addFriend.setFont(new Font("Arial", Font.BOLD,18));
        addFriend.setBounds(100,220,150,25);
        addFriend.setForeground(Color.decode("#4267B2"));
        addFriend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String birthday = birthdayText.getText();
                String lives = livesText.getText();
                String from = fromText.getText();

                repo.addFriend(new Friend(name, birthday,lives, from));


            }
        });
        contentPane.add(addFriend);





    }

}
