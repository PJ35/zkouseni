import java.util.ArrayList;
import java.util.List;

public class SeznamNabytku {
    private List<Nabytek> seznamNabytku = new ArrayList<>();

    public SeznamNabytku(List<Nabytek> seznamNabytku) {
        setSeznamNabytku(seznamNabytku);
    }

    public List<Nabytek> getSeznamNabytku() {
        return seznamNabytku;
    }

    public void setSeznamNabytku(List<Nabytek> seznamNabytku) {
        this.seznamNabytku = seznamNabytku;
    }

    public void addSeznamNabytku(Nabytek nabytek) {
        this.seznamNabytku.add(nabytek);
    }

    public void remSeznamNabytku(Nabytek nabytek) {
        this.seznamNabytku.remove(nabytek);
    }

    public Double zjistiCelkovouHmotnost() {
        Double celkovaHmotnost = Double.valueOf(0);
        for (Nabytek nabytek : seznamNabytku) {
            celkovaHmotnost += nabytek.getHmnotnost();
        }
        return celkovaHmotnost;
    }
}
