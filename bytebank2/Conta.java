package bytebank2;


public class Conta {
    private double saldo; 
    int agencia;
    int numero;
    Cliente titular;



    public boolean deposita(double valor) {
        if(valor > 0){
            this.saldo  += valor;
            return true;

        }else{
            System.out.println("Infelizmente você não pode realizar a transação");
            return false;
        }
    }

    public boolean saca (double valor) {
	    	
        if (this.saldo >= valor && 0 < valor) {
            this.saldo  -= valor;
            return true;
        }else {
           System.out.println("Infelizmente você não pode realizar a transação");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor && 0 < valor) {
            this.saldo  -= valor;
            destino.deposita(valor);
            return true;
        }else {
        	System.out.println("Infelizmente você não pode realizar a transação");
            return false;
        }
    }


public double pegaSaldo() {
    return this.saldo;
    
}
}