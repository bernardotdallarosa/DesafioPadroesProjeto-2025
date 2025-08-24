
public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    } 
    public boolean executeStrategy(String valor){
        return strategy.tipo(valor);
    }
}
