import java.util.ArrayList;

public class Systeme {

    ArrayList<Micro> micros;
    Affichage affichage;
    Transcripteur transcripteur;
    Alerteur alerteur;

    public Systeme() {
        micros = new ArrayList<Micro>();
        affichage = new Affichage();
        transcripteur = new Transcripteur();
        alerteur = new Alerteur();
    }

    public void traitement_flux(byte[] flux){

        // Traitement du flux audio du micro

        // si le flux est une parole, envoie au trascripteur
        if (true) {

           String texte = transcripteur.traduire(flux);

           affichage.afficher(texte);

        }else {

            // envoie du flux a l'alerteur et récupération du type d'alerte
            Alerte alerte = alerteur.identifier(flux);

            // récupération de la donnee a afficher suivant l'alerte
            String donnee = alerteur.Alerter(alerte);

            // Affichage de la donnée
            affichage.afficher(donnee);
        }
    }

    public void basculer_micro(Micro micro){
        micro.actif = !micro.actif;
    }

    public void ajuster_voume(Micro micro, int volume) {
        micro.setVolume(volume);
    }
}