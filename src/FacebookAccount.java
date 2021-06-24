import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import Friends.AddFriend;
import Friends.Friends;
import Friends.Friend;
import Friends.FriendsRepository;
import Friends.DeleteFriend;

public class FacebookAccount extends JFrame {

    private JPanel contentPane;
    private JSeparator separator;
    private JLabel labelLogoFacebook;
    private ImageIcon sorina;
    private ImageIcon raul;
    private ImageIcon renata;
    private ImageIcon andreeaD;
    private ImageIcon oana;
    private ImageIcon andreeaM;
    private ImageIcon coverPhoto;
    private JLabel labelcover;
    private JLabel labelFacultate;
    private JLabel labelLives;
    private JLabel labelFrom;
    private JLabel labelBirthday;
    private JLabel labelPrieten1;
    private JLabel labelPrieten2;
    private JLabel labelPrieten3;
    private JLabel labelPrieten4;
    private JLabel labelPrieten5;
    private JLabel labelPrieten6;
    private JLabel labelSorina;
    private JLabel labelRaul;
    private JLabel labelAndreeaD;
    private JLabel labelAndreeaM;
    private JLabel labelOana;
    private JLabel labelRenata;
    private JLabel labelPozaPostare;
    private ImageIcon pozaPostare;
    private JLabel numePostare;
    private JLabel descrierePostare;
    private JLabel time;
    private ImageIcon pozaMaya;
    private JLabel maya;
    private JLabel labelIntro;
    private JLabel labelFriends;
    private JLabel labelNume;
    private JLabel labelAbout;
    private JLabel labelFriends2;
    private JLabel labelPhotos;
    private JTextField search;
    private JButton labelSearch;
    private JButton buttonExit;
    private JButton add;
    private JButton delete;
    private FriendsRepository repo = new FriendsRepository();



