import java.util.Scanner;

public class randevuAl extends karsilama implements Iverigiris {


    static void randevuAl() {

        System.out.println("Muayene Olmak İstediğiniz Doktoru Seçiniz");

        for (int i = 0; i < doktorİsimler.length; i++) {
            System.out.println(doktorİsimler[i]);
        }

        Scanner s = new Scanner(System.in);
        String doktorsecenek = s.nextLine();

        if (doktorsecenek.equals("1")) {
            for (int i = 0; i < doktor1RandevuGün.length; i++) {
                System.out.println(doktor1RandevuGün[i]);
            }
            Scanner randevuGunu = new Scanner(System.in);
            String randevuGunuSecenek1 = s.nextLine();

            if (randevuGunuSecenek1.equals("1")) {
                System.out.println("11 Mayıs 2023 Tarihli Randevu için Saat Seçiniz");
                String saatSecenek = s.nextLine();
                randevuKaydet("11 Mayıs 2023", "Eyüp Terzi", saatSecenek);
            } else if (randevuGunuSecenek1.equals("2")) {
                System.out.println("12 Mayıs 2023 Tarihli Randevu için Saat Seçiniz");
                String saatSecenek = s.nextLine();
                randevuKaydet("12 Mayıs 2023", "Eyüp Terzi", saatSecenek);
            } else if (randevuGunuSecenek1.equals("3")) {
                System.out.println("14 Mayıs 2023 Tarihli Randevu için Saat Seçiniz");
                String saatSecenek = s.nextLine();
                randevuKaydet("14 Mayıs 2023", "Eyüp Terzi", saatSecenek);
            }

        }

        if (doktorsecenek.equals("2")) {
            for (int i = 0; i < doktor2RandevuGün.length; i++) {
                System.out.println(doktor2RandevuGün[i]);
            }
            Scanner randevuGunu = new Scanner(System.in);
            String randevuGunuSecenek2 = s.nextLine();

            if (randevuGunuSecenek2.equals("1")) {
                System.out.println("12 Mayıs 2023 Tarihli Randevu için Saat Seçiniz");
                String saatSecenek = s.nextLine();
                randevuKaydet("12 Mayıs 2023", "Mustafa Ayaz", saatSecenek);
            } else if (randevuGunuSecenek2.equals("2")) {
                System.out.println("13 Mayıs 2023 Tarihli Randevu için Saat Seçiniz");
                String saatSecenek = s.nextLine();
                randevuKaydet("13 Mayıs 2023", "Mustafa Ayaz", saatSecenek);
            } else if (randevuGunuSecenek2.equals("3")) {
                System.out.println("18 Mayıs 2023 Tarihli Randevu için Saat Seçiniz");
                String saatSecenek = s.nextLine();
                randevuKaydet("18 Mayıs 2023", "Mustafa Ayaz", saatSecenek);
            }

        }
        karsilama k = new karsilama();

        k.secenekSec();

    }

    static void randevuKaydet(String tarih, String doktor, String saat) {
        for (int i = 0; i < randevular.length; i++) {
            if (randevular[i][0] == null) {
                randevular[i][0] = tarih;
                randevular[i][1] = doktor;
                randevular[i][2] = saat;
                System.out.println("Randevu başarıyla kaydedildi.");
                break;
            }
        }
    }



}






