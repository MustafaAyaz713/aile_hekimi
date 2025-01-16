import java.util.Scanner;

public class karsilama {

    private String secilenDoktor;
    public static void main(String[] args) {
        karsilama karsilama = new karsilama();
        karsilama.girisAndKayit();
        karsilama.kullaniciGiris();
    }

    void girisAndKayit() {
        System.out.println("1 - Giris Yap");
        System.out.println("2 - Kayıt Ol");
        Scanner s = new Scanner(System.in);
        String girisAndKayit = s.nextLine();

        if (girisAndKayit.equals("1")) {
            kullaniciGiris();
        }
        if (girisAndKayit.equals("2")) {
            kayitOl.kayitOl();
        }
    }

    void kullaniciGiris() {
        System.out.println("Merhabalar, Lütfen Sırasıyla İsminizi ve T.C. Numaranızı Giriniz.");

        Scanner s = new Scanner(System.in);
        System.out.println("İsminiz:");
        String adSoyad = s.nextLine();
        System.out.println("T.C. Numaranız");
        String tcNo = s.nextLine();

        if (this.girisBasarili(adSoyad, tcNo)) {
            System.out.println("Giriş başarılı, hoşgeldiniz");
            System.out.println("Nasıl Yardımcı Olabilirim");
            secenekSec();
        } else {
            System.out.println("Kullanıcı Bilgilerinizi Kontrol Ederek Tekrar Deneyin.");
            kullaniciGiris();
        }
    }


    void secenekSec() {
        System.out.println("1 - Randevu Al");
        System.out.println("2 - Randevuları Görüntüle");

        Scanner s = new Scanner(System.in);
        String secenek = s.nextLine();

        if (secenek.equals("1")) {
            randevuAl.randevuAl();
            secilenDoktor=secenek;
        }
        if(secenek.equals("2")){
            randevulariGoruntule.randevulariGoruntule("3");

        }
    }


    boolean girisBasarili(String adSoyad, String tcNo) {
        for (String[] veri : Iverigiris.girisVeri) {
            if (adSoyad.equals(veri[0]) && tcNo.equals(veri[1])) {
                return true;
            }
        }
        return false;
    }
}





