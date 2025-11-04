package br.senai.sp.jandira.bhaskara.model;

import java.util.Scanner;

public class Usuario {

    double x1;
    double x2;
    int a;
    int b;
    int c;

    public void obterValores(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor de \"a\", aquele que acompanha o x²: ");
        a = leitor.nextInt();

        System.out.print("Informe o valor de \"b\", aquele que acompanha o x: ");
        b = leitor.nextInt();

        System.out.print("Informe o valor de \"c\", o termo independente: ");
        c = leitor.nextInt();

        formatarEquacao();
    }

    public void formatarEquacao(){
        int bPos = b * (-1);
        int cPos = c * (-1);

        if (a == 0 && b == 0 && c == 0){
            System.out.println("Sua afirmação é verdadeira!");
        } else if ((a == 0 && b == 0 && c > 0)
                || (a == 0 && b == 0 && c < 0)){
            System.out.println("Sua afirmação é falsa!");
            System.out.println(c + " ≠ 0");
        } else if ((a == 0 && b > 0 && c == 0)
                || (a == 0 && b < 0 && c == 0)
                || (a > 0 && b == 0 && c == 0)
                || (a < 0 && b == 0 && c == 0)){
            System.out.println("Problema sem solução: ∅ (vazio)");
        } else if ((a == 0 && b > 0 && c > 0)
                || (a == 0 && b < 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(b + "x + " + c + " = 0");
        } else if ((a == 0 && b > 0 && c < 0)
                || (a == 0 && b < 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(b + "x - " + cPos + " = 0");
        } else if ((a > 0 && b == 0 && c > 0)
                || (a < 0 && b == 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + c + " = 0");
        } else if ((a > 0 && b == 0 && c < 0)
                || (a < 0 && b == 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + cPos + " = 0");
        } else if ((a > 0 && b > 0 && c == 0)
                || (a < 0 && b > 0 && c == 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + b + "x = 0");
        } else if ((a > 0 && b > 0 && c > 0)
                || (a < 0 && b > 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + b + "x + " + c + " = 0");
        } else if ((a > 0 && b > 0 && c < 0)
                || (a < 0 && b > 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + b + "x - " + cPos + " = 0");
        } else if ((a > 0 && b < 0 && c == 0)
                || (a < 0 && b < 0 && c == 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + bPos + "x" + " = 0");
        } else if ((a > 0 && b < 0 && c > 0)
                || (a < 0 && b < 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + bPos + "x + " + c + " = 0");
        } else if ((a > 0 && b < 0 && c < 0)
                || (a < 0 && b < 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + bPos + "x - " + cPos + " = 0");
        }
    }
}
