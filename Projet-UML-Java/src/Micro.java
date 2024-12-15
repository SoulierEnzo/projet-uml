public class Micro {

    // Propriétés

    int volume;
    boolean actif;


    // Getters
    public int getVolume() {
        return volume;
    }

    public boolean isActif() {
        return actif;
    }

    // Setters
    public void setVolume(int volume) {

        // Validation des entrées
        if (volume < 0) { volume = 0; }
        if (volume > 100) { volume = 100; }

        this.volume = volume;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    // Methodes
    public byte[] envoie_flux() {
        // Récupère le périphérique du micro, capture l'audio
        // retourne l'audio dans un buffer
        return new byte[0];
    }


}
