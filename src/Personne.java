public abstract class Personne {
    public Main main;

    public Personne(){
        this.main=new Main();
    }

    public Main getMain() {
        return main;
    }


    public abstract void distribuerCartes(Joueur joueur, PaquetCartes paquet);

    public void  tirerCarte(PaquetCartes paquet){

    }
    public void  voirCartes(){}
}
