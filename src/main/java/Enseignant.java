import java.util.ArrayList;

public class Enseignant {
    private int nombreCours ;
    private ArrayList<String > cours;
    private  final int max_cours=10;

    public Enseignant(int nombreCours, ArrayList<String> cours) {
        this.nombreCours = nombreCours;
        this.cours = cours;
    }

    public Enseignant() {
        this.cours = new ArrayList<>();
        this.nombreCours = 0;
    }

    public boolean ajouterCours(String cour){
        if (cours.size()<max_cours){
            cours.add(cour);
            nombreCours++;
            return true;
        }
        return false;
    }
    public boolean eneleverCours(String cour){
        if (cours.size()<max_cours){
            cours.remove(cour);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "nombreCours=" + nombreCours +
                ", cours=" + cours +
                ", max_cours=" + max_cours +
                '}';
    }
}
