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

public class Q3 {
    
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
   
    //double z=

    System.out.println("Digite o raio da circunferencia" );
    double x = scanner.nextDouble();
    
    
    //System.out.println("Digite a largura do retangulo" );
    //double y = scanner.nextDouble();
    
    double a = 3.14*(x*x);
    
    double p = 2*3.14*x;
    
    System.out.println("A area da circunferencia é "+ a +" comprimento é"+ p);
    
    scanner.close();
    
     }
    }