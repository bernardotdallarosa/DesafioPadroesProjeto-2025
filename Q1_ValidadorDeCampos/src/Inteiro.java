
public class Inteiro implements Strategy{
    public boolean tipo(String valor){
        for(int i=0;i<valor.length();i++){
                    if (!Character.isDigit(valor.charAt(i))){
                        return false;
                    }
                }
                return true;
    }
}
