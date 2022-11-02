//imports
import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building{

  private ArrayList<String> residents;
  private Boolean hasDiningRoom;

  public House(String name, String address, int nFloors, ArrayList<String> residents, Boolean hDR) {

    super(name, address, nFloors);
    this.residents = residents;
    this.hasDiningRoom = hDR;
    
    System.out.println("You have built a house: 🏠");
  }
/*
 * Finds the number of residents in the house.
 * @return This houses number of residents.
 */
public int nResidents(){
  return this.residents.size();
}

/*
 * Checks if the house has a dining room.
 * @return Boolean for whether house has a dining room.
 */
public boolean hasDiningRoom(){
  return this.hasDiningRoom;
}

/*
 * Removes resident from the house.
 * @param residentName string residents name that moved out.
 */
public String moveOut(String residentName){
  int indexOfResident = this.residents.indexOf(residentName);
  this.residents.remove(indexOfResident);
  return residentName;
}

/*
 * Moves in resident.
 * @param residentName string residents name that moved in.
 */
public void moveIn(String residentName){
  this.residents.add(residentName);
}

/*
 * Determines if person is resident of a house.
 * @param person string person who is or isn't a resident
 */
public boolean isResident(String person){
  return this.residents.contains(person);
}

/*
 * Gives information about house
 */
public String toString(){
  String diningHall;
  if (hasDiningRoom() == true){
    diningHall = "a dining Hall.";
  } else {
    diningHall = "no dining Hall.";
  }
  return this.name + " house is a " + this.nFloors + "-story building located at " + this.address + " with " + nResidents() + " residents and " + diningHall;
}

  public static void main(String[] args) {
    ArrayList<String> cushingResidents = new ArrayList<String>();
    cushingResidents.add("Nathalie"); cushingResidents.add("Lara"); cushingResidents.add("Clare"); cushingResidents.add("Bena");

    House cushing = new House("Cushing", "180 elm street", 4, cushingResidents, true);

    System.out.println(cushing.toString());  

    System.out.println(cushing.isResident("Lara"));
    System.out.println(cushing.isResident("k"));
  }

}