    public FacebookAccount()
    {
        this.repo.addFriend(new Friend("Florea Sorina", "21 June 1997", "Cluj-Napoca", "Rodna"));
        this.repo.addFriend(new Friend("Raul Bodrea", "16 April 1995", "Cluj-Napoca", "Cluj-Napoca"));
        this.repo.addFriend(new Friend("Andreea Dan", "17 April 1997", "Cluj-Napoca", "Cluj-Napoca"));
        this.repo.addFriend(new Friend("Andreea Mihali", "13 December 1996", "Cluj-Napoca", "Sighetul Marmatiei"));
        this.repo.addFriend(new Friend("Renata Farkas", "23 January 2000", "Baia Mare", "Baia Mare"));
        this.repo.addFriend(new Friend("Oana Marian", "4 April 1997", "Cluj-Napoca", "Bistrita"));
        this.repo.addFriend(new Friend("Silvia Plesea", "20 July 1997", "Bucuresti", "Bucuresti"));
        this.repo.addFriend(new Friend("Simona Poenaru", "3 August 1997", "Bucuresti", "Brasov"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,1200,800);
        setTitle("Facebook - Elena Alexe");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.setBackground(Color.decode("#eaecf3"));


        labelLogoFacebook = new JLabel("facebook");
        labelLogoFacebook.setFont(new Font("Tahoma", Font.BOLD, 40));
        labelLogoFacebook.setForeground(Color.decode("#4267B2"));
        labelLogoFacebook.setBounds(20,0, 200, 60);
        contentPane.add(labelLogoFacebook);

        labelSearch = new JButton("Search");
        labelSearch.setBounds(460,23,120,20);
        labelSearch.setFont(new Font("Arial", Font.BOLD,20));
        labelSearch.setForeground(Color.decode("#4267B2"));
        labelSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<Friend> res = repo.getFriend(search.getText());
                Friends friends = new Friends(res);

            }
        });
        contentPane.add(labelSearch);

        search = new JTextField();
        search.setBounds(250,20,200,25);
        contentPane.add(search);

        add = new JButton("+ Add Friend");
        add.setFont(new Font("Arial", Font.BOLD,18));
        add.setBounds(830,20,150,25);
        add.setForeground(Color.decode("#4267B2"));
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddFriend addFriendpage = new AddFriend(repo);
                addFriendpage.setVisible(true);

            }
        });
        contentPane.add(add);

        delete = new JButton("- Delete Friend");
        delete.setFont(new Font("Arial", Font.BOLD,18));
        delete.setBounds(635,20,165,25);
        delete.setForeground(Color.decode("#4267B2"));
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteFriend deletepage = new DeleteFriend(repo);
                deletepage.setVisible(true);

            }
        });
        contentPane.add(delete);


        buttonExit = new JButton("Log out");
        buttonExit.setBounds(1000,20,150,25);
        buttonExit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonExit.setForeground(Color.decode("#4267B2"));
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FaceBookLogin page = new FaceBookLogin();
                page.setVisible(true);
                dispose();

            }
        });
        contentPane.add(buttonExit);

        labelIntro = new JLabel("Intro");
        labelIntro.setFont(new Font("Arial", Font.PLAIN,30));
        labelIntro.setBounds(50,200,100,100);
        labelIntro.setForeground(Color.decode("#727ea0"));
        contentPane.add(labelIntro);

        labelFacultate = new JLabel("<html>Studies at Facultatea de Automatica si Calculatoare,<br>Universitatea Tehnica<br>din Cluj-Napoca</html>");
        labelFacultate.setFont(new Font("Arial", Font.BOLD, 13));
        labelFacultate.setForeground(Color.decode("#4d4e4e"));
        labelFacultate.setBounds(40,220,200,200);
        contentPane.add(labelFacultate);

        labelLives = new JLabel("Lives in Cluj-Napoca");
        labelLives.setFont(new Font("Arial", Font.BOLD, 13));
        labelLives.setForeground(Color.decode("#4d4e4e"));
        labelLives.setBounds(40,325,130,100);
        contentPane.add(labelLives);

        labelFrom = new JLabel("From Bucharest");
        labelFrom.setFont(new Font("Arial", Font.BOLD,13));
        labelFrom.setForeground(Color.decode("#4d4e4e"));
        labelFrom.setBounds(40,355,130,100);
        contentPane.add(labelFrom);

        labelBirthday = new JLabel("16 November 1997");
        labelBirthday.setFont(new Font("Arial", Font.BOLD, 13));
        labelBirthday.setForeground(Color.decode("#4d4e4e"));
        labelBirthday.setBounds(40,385,120,100);
        contentPane.add(labelBirthday);

        labelFriends = new JLabel("Friends");
        labelFriends.setFont(new Font("Arial", Font.PLAIN,30));
        labelFriends.setForeground(Color.decode("#727ea0"));
        labelFriends.setBounds(50, 440,130,100);
        contentPane.add(labelFriends);

        sorina = new ImageIcon(getClass().getResource("sorina.png"));
        labelPrieten1 = new JLabel(sorina);
        labelPrieten1.setBounds(15,500,100,100);
        contentPane.add(labelPrieten1);

        labelSorina = new JLabel("Florea Sorina");
        labelSorina.setFont(new Font("Arial", Font.BOLD, 10));
        labelSorina.setForeground(Color.decode("#4d4e4e"));
        labelSorina.setBounds(33,545,100,100);
        contentPane.add(labelSorina);

        andreeaM = new ImageIcon(getClass().getResource("andreeaM.png"));
        labelPrieten2 = new JLabel(andreeaM);
        labelPrieten2.setBounds(15, 600,100,100);
        contentPane.add(labelPrieten2);

        labelAndreeaM = new JLabel("Andreea Mihali");
        labelAndreeaM.setFont(new Font("Arial", Font.BOLD,10));
        labelAndreeaM.setForeground(Color.decode("#4d4e4e"));
        labelAndreeaM.setBounds(33,645,100,100);
        contentPane.add(labelAndreeaM);

        raul = new ImageIcon(getClass().getResource("raul.png"));
        labelPrieten3 = new JLabel(raul);
        labelPrieten3.setBounds(110,500,100,100);
        contentPane.add(labelPrieten3);

        labelRaul = new JLabel("Raul Bodrea");
        labelRaul.setFont(new Font("Arial", Font.BOLD,10));
        labelRaul.setForeground(Color.decode("#4d4e4e"));
        labelRaul.setBounds(130, 545,100,100);
        contentPane.add(labelRaul);

        renata = new ImageIcon(getClass().getResource("renata.png"));
        labelPrieten4 = new JLabel(renata);
        labelPrieten4.setBounds(110,600,100,100);
        contentPane.add(labelPrieten4);

        labelRenata = new JLabel("Renata Farkas");
        labelRenata.setFont(new Font("Arial", Font.BOLD,10));
        labelRenata.setForeground(Color.decode("#4d4e4e"));
        labelRenata.setBounds(130,645,100,100);
        contentPane.add(labelRenata);

        andreeaD = new ImageIcon(getClass().getResource("andreeaD.png"));
        labelPrieten5 = new JLabel(andreeaD);
        labelPrieten5.setBounds(200,500,100,100);
        contentPane.add(labelPrieten5);

        labelAndreeaD = new JLabel("Andreea Dan");
        labelAndreeaD.setFont(new Font("Arial", Font.BOLD,10));
        labelAndreeaD.setForeground(Color.decode("#4d4e4e"));
        labelAndreeaD.setBounds(220,545,100,100);
        contentPane.add(labelAndreeaD);

        oana = new ImageIcon(getClass().getResource("oana.png"));
        labelPrieten6 = new JLabel(oana);
        labelPrieten6.setBounds(200, 600,100,100);
        contentPane.add(labelPrieten6);

        labelOana = new JLabel("Oana Marian");
        labelOana.setFont(new Font("Arial", Font.BOLD,10));
        labelOana.setForeground(Color.decode("#4d4e4e"));
        labelOana.setBounds(220,645,100,100);
        contentPane.add(labelOana);

        coverPhoto = new ImageIcon(getClass().getResource("coversipic.png"));
        labelcover = new JLabel(coverPhoto);
        labelcover.setOpaque(false);
        labelcover.setBounds(150,70,1000,230);
        contentPane.add(labelcover);

        labelNume = new JLabel("Elena Alexe");
        labelNume.setFont(new Font("Arial", Font.BOLD,20));
        labelNume.setForeground(Color.black);
        labelNume.setBounds(590,270,150,100);
        contentPane.add(labelNume);

        separator = new JSeparator();
        separator.setBounds(310,360,685,2);
        separator.setBackground(Color.decode("#4267B2"));
        contentPane.add(separator);

        labelAbout = new JLabel("About");
        labelAbout.setFont(new Font("Arial", Font.BOLD,16));
        labelAbout.setForeground(Color.decode("#727ea0"));
        labelAbout.setBounds(380,290,100,100);
        labelAbout.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        labelAbout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                About aboutframe = new About();
                aboutframe.setVisible(true);
            }
        });
        contentPane.add(labelAbout);

        labelPhotos = new JLabel("Photos");
        labelPhotos.setFont(new Font("Arial", Font.BOLD,16));
        labelPhotos.setForeground(Color.decode("#727ea0"));
        labelPhotos.setBounds(620,290,100,100);
        labelPhotos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        labelPhotos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Photos photoframe = new Photos();
                photoframe.setVisible(true);
            }
        });
        contentPane.add(labelPhotos);

        labelFriends2 = new JLabel("Friends");
        labelFriends2.setFont(new Font("Arial", Font.BOLD,16));
        labelFriends2.setForeground(Color.decode("#727ea0"));
        labelFriends2.setBounds(850,290,100,100);
        labelFriends2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        labelFriends2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               Friends friendsframe = new Friends(repo.getAllFriends());
               friendsframe.setVisible(true);
            }
        });
        contentPane.add(labelFriends2);

        pozaPostare = new ImageIcon(getClass().getResource("profilpostare.png"));
        labelPozaPostare = new JLabel(pozaPostare);
        labelPozaPostare.setBounds(320,380,80,80);
        contentPane.add(labelPozaPostare);

        numePostare = new JLabel("Elena Alexe");
        numePostare.setFont(new Font("Arial", Font.BOLD,16));
        numePostare.setForeground(Color.black);
        numePostare.setBounds(400,370,150,100);
        contentPane.add(numePostare);

        time = new JLabel("Posted 5 minutes ago");
        time.setFont(new Font("Arial", Font.PLAIN,10));
        time.setForeground(Color.decode("#4d4e4e"));
        time.setBounds(405,385,200,100);
        contentPane.add(time);

        pozaMaya = new ImageIcon(getClass().getResource("maya.png"));
        maya = new JLabel(pozaMaya);
        maya.setBounds(410,400,300,500);
        contentPane.add(maya);

        descrierePostare = new JLabel("O floare intre flori");
        descrierePostare. setFont(new Font("Arial", Font.PLAIN, 13));
        descrierePostare.setForeground(Color.black);
        descrierePostare.setBounds(420,405,200,100);
        contentPane.add(descrierePostare);

    }
    

}
