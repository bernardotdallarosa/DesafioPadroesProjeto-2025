public class App1 {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        Context cont = new Context();

        cont.setStrategy(new Email());
        if(cont.executeStrategy(email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
    }
}