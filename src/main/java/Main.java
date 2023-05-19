import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Etudiant e1=new Etudiant();
        e1.ajouterCoursNote("java",10.0);
        e1.ajouterCoursNote("php",12.0);
        e1.ajouterCoursNote("sid",14.0);
        e1.ajouterCoursNote("sql",12.0);
        e1.afficherNotes();
        System.out.println("Moyenne " + e1.noteMoyenne());

        Enseignant t1=new Enseignant();
        System.out.println(t1);

        ArrayList<String> descours=new ArrayList<>();
        descours.add("java");
        descours.add("php");
        descours.add("sid");
        descours.add("c++");

        for (int i=0;i<descours.size();i++){
            if(t1.ajouterCours(descours.get(i))){
                System.out.println(descours.get(i)+" ajouter");
            }
            else System.out.println(descours.get(i)+" deja present");
        }

        System.out.println(t1);

        for (int i=0;i<descours.size();i++){
            if(t1.eneleverCours(descours.get(i))){
                System.out.println(descours.get(i)+" enolover");
            }
            else System.out.println(descours.get(i)+" deja present");
        }

    }
}
