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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import javax.swing.ComboBoxModel;
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
    private JButton suppJoueur;
    private JButton validerTournoi;
    private JComboBox listeJoueur;
    
    public VueTournoi(){
        
        window = new JFrame();
        window.setSize(600, 700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocationRelativeTo(null);
        
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        window.add(mainPanel) ;
        
        titre = new JLabel("Tournoi de morpion");
        mainPanel.add(titre, BorderLayout.NORTH);
        
        JPanel contentPanel = new JPanel (new GridLayout(5, 5));
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel("Liste des joueurs inscrits : "));
        contentPanel.add(new JLabel(""));
        
        joueur = new JTextField();
        joueur.setText("Identifiant joueur");
        contentPanel.add(joueur);
        
        valideJoueur = new JButton("Valider");
        contentPanel.add(valideJoueur);
        
        contentPanel.add(new JLabel(""));
        
        
        listeJoueur = new JComboBox();
        contentPanel.add(listeJoueur);
        
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        contentPanel.add(new JLabel(""));
        
        suppJoueur = new JButton("Supprimer Joueur");
        contentPanel.add(suppJoueur);
        contentPanel.add(new JLabel(""));
        
        validerTournoi = new JButton("Valider tournoi");
        mainPanel.add(validerTournoi, BorderLayout.SOUTH);
        
        valideJoueur.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                setChanged();
                notifyObservers(Actions.ValideJoueur);
                clearChanged();
            }
        });
        
        
        suppJoueur.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setChanged();
            notifyObservers(Actions.SuppJoueur);
            clearChanged();
        }
        });
        
        validerTournoi.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            setChanged();
            notifyObservers(Actions.ValideTournoi);
            clearChanged();
        }
        });
        
        
        
        
        
        
        
    }
    
    public void afficher() {
        this.getWindow().setVisible(true);
    }
    
    

    /**
     * @return the window
     */
    public JFrame getWindow() {
        return window;
    }

    /**
     * @return the titre
     */
    public JLabel getTitre() {
        return titre;
    }

    /**
     * @return the joueur
     */
    public JTextField getJoueur() {
        return joueur;
    }

    /**
     * @return the valideJoueur
     */
    public JButton getValideJoueur() {
        return valideJoueur;
    }

    /**
     * @return the suppJoueur
     */
    public JButton getSuppJoueur() {
        return suppJoueur;
    }

    /**
     * @return the validerTournoi
     */
    public JButton getValiderTournoi() {
        return validerTournoi;
    }

    /**
     * @return the listeJoueur
     */
    public JComboBox getListeJoueur() {
        return listeJoueur;
    }










    
}
