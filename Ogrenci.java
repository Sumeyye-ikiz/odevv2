
    public class Ogrenci {
        private String ad;
        private String bolum;
        private int girisyili;
        private String ogrNo;
        private double gano;
        private String bolumKodu;

        // Constructor Overloading
        public Ogrenci(String ad, String bolum, int girisyili, double gano, String bolumKodu) {
            this.ad = ad;
            this.bolum = bolum;
            this.girisyili = girisyili;
            this.gano = gano;
            this.bolumKodu = bolumKodu;
            this.ogrNo = hesaplaOgrNo(girisyili, bolumKodu);
        }

        public Ogrenci(String ad, String bolum, int girisyili, double gano) {
            this(ad, bolum, girisyili, gano, "");
        }

        // Getter and Setter methods
        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getBolum() {
            return bolum;
        }

        public void setBolum(String bolum) {
            this.bolum = bolum;
        }

        public int getGirisyili() {
            return girisyili;
        }

        public void setGirisyili(int girisyili) {
            this.girisyili = girisyili;
        }

        public String getOgrNo() {
            return ogrNo;
        }

        public double getGano() {
            return gano;
        }

        public void setGano(double gano) {
            if (gano >= 0 && gano <= 4) {
                this.gano = gano;
            } else {
                throw new IllegalArgumentException("Gano 0 ile 4 arasında olmalıdır.");
            }
        }

        // Öğrenci numarasını hesapla
        private String hesaplaOgrNo(int girisYili, String bolumKodu) {
            // Öğrenci no formatı: giriş yılı + bölüm kodu + giriş sırası (10 haneli)
            String girisSira = String.format("%02d", (int)(Math.random() * 100)); // 0 ile 99 arası rastgele sayı
            return String.valueOf(girisYili) + bolumKodu + girisSira;
        }

        // Harc Hesapla metodu
        public double harcHesapla(int dersSayisi, int uzatmaYili) {
            double toplamHarc = dersSayisi * 1000; // Her ders için 1000 TL harç
            if (uzatmaYili > 0) {
                toplamHarc += uzatmaYili * 2000; // Her uzatma yılı için 2000 TL ek harç
            }
            return toplamHarc;
        }
}
