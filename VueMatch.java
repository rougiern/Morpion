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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rougiern
 */
public class VueMatch extends Observable {
    
    private Joueur j1;
    private Joueur j2;
    private JFrame window;
    private JLabel titre;
    
    
    public VueMatch(Joueur j1, Joueur j2){
        
        setJ1(j1);
        setJ2(j2);
        
        window = new JFrame();
        window.setSize(600, 700);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        window.add(mainPanel) ;
        
        titre = new JLabel("Match de morpion");
        mainPanel.add(titre, BorderLayout.NORTH);
        
        JPanel contentPanel = new JPanel (new GridLayout(3, 3));
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        contentPanel.add(new JButton());
        
        mainPanel.add(new JButton("Valider"), BorderLayout.SOUTH);
        mainPanel.add(new JButton("Annuler"), BorderLayout.SOUTH);
        
    }
    
    
        public void afficher() {
        this.getWindow().setVisible(true);
    }

    /**
     * @return the j1
     */
    public Joueur getJ1() {
        return j1;
    }

    /**
     * @param j1 the j1 to set
     */
    public void setJ1(Joueur j1) {
        this.j1 = j1;
    }

    /**
     * @return the j2
     */
    public Joueur getJ2() {
        return j2;
    }

    /**
     * @param j2 the j2 to set
     */
    public void setJ2(Joueur j2) {
        this.j2 = j2;
    }

    /**
     * @return the window
     */
    public JFrame getWindow() {
        return window;
    }

    /**
     * @param window the window to set
     */
    public void setWindow(JFrame window) {
        this.window = window;
    }

    /**
     * @return the titre
     */
    public JLabel getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(JLabel titre) {
        this.titre = titre;
    }
    
}
