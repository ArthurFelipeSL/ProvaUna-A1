import java.util.Scanner;
public class ProvaA1 {
    
   public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        //Escolha o ano desejado 
        int anoEscolhido;

        System.out.println("Digite o ano: ");
        anoEscolhido = scanner.nextInt();

        //Calcular o ano Bissexto
        if(anoEscolhido%100!=0 && anoEscolhido%4==0 || anoEscolhido%400==0){
        System.out.println(" O ano " + anoEscolhido + " é um ano bissexto." );
       } else { System.out.println(" O ano " + anoEscolhido + " não é um ano bissexto. ");
    }
  scanner.close();
    }
}      
