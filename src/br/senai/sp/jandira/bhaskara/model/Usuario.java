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

        System.out.println(a + b + c);
    }
}
