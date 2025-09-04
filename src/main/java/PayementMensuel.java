import java.time.Instant;

public class PayementMensuel extends Payement {
    private int mois;
    private int annee;

    public PayementMensuel(int id, double montant, Instant datePayement, int mois, int annee) {
        super(id, montant, datePayement);
        this.mois = mois;
        this.annee = annee;
    }

    public int getMois() {return mois;}
    public int getAnnee() {return annee;}
}

