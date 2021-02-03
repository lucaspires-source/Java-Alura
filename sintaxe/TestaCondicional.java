package sintaxe;


public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 2;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você não tem 18,mas esta acompanhado logo pode entrar");
			}else {
			System.out.println("Você tem menos de 18 anos,não pode entrar");
			}
		}
	}
}
