public class ServiceComptable extends OrderHandler {

    @Override
    public void handleRequest(Demande demande, Budget budget ){

        if(demande.getMontant()<= budget.getBudget()){
            demande.setState(Demande.APPROUVE);
        }
        nextHandler.handleRequest(demande,budget);
    }
}
