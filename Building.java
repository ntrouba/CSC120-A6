//imports
import java.util.ArrayList;
import java.util.Hashtable;

public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;
    
    /*
     * Creates building
     * @param String name of building
     * @param String address of building
     * @param int nFloors, number of floors the building has
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }
    /*
     * Gets name
     */
    public String getName() {
        return this.name;
    }
    /*
     * Gets address
     */
    public String getAddress() {
        return this.address;
    }
    /*
     * Gets number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }
    /*
     * Gets string
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);

        //Constructing a house
        ArrayList<String> residents = new ArrayList<String>();
        residents.add("Liberty"); residents.add("Maryam"); residents.add("Emma"); residents.add("Ingrid");

        Building king = new House("King", "180 elm", 4, residents, true);

        System.out.println(king.toString());

        //Constructs Library
        Hashtable<String, Boolean> neilsonCollection = new Hashtable<String, Boolean> ();
        neilsonCollection.put("Grapes of Wrath", true); neilsonCollection.put("Warrior Cats", false); neilsonCollection.put("The Secret Chamber", true);
        Library neilson = new Library("Neilson", "chapin way", 4, neilsonCollection);
        System.out.println(neilson.toString());
    }

}