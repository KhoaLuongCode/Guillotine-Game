import java.util.Arrays;
import java.util.NoSuchElementException;
import java.lang.Math;

/**
 * A class to represent a linked list of nodes.
 */
public class LinkedList<T> {
    /**
     * the first node of the list, or null if the list is empty
     */
    private LLNode<T> firstNode;

    /**
     * 40 card fields that represent 40 cards store in the cardList
     */
    private static Card c1 = new Card("King Louis XIV", "Royal", "5");
    private static Card c2 = new Card("Marie Antoinette", "Royal", "5");
    private static Card c3 = new Card("Regent", "Royal", "4");
    private static Card c4 = new Card("Duke", "Royal", "3");
    private static Card c5 = new Card("Baron", "Royal", "3");
    private static Card c6 = new Card("Count", "Royal", "*");
    private static Card c7 = new Card("Countess", "Royal", "*");
    private static Card c8 = new Card("Lord", "Royal", "*");
    private static Card c9 = new Card("Lady", "Royal", "*");
    private static Card c10 = new Card("Cardinal", "Church", "5");
    private static Card c11 = new Card("Archbishop", "Church", "4");
    private static Card c12 = new Card("Nun", "Church", "3");
    private static Card c13 = new Card("Bishop", "Church", "2");
    private static Card c14 = new Card("Priest", "Church", "1");
    private static Card c15 = new Card("Priest", "Church", "1");
    private static Card c16 = new Card("Heretic", "Church", "*");
    private static Card c17 = new Card("Governor", "Civic", "4");
    private static Card c18 = new Card("Mayor", "Civic", "3");
    private static Card c19 = new Card("Councilman", "Civic", "3");
    private static Card c20 = new Card("Judge", "Civic", "2");
    private static Card c21 = new Card("Judge", "Civic", "2");
    private static Card c22 = new Card("Tax Collector", "Civic", "*");
    private static Card c23 = new Card("Sheriff", "Civic", "1");
    private static Card c24 = new Card("Sheriff", "Civic", "1");
    private static Card c25 = new Card("Palace Guard", "Military", "*");
    private static Card c26 = new Card("Palace Guard", "Military", "*");
    private static Card c27 = new Card("Palace Guard", "Military", "*");
    private static Card c28 = new Card("Palace Guard", "Military", "*");
    private static Card c29 = new Card("Palace Guard", "Military", "*");
    private static Card c30 = new Card("General", "Military", "4");
    private static Card c31 = new Card("Colonel", "Military", "3");
    private static Card c32 = new Card("Captain", "Military", "2");
    private static Card c33 = new Card("Lieutenant", "Military", "1");
    private static Card c34 = new Card("Lieutenant", "Military", "1");
    private static Card c35 = new Card("Tragic Figure", "Commoner", "*");
    private static Card c36 = new Card("Heroic Figure", "Commoner", "-3");
    private static Card c37 = new Card("Student", "Commoner", "-1");
    private static Card c38 = new Card("Student", "Commoner", "-1");
    private static Card c39 = new Card("Student", "Commoner", "-1");
    private static Card c40 = new Card("Student", "Commoner", "-1");


    /**
     * A cardList array that contains 40 cards that was created
     */
    public static Card[] cardList = new Card[]{c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34, c35, c36, c37, c38, c39, c40};

    /**
     * Creates an initially empty linked list
     */
    public LinkedList() {
        firstNode = null;
    }

    /**
     * Returns the first node.
     */
    protected LLNode<T> getFirstNode() {
        return firstNode;
    }

    /**
     * Changes the front node.
     *
     * @param node the node that will be the first node of the new linked list
     */
    protected void setFirstNode(LLNode<T> node) {
        this.firstNode = node;
    }

    /**
     * Return whether the list is empty
     *
     * @return true if the list is empty
     */
    public boolean isEmpty() {
        return (getFirstNode() == null);
    }

    /**
     * Add an element to the front of the linked list
     */
    public void addToFront(T element) {
        setFirstNode(new LLNode<T>(element, getFirstNode()));
    }

