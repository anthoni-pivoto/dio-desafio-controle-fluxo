import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        try {
            System.out.println("insira o primeiro parametro");
            int n1 = scanner.nextInt();

            System.out.println("insira o segundo paramentro");
            int n2 = scanner.nextInt();

            boolean valida = comparaParametros(n1, n2);
            if(valida){
                int cont = n2 - n1;
                int i;
                for(i = 0 ;i != cont;i++){
                    System.out.println("imprimindo o numero " + (i+1));
                }
            }
        } catch (ParametrosInvalidos e) {
            System.out.println("O primeiro paramentro deve ser menor que o segundo parametro");
        }
        scanner.close();
    }
    static boolean comparaParametros(int n1, int n2) throws ParametrosInvalidos {
        if(n1 > n2){
            throw new ParametrosInvalidos();
        }
        else{
            return true;
        }
    }
}
