package tp1.exercice2;

/**
 * Created by SarahAllouche on 20/10/2017.
 */
public class SubmitRequest {
    private Person person;
    private Formation formation;

    public SubmitRequest(){
        super();
    }

    public Person getPerson(){
        return person;
    }
    public void setPerson(Person person){
        this.person=person;
    }

    public Formation getFormation(){
        return formation;

    }
    public void setFormation(Formation formation){
        this.formation=formation;
    }

    @Override
    public String toString() {
        return "SubmitRequest{" +
                "person=" + person.toString() +
                ", formation=" + formation.toString() +
                '}';
    }
}
