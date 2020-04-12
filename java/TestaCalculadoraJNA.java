import com.sun.jna.Native;
 
public class TestaCalculadoraJNA {
 
  public static void main(String[] args) {
    CalculadoraJNA calculadora = (CalculadoraJNA)
      Native.loadLibrary("somadorJNA", CalculadoraJNA.class);
 
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
 
    int resultado = calculadora.soma(num1, num2);
    System.out.println("A soma é: " + resultado);
  }
}