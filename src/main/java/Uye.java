import java.util.ArrayList;
import java.util.List;

public class Uye implements Cloneable {

    private List<String> uyeListesi;

    public Uye() {
        uyeListesi = new ArrayList<String>();
    }

    public Uye(List<String> liste) {
        this.uyeListesi = liste;
    }

    public void uyeEkle() {

        uyeListesi.add("Burak");
        uyeListesi.add("Ahmet");
        uyeListesi.add("Mehmet");
    }

    public List<String> getUyeListesi() {
        return uyeListesi;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> uyeListesi = new ArrayList<String>();
        for (String s : this.getUyeListesi()) {
            uyeListesi.add(s);
        }
        return new Uye(uyeListesi);
    }
}