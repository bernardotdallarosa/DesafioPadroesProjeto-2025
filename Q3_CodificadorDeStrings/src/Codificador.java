public class Codificador{
    private Strategy2 strategy;

    public void setStrategy(Strategy2 strategy){
        this.strategy = strategy;
    }
    public String executeStrategyCodifica(String valor){
        return strategy.codifica(valor);
    }
    public String executeStrategyDecodifica(String valor){
        return strategy.decodifica(valor);
    }

}