package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
		contaDoLucas.deposita(50);
		
		System.out.println(contaDoLucas.saldo);
	}
}
