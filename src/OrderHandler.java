public abstract class OrderHandler {
    protected OrderHandler nextHandler;
    public abstract void handleRequest(Demande demande, Budget budget);
}
