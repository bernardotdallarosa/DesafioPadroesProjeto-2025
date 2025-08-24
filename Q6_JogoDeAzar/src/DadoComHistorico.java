import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico implements IDado{
    private IDado dadoOriginal;
    private List<Integer> historico;

    public DadoComHistorico(IDado dadoOriginal) {
        this.dadoOriginal = dadoOriginal;
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        dadoOriginal.rolar();
        historico.add(dadoOriginal.getValor());
    }

    @Override
    public int getValor() {
        return dadoOriginal.getValor();
    }

    public List<Integer> getHistorico() {
        return historico;
    }    
}
