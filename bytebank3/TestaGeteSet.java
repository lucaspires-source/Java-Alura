package bytebank3;


public class TestaGeteSet {
   public static void main(String[] args) {
	    Conta conta = new Conta(0, 0);
	    conta.setNumero(1337);
	    System.out.println(conta.getNumero());
	    conta.setAgencia(699);
	    System.out.println(conta.getAgencia());
	    
	    Cliente paulo = new Cliente();
	    paulo.setNome("lucas");
	    conta.setTitular(paulo);
	    
   }  
}