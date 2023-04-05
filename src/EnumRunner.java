public class EnumRunner
{
    public static void main(String[] args)
    {
        String sehir=Universiteler.Cukurova.getSehir();


        System.out.println(sehir);


        String bolum=Universiteler.sehirdenUniversiteBul("adana");

        System.out.println(bolum);

        System.out.println(Universiteler.bolumdenUniversiteBul("isletme"));


        System.out.println(Universiteler.sayidanUniversiteBul(62));
    }

}
