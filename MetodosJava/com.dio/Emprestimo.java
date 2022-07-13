package com.dio;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Digite o valor do empréstimo:");
        int valor = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Digite a quantidade de parcelas entre 2 ou 3:");
        int parcelas = sc2.nextInt();

        Emprestimo.obterValor(valor, parcelas);
    }

    public static void obterValor(float valor, int parcelas){
        if (parcelas==2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final do empréstimo com duas parcelas é: " +valorFinal);
        }
        else if (parcelas==3){
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final do empréstimo com tres parcelas é: " + valorFinal);
        }

    }
    public static double getTaxaDuasParcelas (){
        return 4.5;
    }
    public static double getTaxaTresParcelas (){
        return 5.7;
    }
}
