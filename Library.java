//imports
import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors, Hashtable<String, Boolean> collection){

    super(name, address, nFloors);
    this.collection = collection;
    
    System.out.println("You have built a library: 📖");
    
    }

  /*
   * Adds title to collection hashTable
   * @param title name of book
   */
  public void addTitle(String title){
    this.collection.put(title, true);
  }

  /*
   * Removes title from collection hashTable
   * @param title name of book
   */
  public void removeTitle(String title){
    this.collection.remove(title);
  }

  /*
   * Checks out a book by changing status of book to false or printing that the book is already checked out.
   * @param title name of book 
   */
  public void checkOut(String title){
    if (containsTitle(title) == true){
      this.collection.replace(title, false);
    } else{
      System.out.println("This book has already been checked out.");
    }

  }

  /*
   * Returns the book by changing the boolean value to true if the book is in the collection
   * @param title name of the book.
   */
  public void returnBook(String title){
    if (this.collection.containsKey(title)){
      this.collection.replace(title, true);
    } else {
      System.out.println("Book is not in the collection");
    }

  }


  /*
   * Returns true if the title appears as a key in the Libary's collection, false otherwise.
   * @param title name of book
   * @return boolean whether or not the book is in the hashTable
   */
  public boolean containsTitle(String title){
    return this.collection.containsKey(title);

  }

  /*
   * Returns true if the title is currently available, false otherwise.
   * @param title name of book
   * @return booleans for if book is availible
   */
  public boolean isAvailable(String title){
    try{
      if(this.collection.get(title) == true){
        return this.collection.get(title);
  
      } else {
        return this.collection.get(title);
  
      }
    } catch (NullPointerException e) {
			System.out.println("NullPointerException thrown! This book cannot be found in the collection.");
      return false;
		}

  }

/*
 * prints out the entire collection in an easy-to-read way (including checkout status)
 */
  public void printCollection(){
    // Iterating over keys only
    int count = 0;
    String availible;

    for (String key : this.collection.keySet()) {
      count += 1;
      if (isAvailable(key) == true){
        availible = "availible.";

      } else {
        availible = "not availible.";

      }
      System.out.println(count + ".)" + key + " is " + availible);
     
    }

  }

  /*
   * Creates String to describe the library
   * @return String describing the library
   */
  public String toString(){
    return this.name + " is a " + this.nFloors + "-story Library located at " + this.address + ". The following is the collection of books and there avalibility status: " + this.collection; 

  }
   
    public static void main(String[] args) {
      Hashtable<String, Boolean> neilsonCollection = new Hashtable<String, Boolean> ();
      neilsonCollection.put("Grapes of Wrath", true); neilsonCollection.put("Warrior Cats", false); neilsonCollection.put("The Secret Chamber", true);

      Library neilson = new Library("Neilson", "Chapin Way", 4, neilsonCollection);

      System.out.println(neilson.toString());
      neilson.addTitle("War and Peace");
      System.out.println(neilson.toString());
      neilson.removeTitle("War and Peace");
      System.out.println(neilson.toString());
      System.out.println(neilson.containsTitle("The Secret Chamber"));
      System.out.println(neilson.containsTitle("Th"));
      // neilson.checkOut("The Secret Chamber");
      // neilson.checkOut("The Secret Chmber");
      System.out.println(neilson.collection);
      System.out.println("-----------");
      System.out.println(neilson.isAvailable("The Secret Chamber"));
      System.out.println(neilson.isAvailable("j"));
      neilson.printCollection();

    }
  
  }