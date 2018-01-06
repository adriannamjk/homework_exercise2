package application;

import java.io.PrintStream;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Uczen ucz1 = new Uczen();
        Uczen ucz2 = new Uczen();
        Uczen ucz3 = new Uczen();

        ucz1.imie = "Adrianna";
        ucz1.nazwisko = "Majewska";
        ucz1.oceny = new float[]{5,5,3, (float) 4.5,6};

        ucz2.imie = "Maria";
        ucz2.nazwisko = "Skłodowska";
        ucz2.oceny = new float[]{4,4,3,5,2};

        ucz3.imie = "Adam";
        ucz3.nazwisko = "Mickiewicz";
        ucz3.oceny = new float[]{2,2,2,4,1};


        System.out.println(ucz1.imie + " " + ucz1.nazwisko
                + " \nSrednia ocen: " + ucz1.sredniaOcen()
                + " \nNajgorsza ocena: " + ucz1.najgorszaOcena()
                + " \nNajlepsza ocena: " + ucz1.najlepszaOcena());

        System.out.println(ucz2.imie + " " + ucz2.nazwisko
                + " \nSrednia ocen: " + ucz2.sredniaOcen()
                + " \nNajgorsza ocena: " + ucz2.najgorszaOcena()
                + " \nNajlepsza ocena: " + ucz2.najlepszaOcena());

        System.out.println(ucz3.imie + " " + ucz3.nazwisko
                + " \nSrednia ocen: " + ucz3.sredniaOcen()
                + " \nNajgorsza ocena: " + ucz3.najgorszaOcena()
                + " \nNajlepsza ocena: " + ucz3.najlepszaOcena());

    }

}
