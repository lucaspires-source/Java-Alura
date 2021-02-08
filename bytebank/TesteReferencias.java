package bytebank;

public class TesteReferencias {
 public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 300;
    System.out.println(primeiraConta.saldo);
    
    Conta segundaConta = primeiraConta;
    System.out.println(segundaConta.saldo);
    segundaConta.saldo += 200;
    System.out.println(segundaConta.saldo);
    System.out.println(primeiraConta.saldo);
    
    if(primeiraConta == segundaConta) {
        System.out.println("Mesma Conta");
    }else {
        System.out.println("Diferente conta");
    }



    
    System.out.println(primeiraConta);
    System.out.println(segundaConta);
}
}
