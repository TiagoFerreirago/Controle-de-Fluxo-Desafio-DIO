
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoNumero = scanner.nextInt();
        
        contar(primeiroNumero, segundoNumero);
    }

    public static void contar(int numeroUm, int numeroDois){

        int contagem = numeroDois - numeroUm;

        if(numeroUm > numeroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        else{
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
