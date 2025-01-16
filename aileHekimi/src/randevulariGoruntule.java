public class randevulariGoruntule extends karsilama implements Iverigiris{
    static void randevulariGoruntule(String doktor) {
        System.out.println("Randevularınız:");
        for (int i = 0; i < randevular.length; i++) {
            if (randevular[i][1].equals(doktor)) {
                System.out.println("Tarih: " + randevular[i][0] + ", Saat: " + randevular[i][2]);
            }
        }
    }

}
