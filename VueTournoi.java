/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rougiern
 */
public class VueTournoi extends Observable{
    
    private JFrame window;
    private JLabel titre;
    private JTextField joueur;
    private JButton valideJoueur;
    private JComboBox listeJoueur;
    
    public VueTournoi(){
        
        window = new JFrame();
        window.setSize(500, 480);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocationRelativeTo(null);
        
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        window.add(mainPanel) ;
        
        JLabel titre = new JLabel("Tournoi de morpion");
        mainPanel.add(titre, BorderLayout.NORTH);
        
        JPanel contentPanel = new JPanel (new GridLayout(3, 3));
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        JTextField joueur = new JTextField();
        joueur.setText("Identifiant joueur");
        contentPanel.add(joueur);
        
        JButton valideJoueur = new JButton("Valider");
        contentPanel.add(valideJoueur);
        
        JComboBox listeJoueur = new JComboBox();
        contentPanel.add(listeJoueur);
        
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        
        
        
        
        
    }
    
    public void afficher() {
        this.window.setVisible(true);
    }
    
}
