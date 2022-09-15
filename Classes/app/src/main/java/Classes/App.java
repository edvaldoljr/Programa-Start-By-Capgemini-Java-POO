
package Classes;

import java.util.Scanner;

public class App {
   public static void main (String[] args) {
       
       Scanner scan = new Scanner(System.in);
       
       Pessoa objetoPessoa = new Pessoa(70.0f, 1.58f);
       
       System.out.println("Digite o peso da pessoa");
       objetoPessoa.setPeso(scan.nextFloat());
       
       System.out.println("Digitte a alttura da pessoa");
       objetoPessoa.setAltura(scan.nextFloat()) ;
       
       System.out.println("IMC: " + objetoPessoa.culcularIMC());
   }
}
