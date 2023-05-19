import java.util.ArrayList;

public class Etudiant extends Personne {
    private int nombreCours;
    private ArrayList<Double> notes;
    private ArrayList<String> cours;
    private final int  max_cours=15;

    public Etudiant(String nom, String adresse, int nombreCours, ArrayList<Double> notes, ArrayList<String > cours) {
        super(nom, adresse);
        this.nombreCours = nombreCours;
        this.notes = notes;
        this.cours = cours;
    }

    public Etudiant(int nombreCours, ArrayList<Double> notes, ArrayList<String > cours) {
        this.nombreCours = nombreCours;
        this.notes = notes;
        this.cours = cours;
    }

    public Etudiant() {
        this.cours= new ArrayList<>();
        this.notes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nombreCours=" + nombreCours +
                ", notes=" + notes +
                ", cours=" + cours +
                ", max_cours=" + max_cours +
                '}';
    }
    public boolean ajouterCoursNote(String cour,Double note){
        if(cours.size() < max_cours){
            cours.add(cour);
            notes.add(note);
            nombreCours++;
            return true;
        }
        return false;
    }
    public void afficherNotes(){
        for (int i=0;i<notes.size();i++){
            //for (int j=0;j<cours.size();j++){
                System.out.println("cours "+(i+1)+" : "+cours.get(i)+" notes : "+notes.get(i));
        }//

    }
    public double noteMoyenne(){
        double m=0;
        for (int i=0;i<notes.size();i++){
            m+=notes.get(i);
        }
        return m/notes.size();
    }
}
