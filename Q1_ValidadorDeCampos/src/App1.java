public class App1 {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        String inteiro = "74129";
        String matricula = "24102238";
        Context cont = new Context();

        cont.setStrategy(new Email());
        if (cont.executeStrategy(email)) {
            System.out.println(email + " é um email válido!");
        } else {
            System.out.println(email + " não é um email válido!");
        }
        System.out.println(cont.executeStrategy(matricula));
        System.out.println(cont.executeStrategy(inteiro));

        cont.setStrategy(new Inteiro());
        System.out.println(cont.executeStrategy(email));
        System.out.println(cont.executeStrategy(matricula));
        System.out.println(cont.executeStrategy(inteiro));

        cont.setStrategy(new Matricula());
        System.out.println(cont.executeStrategy(email));
        System.out.println(cont.executeStrategy(matricula));
        System.out.println(cont.executeStrategy(inteiro));

    }
}