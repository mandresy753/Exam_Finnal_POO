import java.time.Instant;

public class Payement {
    private int id;
    private double montant;
    private Instant datePayement;

    public Payement(int id, double montant, Instant datePayement) {
        this.id = id;
        this.montant = montant;
        this.datePayement = datePayement;
    }

    public double getmontant() {return montant;}
    public Instant getdatePayement() {return datePayement;}


}

