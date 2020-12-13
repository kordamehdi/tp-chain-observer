public class Main {

    public static void main(String[] args){
        OrderHandler serviceComptable=new ServiceComptable();
        OrderHandler servicePatrimoine=new ServicePatrimoine();

        serviceComptable.nextHandler=servicePatrimoine;
        servicePatrimoine.nextHandler=serviceComptable;
        Demande demande=new Demande(85.0);
        Budget budget=new Budget(200.0);
        demande.ajoute(budget);
        budget.setDemande(demande);
        serviceComptable.handleRequest(demande,budget);
        System.out.println("-----------budget :        "+budget.getBudget());
        System.out.println("-----------isBloque :      "+budget.getBloque());
        System.out.println("-----------demande state : "+demande.getState());
    }
}
