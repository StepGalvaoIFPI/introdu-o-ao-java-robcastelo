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
}

public class Q1 {
    
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
   
    //double z=

    System.out.println("Digite a altura do triangulo" );
    double x = scanner.nextDouble();
    
    
    System.out.println("Digite a base do triangulo" );
    double y = scanner.nextDouble();
    
    double a = (x*y)/2;
    
    System.out.println("A area do triangulo é :"+a);
    
    scanner.close();
    
     }
    }