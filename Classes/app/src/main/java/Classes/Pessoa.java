package Classes;

/**
 *
 * @author Edvaldojr
 */

public class Pessoa {
    
    private float peso;
    private float altura;
    
    public Pessoa(){
        
    }
    
    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public float culcularIMC (){
        float imc = peso / (altura * altura);
        return imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}