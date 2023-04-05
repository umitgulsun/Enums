
    import java.util.Arrays;

    public enum Universiteler
    {
        Odtu("ankara","isletme",125),
        Bogazici("istanbul","bilgisayar",200),
        Cukurova("adana","yazilim",75),
        KaraElmas("zonguldak","ogretmenlik",62),
        ;

        String sehir;
        String bolum;
        int sayisi;



        Universiteler(String sehir, String bolum, int sayisi)
        {
            this.sehir = sehir;
            this.bolum = bolum;
            this.sayisi = sayisi;
        }

        public String getSehir()
        {
            return sehir;
        }

        public String getBolum()
        {
            return bolum;
        }

        public int getSayisi()
        {
            return sayisi;
        }


        public static String sehirdenUniversiteBul(String sehir){

            return Arrays.stream(values()).
                    filter(t->t.getSehir().equals(sehir)).findFirst().get().getBolum();
        }

        public static String bolumdenUniversiteBul(String bolum){

            return Arrays.stream(values()).
                    filter(t->t.getBolum().equals(bolum)).findFirst().get().toString();
        }
        public static String sayidanUniversiteBul(int sayisi){

            return Arrays.stream(values()).
                    filter(t->t.getSayisi()==sayisi).findFirst().toString();
        }


    }

