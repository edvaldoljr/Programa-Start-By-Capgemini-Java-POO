
package Herenca;

public class Vendedor extends Funcionario {
    
   
    private int TotalItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor(){
        super();
    }

    public int getTotalItensVendidos() {
        return TotalItensVendidos;
    }

    public void setTotalItensVendidos(int TotalItensVendidos) {
        this.TotalItensVendidos = TotalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
    
}