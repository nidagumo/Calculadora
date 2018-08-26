package calculadora;
import java.util.Scanner;

public class Interfase {
    public static void main (String []args){
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("que opreacion desea ejecutar\n 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. Division");
        int a = sc.nextInt();
        switch (a){
            case 1: 
                System.out.println("Ingrese un numero");
                c.setnumero1(sc.nextInt());
                System.out.println("Ingrese otro numero");
                c.setnumero2(sc.nextInt());
                c.Sumar();
                System.out.println("El resultado de la suma es "+c.getresultado());
                break;
            case 2: 
                System.out.println("Ingrese un numero");
                c.setnumero1(sc.nextInt());
                System.out.println("Ingrese otro numero");
                c.setnumero2(sc.nextInt());
                c.Restar();
                System.out.println("El resultado de la resta es "+c.getresultado());
                break;
            case 3: 
                System.out.println("Ingrese un numero");
                c.setnumero1(sc.nextInt());
                System.out.println("Ingrese otro numero");
                c.setnumero2(sc.nextInt());
                c.Multiplicar();
                System.out.println("El resultado de la multiplicacion es "+c.getresultado());
                break;
            case 4: 
                System.out.println("Ingrese un numero");
                c.setnumero1(sc.nextInt());
                System.out.println("Ingrese otro numero");
                c.setnumero2(sc.nextInt());
                c.Dividir();
                System.out.println("El resultado de la division es "+c.getresultado());
                break; 
        }
        
        
    }    
}