package com.company;
import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        int c, a = 0;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número de entradas: ");
        int ent = ler.nextInt();
        int[] idade = new int[ent];
        if(ent == 1)
            System.out.println("Digite a idade");
        else
            System.out.println("Digite as idades");
        for (c = 0; c < ent; c++)
        {
            idade[c] = ler.nextInt();
            if (idade[c] >= 18)
                a++;
        }
        System.out.println("\n----------------------------");
        for (c = 0; c < ent; c++)
            System.out.println(+(c+1)+". Nascido em "+(2021-idade[c])+" ("+idade[c]+" anos)");
        if (a == 1)
            System.out.println("Total de "+a+" maior de idade. \n\nRecebido um total de "+idade.length+" entradas.");
        else
            System.out.println("Total de "+a+" maiores de idade. \n\nRecebido um total de "+idade.length+" entradas.");

    }
}
