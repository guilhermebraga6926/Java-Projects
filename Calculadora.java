import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //  OBJETO : TECLADO DA CALCULADORA - METODO CONSTRUTROR

    Numero n1 = new Numero(); //  objeto n1
    Numero n2 = new Numero(); // objeto n2
    Numero res = new Numero(); // objeto res

    System.out.println("Digite o n1: ");
    n1.setValor(scan.nextInt());
    n2.setValor(scan.nextInt());
    res.setValor(n1.getValor() + n2.getValor());
    System.out.printf("A soma de n1 mais n2 é: ", n1.getValor(), n2.getValor());
    res.setValor(0);
  }
}
