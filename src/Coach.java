public class Coach extends Person {
    //Attributes
    private String expertise;
    private boolean role;

    //Constructor
    public Coach(String firstName, String lastName, boolean role) {
        //Pulls from parent class
        super(firstName, lastName);

        //New for this class
        setRole(role);
    }

    //Mutators
    public void setRole(boolean role) {this.role = role;}

    //Accessors
    public boolean getRole() {return role;}

    public String toString(){
        String s = "";

        s += super.getLastName() + ", " + super.getFirstName();
        if (getRole()) {
            s += "\n   Head Coach";
        }
        else {
            s += "\n   Assistant Coach";
        }
        return s;
    }
}