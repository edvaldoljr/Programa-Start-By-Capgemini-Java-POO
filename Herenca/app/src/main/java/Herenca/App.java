
package Herenca;

import java.util.Date;

public class App {
    public String getGreeting() {
        return null;
    }

    public static void main(String[] args) {
   
        Vendedor v = new Vendedor();
        v.setNome("Joao");
        v.setSalario(100.0f);
        v.setCpf("374.515.125-35");
        v.setDataNascimento(new Date());
        
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(20);
        
        System.out.println("O salario do vendedor " + v.getNome() + " é R$: " + v.calcularSalario());
    }
}
