/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author rougiern
 */
public class Controleur implements Observer{
    
    private VueTournoi tournoi;
    
    public Controleur(){
        tournoi = new VueTournoi();
        tournoi.addObserver(this);
        tournoi.afficher();       
    }
    
    

    @Override
    public void update(Observable arg0, Object arg1) {
        if (arg1 instanceof Actions) {
            if (((Actions) arg1) == Actions.ValideJoueur){
                // Joueur j = new Joueur(tournoi.getNomJoueur());
                Joueur j = new Joueur("Toto");
                tournoi.addJoueur(j);
            } else if (((Actions) arg1) == Actions.SuppJoueur){
                tournoi.getListeJoueur().remove(tournoi.getListeJoueur().getSelectedIndex());
            }
                
        }
        
    }
    
    
    
    
}
