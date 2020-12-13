import observable.Observable;

public class Demande extends Observable {

    public static final String INIT = "INIT";
    public static final String APPROUVE = "APPROUVE";
    public static final String BLOQUE = "BLOQUE";
    public static final String INORDER = "INORDER";
    private String state;
    private Double montant;

    public Demande(String state, Double montant) {
        this.state = state;
        this.montant = montant;
    }

    public Demande(Double montant) {
        this.state = Demande.INIT ;
        this.montant = montant;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifie();
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
