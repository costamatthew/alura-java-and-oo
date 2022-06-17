public class Scope {

    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 23;
        int quantidadePessoas = 3;
        // boolean acompanhado = quantidadePessoas >= 2;

        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelismente voce nao pode entrar");
        }
    }

}
