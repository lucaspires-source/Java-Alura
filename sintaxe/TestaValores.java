package sintaxe;

public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        //Vai sair 5
        System.out.println(primeiro);
        
        int segundo = 7;
        //Vai sair 7
        System.out.println(segundo);
        
        segundo = primeiro;
        //Vai sair 5
        System.out.println(segundo);
       
        primeiro = 10;
        //Vai sair 5
        System.out.println(segundo);
        
        //Vai sair 10
        System.out.println(primeiro);
    }
}
