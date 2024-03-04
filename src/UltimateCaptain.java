import java.util.Random;
import java.util.Scanner;

public class UltimateCaptain extends UltimatePlayer {

    private boolean type;

    //Constructor
    public UltimateCaptain(String firstName, String lastName, int jerseyNumber, String position) {
        //Wait until we make mutators - make interior last.
        super(firstName, lastName, jerseyNumber, position);
        setType(type);
    }

    //Mutators
    public void setType (boolean type) {this.type = type;}

    //Accessors
    public boolean getType (boolean type) {return type;}

    public String toString(){
        String output;

        if (type) {
            output = "Offense";
        } else {
            output = "Defense";
        }

        return super.toString() + "   Type: " + output;
    }

    public int throwDisc (int pow) {
        pow = pow * 5;

        return pow;
    }
}