public interface JoueurInterface {

    void placerMise(double valeurMiser);
    void recevoirCartes(Carte carte1, Carte carte2);
    void rester();
    void  tirerCarte(PaquetCartes paquet);
     void voirCartes();
    void consulterResultat(String resultat);


}
