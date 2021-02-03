package sintaxe;

public class TesteIr {
    public static void main(String[] args) {
        double salario = 2900.0;

        double aliquota1 = 0.075;
        double aliquota2 = 0.15;
        double aliquota3 = 0.0225;

        if (salario >= 1900 || salario < 2800.0) {
            System.out.println("sua aliquota será de R$" + (salario * aliquota1));
        } else {
            if (salario >= 2800.1 || salario < 3751.0) {
                System.out.println("sua aliquota será de R$" + (salario * aliquota2));
            } else {
                if (salario >= 3751.1 || salario < 4664.0) {
                    System.out.println("sua aliquota será de R$ " + (salario * aliquota3));
                }
            }
        }
    }
}
