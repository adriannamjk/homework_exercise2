package application;

import java.util.ArrayList;

public class Uczen {


    ArrayList<Double> grades;


    //metoda wyliczania średniej
        public float sredniaOcen() {
            double sumaOcen = 0;

            for (int i = 0; i < grades.size(); i++) {
                sumaOcen += grades.get(i);
            }

            int liczbaOcen = grades.size();
            double wyliczonaSrednia = sumaOcen/liczbaOcen;


            return (float) wyliczonaSrednia;
        }

        //metoda znajdująca najgorszą ocenę
        public float najgorszaOcena() {
            double minOcena = grades.get(0);

                for (int i=0; i<grades.size(); i++) {
                    if (minOcena> grades.get(i)) {
                        minOcena= grades.get(i);
            }
        }

            return (float) minOcena;
        }

        //metoda znajdująca najlepszą ocenę
        public float najlepszaOcena() {
            double maxOcena = grades.get(0);

                for (int i=0; i<grades.size(); i++) {
                    if (maxOcena< grades.get(i)) {
                        maxOcena= grades.get(i);
            }
        }
            return (float) maxOcena;
        }
}
