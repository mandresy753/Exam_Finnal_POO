import java.time.Instant;

public class PayementAnnuel extends Payement {
    private int annee;

    public PayementAnnuel(int id, double montant, Instant datePayement, int annee) {
        super(id, montant, datePayement);
        this.annee = annee;
    }

    public int getannee() {
        return annee;
    }
}
