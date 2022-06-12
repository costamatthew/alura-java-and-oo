public class VariableConversion {

    public static void main(String[] args) {
        double salario = 1250.50;
        int valor = (int) salario;

        System.out.println(valor);

        // Numeros maiores que 2 Bilhões de 64 bits
        long numeroGrande = 1151315135151151L;

        // 16 bits
        short valorPequeno = 2113;

        byte b = 127;
    }

}
