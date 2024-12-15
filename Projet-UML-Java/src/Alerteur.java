public class Alerteur {


    public Alerte identifier(byte[] flux) {
        // Analyse le flux et retourne un type d'alerte spécifique ( Nom, Alarme )

        return Alerte.Alarme;
    }

    public String Alerter(Alerte alerte) {
        // Prend en paramètre l'alerte identifiée par la méthode du dessus et renvoie
        // une chaine de caractère qui sera utilisée par la classe affichage

        return "";
    }
}
