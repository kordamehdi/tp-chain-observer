import observable.Observateur;

public class Budget implements Observateur {

    private Double budget;
    private Double bloque;
    protected Demande demande;

    public Double getBloque() {return bloque; }
    public void setBloque(Double bloque) { this.bloque = bloque;}

    public Demande getDemande() {return demande;}
    public void setDemande(Demande demande) {this.demande = demande; }

    public Double getBudget() {
        return budget;
    }
    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Budget(Double budget) {
        this.budget = budget;
    }


    @Override
    public void actualise() {
        if(demande.getState().equals(Demande.APPROUVE)) {
            this.setBloque(demande.getMontant());
        }
        if (demande.getState().equals(Demande.INORDER)){
            this.setBudget(this.getBudget()-demande.getMontant());
            this.setBloque((double) 0);
        }
    }
}
