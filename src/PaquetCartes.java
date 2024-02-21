import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaquetCartes {
    private List<Carte> cartes;
    private int size;

    public PaquetCartes(){
        this.cartes = new ArrayList<>();
        this.size=0;
    }

    public void remplirPaquetCartes(){
        for (Types  type : Types.values()){
            for(Valeur valeur : Valeur.values()){
                Carte carte = new Carte (valeur,type);
                cartes.add(carte);
                this.size++;
            }
        }
        melanger();
    }

    public void melanger(){
        Collections.shuffle(cartes);
    }

    public int getSize() {
        return size;
    }

    public Carte tirerCarte(){
        if (cartes.isEmpty()){
            System.out.println("le paquet est vide ");
            return null;
        }

        Carte carteTire = cartes.remove(0);
        this.size--;
        return carteTire;

    }




}
