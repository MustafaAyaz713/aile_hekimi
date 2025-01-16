import java.util.Scanner;

public class kayitOl extends karsilama implements Iverigiris {

    static void kayitOl()


    {
        System.out.println("İsminizi Giriniz:");
        Scanner s = new Scanner(System.in);
        System.out.println("T.C. Kimlik Numaranızı Giriniz:");
        Scanner t = new Scanner(System.in);

for(int i = 0; i<girisVeri.length; i++) {
    for (int j = 0; j < girisVeri.length; j++) {

        girisVeri[i][j] = s.nextLine();
        j++;
        girisVeri[i][j] = t.nextLine();
i++;
    }
}
        System.out.println("Kayıt Başarılı!");
}
    }







