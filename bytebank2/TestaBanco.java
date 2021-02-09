package bytebank2;


public class TestaBanco {

    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.nome = "Lucas Ribeiro";
        lucas.cpf = "04579736176";
        lucas.profissao = "vagabundo";

        Conta contaDoLucas = new Conta();
        contaDoLucas.deposita(1000);
        
        contaDoLucas.titular = lucas;
        System.out.println(contaDoLucas.titular.nome);
        
    }

}
