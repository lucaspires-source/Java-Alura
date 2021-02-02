package sintaxe;

public class TestaCaracteres {
    public static void main(String[] args) {
		char letra = 'a';
        System.out.println(letra);
        
        //Vai sair A
        char valor = 65 ;
        System.out.println(valor);
        
        //Vai sair B
		valor = (char) (valor+1);
        System.out.println(valor);
    
        String palavra = "Testando como isso funciona";
		System.out.println(palavra);
	}
}
