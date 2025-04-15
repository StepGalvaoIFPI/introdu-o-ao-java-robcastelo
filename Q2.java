/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;


 class Atividade_robert {
    public double x;
    public double y;
    public double a;
    public double p;
}

public class Q2 {
    
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
   
    //double z=

    System.out.println("Digite a altura do retangulo" );
    double x = scanner.nextDouble();
    
    
    System.out.println("Digite a largura do retangulo" );
    double y = scanner.nextDouble();
    
    double a = (x*y);
    
    double p = (2*x) + (2*y);
    
    System.out.println("A area do retungulo é :"+ a +" e seu perimetro é :"+ p);
    
    scanner.close();
    
     }
    }