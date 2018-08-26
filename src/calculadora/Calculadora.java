package calculadora;
public class Calculadora {
    private int numero1;
    private int numero2;
    private int resultado;
    public void setnumero1 (int valor) {
        this.numero1 = valor;
    }
    public void setnumero2 (int valor) {
        this.numero2 = valor;
        
    }
    public int getresultado () {
        return this.resultado;
        
    }
    public void Sumar(){
        this.resultado = this.numero1 + this.numero2;
    }
    public void Restar(){
        this.resultado = this.numero1 - this.numero2;
    }
    public void Multiplicar(){
        this.resultado = this.numero1 * this.numero2;
    }
    public void Dividir(){
        this.resultado = this.numero1 / this.numero2;
    }
}