    /**
     * Removes and returns the element at the front of the linked list
     *
     * @return the element removed from the front of the linked list
     * @throws NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        if (isEmpty())
            throw new NoSuchElementException();
        else {
            T save = getFirstNode().getElement();
            setFirstNode(getFirstNode().getNext());
            return save;
        }
    }

    /**
     * Returns the length of the linked list
     *
     * @return the number of nodes in the list
     */
    public int length() {
        int count = 0;
        LLNode<T> nodeptr = getFirstNode();
        while (nodeptr != null) {
            count++;
            nodeptr = nodeptr.getNext();
        }
        return count;
    }

    /**
     * Method that adds an element to the end of the linked list
     *
     * @param element the element to insert at the end
     */
    public void addToEnd(T element) {
        if (isEmpty())
            addToFront(element);
        else {
            LLNode<T> nodeptr = getFirstNode();
            while (nodeptr.getNext() != null)
                nodeptr = nodeptr.getNext();
            nodeptr.setNext(new LLNode<T>(element, null));
        }
    }

    /**
     * Method that moves the first node of the linked list back n places
     * @param n the number of places the user wants the node to move back
     */
    public void moveBack(int n) {

        // if length is less than n then does nothing
        if (length() < n) {
            ;

        }
        else {
            // create three pointers nodeptr temp1 and temp2
            LLNode<T> nodeptr = getFirstNode();
            LLNode<T> temp = null;
            LLNode<T> temp2 = null;

            // loop through until n
            for (int i = 0; i < n; i++) {
                // increment nodeptr
                nodeptr = nodeptr.getNext();
                // in the location that we needs to move back
                if (i == n - 1) {
                    // temp stores the nodeptr.getNext(), temp2 stores next node of first node because both will be lost
                    temp = nodeptr.getNext();
                    temp2 = getFirstNode().getNext();
                    // set next of nodeptr to first node, now original nodeptr.getNext() is gone
                    nodeptr.setNext(getFirstNode());
                    // connect to temp
                    nodeptr.getNext().setNext(temp);
                    // connect to temp2
                    setFirstNode(temp2);
                }
            }
        }

    }

    /**
     * Method that moves the first node of the linked list to the last node of the linked list. The second node now becomes the first node
     */
    public void moveFirstToLast() {

        // creates a nodeptr
        LLNode<T> nodeptr = getFirstNode();

        // loops through the whole linked list until the last node
        while (nodeptr.getNext() != null) {
            nodeptr = nodeptr.getNext();
        }
        // set the last node to first node
        nodeptr.setNext(getFirstNode());
        // first node now becomes next() of getFirstNode()
        firstNode = getFirstNode().getNext();
        // because it connects the whole first node, so nodeptr.getNext().setNext to null to break
        nodeptr.getNext().setNext(null);
    }

    /**
     * Method that moves the last node of the linked list to the first node of the linked list.
     */
    public void moveLastToFirst() {

        // one nodeptr and one temp that stores the first node because the first node will be lost
        LLNode<T> nodeptr1 = getFirstNode();
        LLNode<T> temp = getFirstNode();

        // address case when there is only one node or empty list
        if (nodeptr1 == null || nodeptr1.getNext() == null) {
            ;
        }
        else {
            // find second last node
            while (nodeptr1.getNext().getNext() != null) {
                nodeptr1 = nodeptr1.getNext();
            }
            // set first node to last node
            setFirstNode(nodeptr1.getNext());
            nodeptr1.setNext(null);
            // connect first node with the rest
            firstNode.setNext(temp);

        }
    }

