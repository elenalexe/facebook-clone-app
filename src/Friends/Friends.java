package Friends;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Friends extends JFrame {

    private JTable table;
    private List<Friend> repo;
    public Friends(List<Friend> friends)
    {
        this.repo = friends;
        Object columnNames[] = {"Name", "Birthday", "Lives", "From"};
        Object[][] data = new Object[this.repo.size()][4];
        final int[] currentFriendIndex = {0};
        this.repo.forEach((currentFriend) -> {
            data[currentFriendIndex[0]][0] = currentFriend.getName();
            data[currentFriendIndex[0]][1] = currentFriend.getBirthday();
            data[currentFriendIndex[0]][2] = currentFriend.getLives();
            data[currentFriendIndex[0]][3] = currentFriend.getFrom();
            currentFriendIndex[0]++;
        });


        table = new JTable(data, columnNames)
        {
            public Class<?> getColumnClass(int column)
            {
                return getValueAt(0,column).getClass();
            }
        };
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setBackground(Color.decode("#eaecf3"));
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);

        table.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        this.setBounds(0,30,700,500);

        JScrollPane scrollPane = new JScrollPane(table);
        this.add(scrollPane, BorderLayout.CENTER);
        this.setBounds(100,100,700,600);
        this.setTitle("Elena Alexe - Friends.Friends");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBackground(Color.decode("#eaecf3"));
        this.setVisible(true);
    }

}
