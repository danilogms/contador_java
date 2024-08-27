import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro.");
        int primeiroParametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro.");
        int segundoParametro = terminal.nextInt();

        try{
            resultadoParametros(primeiroParametro, segundoParametro);

        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    public static int resultadoParametros(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        int resultado = segundoParametro - primeiroParametro;

        if(segundoParametro < primeiroParametro){
            throw new ParametrosInvalidosException();
        }else{
            System.out.println("Devemos fazer "+resultado+ " contagens!");
            lacosRepeticoes(resultado);
        }
        return resultado;
    }

    public static void lacosRepeticoes(int num){
        int iteracoes;
        for(iteracoes = 1; iteracoes <= num; iteracoes++){
            System.out.println("Imprimindo o número "+ iteracoes);
        }
    }
}
