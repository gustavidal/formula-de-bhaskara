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

        System.out.println("");
        System.out.println("Sabendo da fórmula da equação de segundo grau:");
        System.out.println("ax² + bx + c = 0");
        System.out.println("");
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

        System.out.println("");

        if (a == 0 && b == 0 && c == 0){
            System.out.println("Afirmação verdadeira!");
            System.out.println("0 = 0");
        } else if ((a == 0 && b == 0 && c > 0)
                || (a == 0 && b == 0 && c < 0)){
            System.out.println("Afirmação falsa!");
            System.out.println(c + " ≠ 0");
        } else if ((a == 0 && b > 0 && c == 0)
                || (a == 0 && b < 0 && c == 0)
                || (a > 0 && b == 0 && c == 0)
                || (a < 0 && b == 0 && c == 0)){
            System.out.println("Problema sem solução - ∅ (vazio)");
        } else if ((a == 0 && b > 0 && c > 0)
                || (a == 0 && b < 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(b + "x + " + c + " = 0");
            descobrirOsValoresDeX();
        } else if ((a == 0 && b > 0 && c < 0)
                || (a == 0 && b < 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(b + "x - " + cPos + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b == 0 && c > 0)
                || (a < 0 && b == 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + c + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b == 0 && c < 0)
                || (a < 0 && b == 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + cPos + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b > 0 && c == 0)
                || (a < 0 && b > 0 && c == 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + b + "x = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b > 0 && c > 0)
                || (a < 0 && b > 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + b + "x + " + c + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b > 0 && c < 0)
                || (a < 0 && b > 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² + " + b + "x - " + cPos + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b < 0 && c == 0)
                || (a < 0 && b < 0 && c == 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + bPos + "x" + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b < 0 && c > 0)
                || (a < 0 && b < 0 && c > 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + bPos + "x + " + c + " = 0");
            descobrirOsValoresDeX();
        } else if ((a > 0 && b < 0 && c < 0)
                || (a < 0 && b < 0 && c < 0)){
            System.out.println("A equação é a seguinte:");
            System.out.println(a + "x² - " + bPos + "x - " + cPos + " = 0");
            descobrirOsValoresDeX();
        }
    }

    public void descobrirOsValoresDeX(){
        double delta;
        delta = (b * b) - (4 * a * c);

        x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

        if (delta < 0){
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("Valor de a: " + a);
            System.out.println("Valor de b: " + b);
            System.out.println("Valor de c: " + c);
            System.out.println("");
            System.out.println("O valor de delta é negativo:");
            System.out.println("Delta: " + delta);
            System.out.println("Então x1 e x2 ∉ ℝ.");
            System.out.println("----------------------------");
        } else {
            exibirResultados();
        }
    }

    public void exibirResultados(){
        String x1Format = String.format("%.3f", x1);
        String x2Format = String.format("%.3f", x2);

        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de c: " + c);
        System.out.println("");
        System.out.println("Valor de x1~: " + x1Format);
        System.out.println("Valor de x2~: " + x2Format);
        System.out.println("----------------------------");
    }
}
