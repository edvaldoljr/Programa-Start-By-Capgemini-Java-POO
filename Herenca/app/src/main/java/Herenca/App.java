
package Herenca;

public class App {
    public String getGreeting() {
        return null;
    }

    public static void main(String[] args) {
   
        Vendedor v = new Vendedor();
        v.setNome("Joao");
        v.setTotalItensVendidos(20);
        v.setCpf("374.515.125-35");
        v.getDataNascimento();
        System.out.print(v);
    }
}
