import java.util.List;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Uye uyeler = new Uye();
        uyeler.uyeEkle();

        Uye yeniUye = (Uye) uyeler.clone();
        Uye yeniUye2 = (Uye) uyeler.clone();
        List<String> list = yeniUye.getUyeListesi();
        list.add("Ayşe");
        List<String> list1 = yeniUye2.getUyeListesi();
        list1.remove("Ahmet");
        System.out.println("uyeler List: " + uyeler.getUyeListesi());
        System.out.println("yeniUye List: " + list);
        System.out.println("yeniUye2 List: " + list1);

    }
}
