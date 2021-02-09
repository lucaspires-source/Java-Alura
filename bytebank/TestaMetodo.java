package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
        Conta contaDoNeymar = new Conta();
        contaDoNeymar.saldo = 1000;

		contaDoLucas.deposita(50);
		
		System.out.println(contaDoLucas.saldo);
        contaDoLucas.saca(150);
        System.out.println(contaDoLucas.saldo);


        contaDoNeymar.transfere(500, contaDoLucas);
        System.out.println(contaDoLucas.saldo);

        contaDoLucas.titular = "Lucas Ribeiro";
        System.out.println(contaDoLucas.titular);
	}
}
