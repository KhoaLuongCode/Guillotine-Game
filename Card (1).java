public class Card {

    /**
     * Field that represent the name of the card
     */
    private String name;

    /**
     * Field that represent the group of the card
     */
    private String group;

    /**
     * Field that represent the points of the card
     */
    private String points;

    /**
     * Constructor that takes in a name, group and points
     * @param name name of the card
     * @param group group of the card
     * @param points points of the card
     */
    public Card(String name, String group, String points){
        this.name = name;
        this.group = group;
        this.points = points;
    }

    /**
     * Method that gets the name of the card
     * @return name of the card
     */
    public String getName(){
        return name;
    }

    /**
     * Method that sets the name of the card
     * @param name of the card
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Method that gets the group of the card
     * @return group of the card
     */
    public String getGroup(){
        return group;
    }

    /**
     * Method that sets the group of the card
     * @param group of the card
     */
    public void setGroup(String group){
        this.group = group;
    }

    /**
     * Method that gets the points of the card
     * @return points of the card
     */
    public String getPoints(){
        return points;
    }

    /**
     * Method that sets the points of the card
     * @param points of the card
     */
    public void setPoints(String points){
        this.points = points;
    }

}

  
  
  