package com.dio;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //primeira aplicação
        //Solicitar dois valores
        // calcular operações básicas de soma, subtracao, multiplicação e divisao

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o primeiro valor:");
        int a = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Digite o segundo valor:");
        int b = sc2.nextInt();

        Calculadora.somar(a,b);
        Calculadora.subtrair(a,b);
        Calculadora.dividir(a,b);
        Calculadora.multiplicar(a,b);

    }

    public static void somar(double a, double b) {
        double soma = a + b;
        System.out.println(soma);
    }

    public static void subtrair(double a, double b) {
        double subtracao = a - b;
        System.out.println(subtracao);
    }

    public static void multiplicar(double a, double b) {
        double multiplicacao = a * b;
        System.out.println(multiplicacao);
    }

    public static void dividir(double a, double b) {
        double divisao = a / b;
        System.out.println(divisao);
    }

    }



