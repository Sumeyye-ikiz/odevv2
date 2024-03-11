public class Main {

        public static void main(String[] args) {
            Ogrenci ogrenci1 = new Ogrenci("Mehmet", "Bilgisayar Mühendisliği", 2020, 3.25, "01");
            System.out.println("Öğrenci 1:");
            System.out.println("Adı: " + ogrenci1.getAd());
            System.out.println("Bölümü: " + ogrenci1.getBolum());
            System.out.println("Giriş Yılı: " + ogrenci1.getGirisyili());
            System.out.println("Öğrenci No: " + ogrenci1.getOgrNo());
            System.out.println("Gano: " + ogrenci1.getGano());

            Ogrenci ogrenci2 = new Ogrenci("Ayşe", "Elektrik-Elektronik Mühendisliği", 2018, 2.90, "02");
            System.out.println("\nÖğrenci 2:");
            System.out.println("Adı: " + ogrenci2.getAd());
            System.out.println("Bölümü: " + ogrenci2.getBolum());
            System.out.println("Giriş Yılı: " + ogrenci2.getGirisyili());
            System.out.println("Öğrenci No: " + ogrenci2.getOgrNo());
            System.out.println("Gano: " + ogrenci2.getGano());

            System.out.println("\nHarc Hesapları:");
            System.out.println("Öğrenci 1 için ödenecek harç: " + ogrenci1.harcHesapla(6, 0) + " TL");
            System.out.println("Öğrenci 2 için ödenecek harç: " + ogrenci2.harcHesapla(5, 1) + " TL");
        }
    }
    
