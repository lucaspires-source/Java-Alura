package bytebank3;


public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(10, 230);
        
        conta.setAgencia(-300);
        conta.setNumero(-14);
        
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(120, 2301);


        System.out.println(Conta.getTotal());
    }
}