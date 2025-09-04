import java.time.Instant;
import java.util.List;
import java.util.ArrayList;

public class Etudiants {
    private int id;
    private String nom;
    private String prenom;
    private Instant dateEntree;
    private List<Groupe> historiqueGroupe;

    public Etudiants(int id, String nom, String prenom, Instant dateEntree) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntree = dateEntree;
        this.historiqueGroupe = new ArrayList<>();
    }

    public void ajouterGroupe(Groupe groupe) {
        historiqueGroupe.add(groupe);
    }

    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public Instant getDateEntree() { return dateEntree; }
    public List<Groupe> getHistoriqueGroupe() { return historiqueGroupe; }
}
