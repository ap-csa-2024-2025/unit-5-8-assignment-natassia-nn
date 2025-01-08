public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;
  //static means belongs to the whole class

  // Non-default Dog constructor

  // Default Dog constructor

  // Setters - instance variables only
  public void setName(String iName)
  { name = iName;}

  public void setID(int ID)
  { this.ID = ID; }
  // Getters - instance variables only
  public String getName()
  { return name; }

  public int getID()
  { return ID; }
  // method getNumDogs
}
