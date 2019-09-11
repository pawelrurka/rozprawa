package pierwszy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pierwszy.dao.Adres;
import pierwszy.dao.Osoba;
import pierwszy.dao.Pozwany;

import java.util.Arrays;
import java.util.Random;

public class Helloworld {
    static Logger logger = LoggerFactory.getLogger(Helloworld.class);
    private static int [] tablica;
    private static String imie = "Pawel";
    private static String nazwisko = "Rurka";
    private static int obecni = 0;
    private static String imieS ="Imie: ";
    private static String nazwiskoS = "Nazwisko: ";
    private static String przejscie = "\n";
    private static String zawodS = "Zawod: ";
    private static String powodS = "Powod oskarzenia: ";
    private static String opisS = "Opis: ";
    private static String miejsceS = "Miejsce zamieszkania: ";


    private static void prepareArray() {
        Random rd = new Random();
        tablica = new int[5];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rd.nextInt();
        }
    }

    private static void napiszWstep() {
        logger.info("Witamy na rozprawie. Protokolant rozprawy: " + " " + imie + " " + nazwisko);
    }

    private static void napiszSedziego() {
        Osoba osoba = new Osoba();
        osoba.setImie("Janusz");
        osoba.setNazwisko("Kowalski");
        osoba.setWiek(50);

        String sedzia = "\nProwadzacy rozprawe sedzia:\n";

        StringBuilder stringSedziego = new StringBuilder();
        stringSedziego.append(sedzia);
        stringSedziego.append(imieS);
        stringSedziego.append(osoba.getImie());
        stringSedziego.append(przejscie);
        stringSedziego.append(nazwiskoS);
        stringSedziego.append(osoba.getNazwisko());
        stringSedziego.append(przejscie);
        stringSedziego.append(zawodS);
        stringSedziego.append(osoba.getZawod());
        stringSedziego.append(przejscie);
        stringSedziego.append(powodS);
        stringSedziego.append(osoba.getPowod());
        stringSedziego.append(przejscie);
        System.out.println(stringSedziego);

        logger.info(stringSedziego.toString());
        obecni++;
    }

    private static void napiszOskarzonego() {
        Osoba osoba = new Osoba();
        Pozwany pozwany = new Pozwany();
        osoba.setImie("Andrzej");
        osoba.setNazwisko("Jakistam");
        osoba.setWiek(42);
        osoba.setZawod("Bezrobotny");
        osoba.setPowod("Morderstwo");
        pozwany.setOpis("Uwielbia motyle");
        String oskarzony = "\nDane dotyczące głównego oskarżonego:\n";

        StringBuilder stringOskarzonego = new StringBuilder();
        stringOskarzonego.append(oskarzony);
        stringOskarzonego.append(imieS);
        stringOskarzonego.append(osoba.getImie());
        stringOskarzonego.append(przejscie);
        stringOskarzonego.append(nazwiskoS);
        stringOskarzonego.append(osoba.getNazwisko());
        stringOskarzonego.append(przejscie);
        stringOskarzonego.append(zawodS);
        stringOskarzonego.append(osoba.getZawod());
        stringOskarzonego.append(przejscie);
        stringOskarzonego.append(powodS);
        stringOskarzonego.append(osoba.getPowod());
        stringOskarzonego.append(przejscie);
        stringOskarzonego.append(opisS);
        stringOskarzonego.append(pozwany.getOpis());
        stringOskarzonego.append(przejscie);

        System.out.println(stringOskarzonego);

        logger.info(stringOskarzonego.toString());
        obecni++;
    }

    private static void napiszProkuratora() {
        Osoba osoba = new Osoba();
        osoba.setImie("Robert");
        osoba.setNazwisko("Chrząszcz");
        osoba.setWiek(48);
        String prokurator = "\nDane dotyczące prokuratora:\n";

        StringBuilder stringProkuratora = new StringBuilder();
        stringProkuratora.append(prokurator);
        stringProkuratora.append(imieS);
        stringProkuratora.append(osoba.getImie());
        stringProkuratora.append(przejscie);
        stringProkuratora.append(nazwiskoS);
        stringProkuratora.append(osoba.getNazwisko());
        stringProkuratora.append(przejscie);
        stringProkuratora.append(zawodS);
        stringProkuratora.append(osoba.getZawod());
        stringProkuratora.append(przejscie);
        stringProkuratora.append(powodS);
        stringProkuratora.append(osoba.getPowod());
        stringProkuratora.append(przejscie);

        System.out.println(stringProkuratora);

        logger.info(stringProkuratora.toString());
        obecni++;
    }

    private static void napiszObronce() {
        Osoba osoba = new Osoba();
        osoba.setImie("Marek");
        osoba.setNazwisko("Nowak");
        osoba.setWiek(34);
        String obronca = "\nDane dotyczące obrońcy:\n";

        StringBuilder stringObroncy = new StringBuilder();
        stringObroncy.append(obronca);
        stringObroncy.append(imieS);
        stringObroncy.append(osoba.getImie());
        stringObroncy.append(przejscie);
        stringObroncy.append(nazwiskoS);
        stringObroncy.append(osoba.getNazwisko());
        stringObroncy.append(przejscie);
        stringObroncy.append(zawodS);
        stringObroncy.append(osoba.getZawod());
        stringObroncy.append(przejscie);
        stringObroncy.append(powodS);
        stringObroncy.append(osoba.getPowod());
        stringObroncy.append(przejscie);

        System.out.println(stringObroncy);

        logger.info(stringObroncy.toString());
        obecni++;
    }



    private static void napiszDrugiegoOskarzonego() {
        Osoba osoba = new Osoba();
        osoba.setImie("Marek");
        osoba.setNazwisko("Kawon");
        osoba.setWiek(43);
        osoba.setZawod("Rzeźnik");
        osoba.setPowod("Pomoc oskarżonemu w zatarciu śladów morderstwa.");
        String drugiOskarzony = "\nDane dotyczące drugiego oskarżonego:\n";
        StringBuilder stringDrugiegoOskarzonego = new StringBuilder();
        stringDrugiegoOskarzonego.append(drugiOskarzony);
        stringDrugiegoOskarzonego.append(imieS);
        stringDrugiegoOskarzonego.append(osoba.getImie());
        stringDrugiegoOskarzonego.append(przejscie);
        stringDrugiegoOskarzonego.append(nazwiskoS);
        stringDrugiegoOskarzonego.append(osoba.getNazwisko());
        stringDrugiegoOskarzonego.append(przejscie);
        stringDrugiegoOskarzonego.append(zawodS);
        stringDrugiegoOskarzonego.append(osoba.getZawod());
        stringDrugiegoOskarzonego.append(przejscie);
        stringDrugiegoOskarzonego.append(powodS);
        stringDrugiegoOskarzonego.append(osoba.getPowod());
        stringDrugiegoOskarzonego.append(przejscie);

        System.out.println(stringDrugiegoOskarzonego);

        logger.info(stringDrugiegoOskarzonego.toString());
        obecni++;
    }

    private static void napiszSwiadka(){
        Osoba osoba = new Osoba();
        Adres adres = new Adres();
        osoba.setImie("Jan");
        osoba.setNazwisko("Pasek");
        osoba.setWiek(55);
        osoba.setZawod("Wlaściciel rzeźni, pracodawca drugiego oskarżonego");
        String swiadek = "\nDane dotyczące świadka:\n";
        StringBuilder stringSwiadka = new StringBuilder();
        stringSwiadka.append(swiadek);
        stringSwiadka.append(imieS);
        stringSwiadka.append(osoba.getImie());
        stringSwiadka.append(przejscie);
        stringSwiadka.append(nazwiskoS);
        stringSwiadka.append(osoba.getNazwisko());
        stringSwiadka.append(przejscie);
        stringSwiadka.append(zawodS);
        stringSwiadka.append(osoba.getZawod());
        stringSwiadka.append(przejscie);
        stringSwiadka.append(powodS);
        stringSwiadka.append(osoba.getPowod());
        stringSwiadka.append(przejscie);
        stringSwiadka.append(miejsceS);
        stringSwiadka.append(adres.getRodzaj());
        stringSwiadka.append(adres.getNazwa());
        stringSwiadka.append(adres.getNumerUlicy());
        stringSwiadka.append(adres.getRozszerzenieUlicy());
        stringSwiadka.append(adres.getNumerMieszkania());
        stringSwiadka.append(adres.getRozszerzenieMieszkania());
        stringSwiadka.append(przejscie);

        System.out.println(stringSwiadka);

        logger.info(stringSwiadka.toString());
        obecni++;

    }

    private static void napiszIleObecnych(){
        logger.info("\nNa sali jest " + obecni + " obecnych.\n");
    }

    private static void nicTuNieMa(){
        System.out.println("Nic tu nie ma! Coś się popsuło??");
    }

    private static void opowiedzHistorie(){
        napiszSedziego();
        napiszOskarzonego();
        napiszProkuratora();
        napiszObronce();
        napiszDrugiegoOskarzonego();
        napiszSwiadka();
        napiszIleObecnych();
        nicTuNieMa();
    }

    public static void main(String args[]){
        napiszWstep();
        opowiedzHistorie();
        prepareArray();
        Arrays.stream(tablica).forEach(i ->logger.info("Generated {}", i));
    }
}
