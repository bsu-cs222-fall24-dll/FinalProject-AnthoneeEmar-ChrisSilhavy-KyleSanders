package edu.bsu.cs222;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class GUIPlaylist extends JFrame{
    public void guiPlaylist(){
        setTitle("Playlist");
        setSize(800, 600);
        setBackground(Color.DARK_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        title();
        createOutputPane();

        setVisible(true);
    }

    private void title() {
        JLabel title = new JLabel("🎵   My Playlist   🎵");
        title.setFont(new Font("Roboto", Font.BOLD, 50));
        title.setForeground(Color.WHITE);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.DARK_GRAY);
        titlePanel.add(title);

        add(titlePanel, BorderLayout.NORTH);
    }

    private void createOutputPane() {
        JTextPane pane = new JTextPane();
        pane.setEditable(false);
        pane.setBackground(Color.DARK_GRAY);
        pane.setForeground(Color.WHITE);
        pane.setFont(new Font("Serif", Font.PLAIN, 20));

        StyledDocument doc = pane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        JScrollPane scrollPane = new JScrollPane(pane);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setPreferredSize(new Dimension(750, 400));

        add(backButton());
        add(scrollPane, BorderLayout.CENTER);
    }

    private JButton backButton(){
        JButton back = new JButton("<< Back");
        back.setFont(new Font("Roboto", Font.BOLD, 15));
        back.setBounds(20,505,95,35);
        back.setFocusable(false);
        back.addActionListener(e ->dispose());

        return back;
    }
}