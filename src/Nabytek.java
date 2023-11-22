import java.math.BigDecimal;

public class Nabytek {
    private BigDecimal hmnotnost;

    public Nabytek(BigDecimal hmnotnost) {
        this.hmnotnost = hmnotnost;
    }

    public BigDecimal getHmnotnost() {
        return hmnotnost;
    }

    public void setHmnotnost(BigDecimal hmnotnost) {
        this.hmnotnost = hmnotnost;
    }
}
