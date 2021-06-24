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

public class DeleteFriend extends JFrame {

    private JPanel contentPane;
    private JLabel name;
    private JTextField nameText;
    private FriendsRepository repo;
    private JButton deleteFriend;

    public DeleteFriend(FriendsRepository repo) {
        this.repo = repo;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setTitle("Facebook - Add Friend");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.decode("#eaecf3"));

        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.BOLD, 16));
        name.setBounds(20, 10, 100, 100);
        name.setForeground(Color.decode("#727ea0"));
        contentPane.add(name);

        nameText = new JTextField();
        nameText.setBounds(80, 50, 200, 25);
        contentPane.add(nameText);

        deleteFriend = new JButton("Delete friend");
        deleteFriend.setFont(new Font("Arial", Font.BOLD, 18));
        deleteFriend.setBounds(100, 220, 150, 25);
        deleteFriend.setForeground(Color.decode("#4267B2"));
        deleteFriend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Friend>friends = repo.getAllFriends();
               for (int i = 0; i< friends.size(); i++)
                {
                    if (friends.get(i).getName().equals(nameText.getText()))
                    {
                        repo.deleteFriend(friends.get(i));
//
                    }

                }


            }
        });
        contentPane.add(deleteFriend);


    }
}
