
import java.time.Instant;

public class Frais {
    public enum Statut {
        IN_PROGRESS, PAID, LATE, OVERPAID
    }

    private int id;
    private String label;
    private float montantAPayer;
    private Instant deadline;
    private Statut statut;

    public Frais(int id, String label, float montantAPayer, Instant deadline) {
        this.id = id;
        this.label = label;
        this.montantAPayer = montantAPayer;
        this.deadline = deadline;
        updateStatut();
    }

    public void updateStatut() {
        if (deadline.isBefore(Instant.now())) {
            this.statut = Statut.LATE;
        } else if (deadline.isAfter(Instant.now())) {
            this.statut = Statut.IN_PROGRESS;
        } else {
            this.statut = Statut.PAID;
        }
    }

    public Statut getStatut() {return statut;}
}
