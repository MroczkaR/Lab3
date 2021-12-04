package com.company;

import java.util.Scanner;

public class Main {



    static void Zadanie1()
    {
        System.out.println("Zadanie 1 :");
        System.out.println("Podaj dwie liczby :");
        Scanner scan = new Scanner(System.in);
        int [] tab1 = new int[2];
        tab1[0] = scan.nextInt();
        tab1[1] = scan.nextInt();
        System.out.println("Suma " + tab1[0] + " i " + tab1[1] + " wynosi : "+ WynikZadania1(tab1[0], tab1[1]));

    }

    static int WynikZadania1(int x, int y)
    {
        return x + y;
    }

    static void Zadanie2()
    {
        System.out.println("Zadanie 2 :");
        System.out.println("Podaj trzy liczby :");
        Scanner scan = new Scanner(System.in);
        int [] tab2 = new int[3];
        for(int i=0; i<3; i++)
        {
            tab2[i] = scan.nextInt();
        }
        System.out.println("Najwieksza liczba z tych trzech to : " + WynikZadania2(tab2));
    }

    static int WynikZadania2(int [] tab)
    {
        if(tab[0] > tab[1])
        {
            if(tab[0] > tab[2])
            {
                return tab[0];
            }
            else if(tab[1] > tab[2])
            {
                return tab[1];
            }
            else
            {
                return tab[2];
            }
        }
        else if(tab[1] > tab[2])
        {
            return tab[1];
        }
        else
        {
            return tab[2];
        }
    }

    static void Zadanie4()
    {
        System.out.println("Zadanie 4 :");
        System.out.println("Podaj osiem liczby :");
        Scanner scan = new Scanner(System.in);
        int [] tab3 = new int[8];
        for(int i=0; i<8; i++)
        {
            tab3[i] = scan.nextInt();
        }

        System.out.println("Posegregowana tablica rosnaco : ");
        tab3 = SortowanieZadanie4(tab3);
        for(int i =0; i<8; i++)
        {
            System.out.print(tab3[i] + ", ");
        }
    }

    static int [] SortowanieZadanie4(int [] tab)
    {
        int x;
        for(int j = 0; j < 7; j++)
        {
            for(int i =0; i < 7 - j; i++)
            {
                if(tab[i] > tab[i+1])
                {
                    x = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1] = x;
                }
            }
        }
        return tab;
    }

    static void Zadanie5()
    {
        System.out.println("Zadanie 5 :");
        System.out.println("Podaj 5 liczb :");
        Scanner scan = new Scanner(System.in);
        int [] tab = new int[5];
        for(int i=0; i<5; i++)
        {
            tab[i] = scan.nextInt();
        }

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Silnia z liczby " + tab[i] + " wynosi : " + Silnia(tab[i]));
        }

    }

    static int Silnia(int x)
    {
        if(x > 1)
        {
            return x * Silnia(x - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {

	    //Zadanie1();
        //Zadanie2();
        //Zadanie4();
        Zadanie5();

    }
}
