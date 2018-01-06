package application;

public class Uczen {

    String imie;
    String nazwisko;
    float oceny[];

    //metoda wyliczania średniej
        public float sredniaOcen() {
            float sumaOcen = 0;

            for (int i = 0; i < oceny.length; i++) {
                sumaOcen += oceny[i];
            }

            float liczbaOcen = oceny.length;
            float wyliczonaSrednia = sumaOcen/liczbaOcen;


            return wyliczonaSrednia;
        }

        //metoda znajdująca najgorszą ocenę
        public float najgorszaOcena() {
            float minOcena = oceny[0];

                for (int i=0; i<oceny.length; i++) {
                    if (minOcena>oceny[i]) {
                        minOcena=oceny[i];
            }
        }

            return minOcena;
        }

        //metoda znajdująca najlepszą ocenę
        public float najlepszaOcena() {
            float maxOcena = oceny[0];

                for (int i=0; i<oceny.length; i++) {
                    if (maxOcena<oceny[i]) {
                        maxOcena=oceny[i];
            }
        }
            return maxOcena;
        }
}
