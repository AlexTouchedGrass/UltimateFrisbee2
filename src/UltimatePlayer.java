import java.util.Random;
import java.util.Scanner;

public class UltimatePlayer extends Person {
    //Attributes
    private int jerseyNumber; //Jersey number for the instance
    private static int jerseyNumberCounter; //Keeps track of how many jerseys have been assigned
    private String position; //Handler or Cutter

    //Constructors
    public UltimatePlayer(String firstName, String lastName, int jerseyNumber, String position) {
        //Wait until we make mutators - make interior last.
        super(firstName, lastName);
        setJerseyNumber(jerseyNumber);
        setPosition(position);
    }

    //Mutators (Setters)
    public void setJerseyNumber(int jerseyNumber){
        Random rand = new Random(); //This was unnecessary but I wanted to add it.
        boolean done = false;

        if (jerseyNumber >= 1 && jerseyNumber <= 100) {
            this.jerseyNumber = jerseyNumber;
        } else {
            while (!done) {
                this.jerseyNumber = rand.nextInt(100);
                if (jerseyNumber > 0) {
                    done = true;
                }
            }
        }
    }

    //Simply counts up 1 time each time Jersey Number is called. (CALL WITH JERSEY NUMBER)
    public static int setJerseyNumberCounter(int jerseyNumberCounter) {
        jerseyNumberCounter++;
        return jerseyNumberCounter;
    }

    public void setPosition(String position) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;

        //While loop is to keep the user in the process of choosing Position until they give a valid response.
        while (!done) {
            position = scan.nextLine();
            if (position.equalsIgnoreCase("Cutter") || position.equalsIgnoreCase("C")) {
                this.position = position;
            } else if (position.equalsIgnoreCase("Handler") || position.equalsIgnoreCase("H")) {
                this.position = position;
            } else {
                this.position = "Handler";
            }
        }
    }

    //Accessors
    public int getJerseyNumber(){return jerseyNumber;}

    public int getJerseyNumberCounter(){return jerseyNumberCounter;}

    public String getPosition() {return getPosition();}

    public String toString(){
        return super.toString() + "\n   Jersey #: " + getJerseyNumber() + "\n   Position: " + getPosition();  //Continued on next line.
    }

    public int throwDisc (int pow) {
        pow = pow * 4;

        return pow;
    }
}