package Hastane_projesi;

public class HastaneRunner {

    private static Hastane hastane1 = new Hastane();

    public static void main(String[] args) {

        String hastaDurumu = hastane1.durumlar[3];




        hastane1.setDoktor(doktorBul(doktorUnvan(hastaDurumu)));
        hastane1.setHasta(hastaBul(hastaDurumu));


        System.out.println(hastane1.getDoktor().getIsim());
        System.out.println(hastane1.getDoktor().getSoyIsim());
        System.out.println(hastane1.getDoktor().getUnvan());

        System.out.println(hastane1.getHasta().getIsim());
        System.out.println(hastane1.getHasta().getSoyIsim());
        System.out.println(hastane1.getHasta().getHastaID());


    }


    public static String doktorUnvan(String aktuelDurum) {

        if (aktuelDurum.contains("Allerji")) {
            return (hastane1.unvanlar[0]);

        } else if (aktuelDurum.contains("Bas Agrisi")) {
            return (hastane1.unvanlar[1]);

        } else if (aktuelDurum.contains("Diabet")) {
            return (hastane1.unvanlar[2]);

        } else if (aktuelDurum.contains("Soguk alginligi")) {
            return (hastane1.unvanlar[3]);

        } else if (aktuelDurum.contains("Migren")) {
            return (hastane1.unvanlar[4]);

        } else if (aktuelDurum.contains("Kalp Hastaliklari")) {
            return (hastane1.unvanlar[5]);
        } else {
            System.out.println("Yanlis unvan girdiniz");
        }

        return doktorUnvan(aktuelDurum);
    }


    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane1.unvanlar.length; i++) {

            if (unvan.equals(hastane1.unvanlar[i])) {
                doktor.setIsim(hastane1.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
                doktor.setUnvan(hastane1.unvanlar[i]);


            }

        }
        return doktor;

    }

    public static Durum hastaDurumuBul(String aktuelDurum) {

        Durum hastaDurumu = new Durum();

        switch (aktuelDurum) {
            case "Allerji":
                hastaDurumu.setAciliyet(false);
                break;

            case "Bas Agrisi":
                hastaDurumu.setAciliyet(false);
                break;

            case "Diabet":
                hastaDurumu.setAciliyet(false);
                break;

            case "Soguk Alginligi":
                hastaDurumu.setAciliyet(false);
                break;

            case "Migren":
                hastaDurumu.setAciliyet(true);
                break;

            case "Kalp Hastaliklari":
                hastaDurumu.setAciliyet(true);
                break;

            default:
                System.out.println("Gecerli bir durum degil");
        }

        return hastaDurumu;


    }


    public static Hasta hastaBul(String actualCase) {
        Hasta hasta = new Hasta();

        for (int i = 0; i < hastane1.durumlar.length; i++) {

            if (actualCase.equals(hastane1.durumlar[i])) {
                hasta.setIsim(hastane1.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[i]);
                hasta.setHastaID(hastane1.hastaIDleri[i]);


            }
        }
        return hasta;

    }
}





