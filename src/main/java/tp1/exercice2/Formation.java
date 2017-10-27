package tp1.exercice2;

/**
 * Created by SarahAllouche on 20/10/2017.
 */
public class Formation {

    private String formation;
    private String lieu;
    private String annee;
    private String rythme;

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setRythme(String rythme) {
        this.rythme = rythme;
    }

    public String getFormation() {
        return formation;
    }

    public String getLieu() {
        return lieu;
    }

    public String getAnnee() {
        return annee;
    }

    public String getRythme() {
        return rythme;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "formation='" + formation + '\'' +
                ", lieu='" + lieu + '\'' +
                ", annee='" + annee + '\'' +
                ", rythme='" + rythme + '\'' +
                '}';
    }
}