    /**
     * Method that reverses the whole linked list
     */
    public void reverseList() {

        // three nodeptrs previous, current and next. set previous to null, current equals getFirstNode(), next = current.getNext()
        LLNode<T> previous = null;
        LLNode<T> current = getFirstNode();

        // loop through linked list
        while (current != null) {
            // traverse the list and flip the cards
            LLNode<T> next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        setFirstNode(previous);
    }

    /**
     * Method that reverses the first k nodes of the linked list. The rest is kept the same
     */
    public void reverseFirstK(int k) {

        if (length() < k) {
            ;
        }
        else {
            // method to keep count 
            int count = 1;
            LLNode<T> temp = getFirstNode();

            // loop until breakpoint
            while (count < k) {
                temp = temp.getNext();
                count++;
            }
            
            // break the node so can reverse 
            LLNode breakPoint = temp.getNext();
            temp.setNext(null);

            // reverse the node 
            LLNode<T> previous = null;
            LLNode<T> current = getFirstNode();
            while (current != null) {
                LLNode<T> next = current.getNext();
                current.setNext(previous);
                previous = current;
                current = next;
            }

            // connect two linked list, one that has been reversed and one still kept the same
            setFirstNode(previous);
            current = getFirstNode();
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(breakPoint);
        }

    }

    /**
     * A helper that calculate points for the linked list
     * @return the score that the player has
     */
    public int calculatePoints(){

        // variable to store the points
        int scorePlayer = 0;
        // variable to count the heretic church, tax collector, palace guards, and commoner
        int countHereticChurch = 0;
        int countTaxCollector = 0;
        int countPalaceGurads = 0;
        int countCommoner = 0;
        // boolean variable to look for countorcountess, or lordorlady
        boolean collectCountorCountess = false;
        boolean collectLordorLoday = false;

        // nodeptr to move back down the linked list
        LLNode<T> nodeptr = getFirstNode();

        // because the getElement() return T element but not a card => typecast to card
        if (nodeptr.getElement() instanceof Card){

            // typecast nodeptr.getElement() to a card
            Card z;

            // loop through the linked list
            while (nodeptr != null){
                z = (Card) (nodeptr.getElement());
                // if encounter then increment
                if (z.getGroup().equals("Church")){
                    countHereticChurch++;
                }
                if (z.getGroup().equals("Civic")){
                    countTaxCollector++;
                }
                if (z.getName().equals("Palace Guard")){
                    countPalaceGurads++;
                }
                if (z.getGroup().equals("Commoner")){
                    countCommoner++;
                }
                // move up the linked list of card and type cast
                nodeptr = nodeptr.getNext();
            }
            // reset the nodeptr to the first node and type cast
            nodeptr = getFirstNode();
            Card x;

            // loop through the linked list
            while (nodeptr != null){
                x = (Card) (nodeptr.getElement());
                // if getPoints() of a card does not equal * => add to the score of player
                if (!x.getPoints().equals("*")){
                    scorePlayer = scorePlayer + Integer.parseInt(x.getPoints());
                }
                // CONDITIONS 1: Count or Countess
                else if (!collectCountorCountess && (x.getName().equals("Count") || x.getName().equals("Countess"))){
                    collectCountorCountess = true;
                    scorePlayer = scorePlayer + 2;
                }
                else if (collectCountorCountess && (x.getName().equals("Count") || x.getName().equals("Countess"))){
                    scorePlayer = scorePlayer + 6;
                }
                else if (!collectLordorLoday && (x.getName().equals("Lord") || x.getName().equals("Lady"))){
                    collectLordorLoday = true;
                    scorePlayer = scorePlayer + 2;
                }
                else if (collectLordorLoday && (x.getName().equals("Lord") || x.getName().equals("Lady"))){
                    scorePlayer = scorePlayer + 6;
                }
                // CONDITIONS 2: Heretic Church
                else if (x.getName().equals("Heretic")){
                    scorePlayer = scorePlayer + countHereticChurch;
                }
                // CONDITIONS 3: Tax Collector
                else if (x.getName().equals("Tax Collector")){
                    scorePlayer = scorePlayer + countTaxCollector;
                }
                // CONDItiONS 4: Palace Guard
                else if (x.getName().equals("Palace Guard")){
                    scorePlayer = scorePlayer + countPalaceGurads;
                }
                // CONDITIONS 5: Traffic Figure
                else if (x.getName().equals("Trafic Figure")){
                    scorePlayer = scorePlayer - countCommoner;
                }
                nodeptr = nodeptr.getNext();
            }
        }
        return scorePlayer;
    }

    /**
     * Method that random card in the 40 card linked list.
     * @param num number of cards the user want to random
     * @return a new card list that has been randomized
     */
    public static LinkedList<Card> randomCard(int num){

        // create a new linekd list of card
        LinkedList<Card> newCardList = new LinkedList<Card>();

        // loop through the card list of 40 cards
        for (int i = cardList.length - 1; i >= 0; i--){
            // random position in card list by using math.random() that returns a number between 0 and 1 => multiply with index and typecast to int
            int randomInArray = (int) (Math.random() * (i+1));
            Card temp = cardList[i];
            cardList[i] = cardList[randomInArray];
            cardList[randomInArray] = temp;
        }
        // transfer the old card list that has been randomized onto a new card list
        for (int i = 0; i < num; i++) {
            newCardList.addToFront(cardList[i]);
        }
        return newCardList;
    }
}

