/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rougiern
 */
public class Controleur implements Observer{
    
    private VueTournoi tournoi;
    private VueMatch match;
    private ArrayList<Joueur> les_joueurs;
    
    public Controleur(){
        les_joueurs = new ArrayList<>();
        tournoi = new VueTournoi();
        tournoi.addObserver(this);
        tournoi.afficher();       
    }
    
    

    @Override
    public void update(Observable arg0, Object arg1) {
        if (arg1 instanceof Actions) {
            if (((Actions) arg1) == Actions.ValideJoueur){
                
                tournoi.getListeJoueur().addItem(tournoi.getJoueur().getText());
            } else if (((Actions) arg1) == Actions.SuppJoueur){
                tournoi.getListeJoueur().removeItem(tournoi.getListeJoueur().getSelectedItem());
            }
            
            else if (((Actions) arg1) == Actions.ValideTournoi){
                  for (int i =0; i<= tournoi.getListeJoueur().getMaximumRowCount(); i++){
                      Joueur j = new Joueur(tournoi.getJoueur().getText());
                      addJoueur(j);
                      match.afficher();
                      
                  }
                
            }
                
        }
        
    }
    
    
    
    
        /**
     * @param j
     */
    public void addJoueur(Joueur j) {
        this.les_joueurs.add(j);
    }
    
    public void removeJoueur(Joueur j){
        this.les_joueurs.remove(j);
    }
    
}
