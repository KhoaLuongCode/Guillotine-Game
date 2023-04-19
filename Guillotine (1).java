import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.Node;


public class Guillotine extends Application   {

    /**
     * Fields that represent 20 buttons
     */
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;

    /**
     * Creates the GUI with buttons that do cool things
     * @param primaryStage the main window
     */
    public void start(Stage primaryStage) {
        /**
         * Sets of buttons for Player 1
         */
        button1 = new Button("Move Front Back 4");
        button2 = new Button("Move Front Back 3");
        button3 = new Button("Move Front Back 2");
        button4 = new Button("Move Front Back 1");
        button5 = new Button("Move Front to End");
        button6 = new Button("Move Last Person to Front");
        button7 = new Button("Reverse Line");
        button8 = new Button("Reverse First 5");
        button9 = new Button("Skip Turn");
        button10 = new Button("Take Front Person");

        /**
         * Sets of buttons for player 2
         */
        button11 = new Button("Move Front Back 4");
        button12 = new Button("Move Front Back 3");
        button13 = new Button("Move Front Back 2");
        button14 = new Button("Move Front Back 1");
        button15 = new Button("Move Front to End");
        button16 = new Button("Move Last Person to Front");
        button17 = new Button("Reverse Line");
        button18 = new Button("Reverse First 5");
        button19 = new Button("Skip Turn");
        button20 = new Button("Take Front Person");

        /**
         * Create a newCardLinkedList that generate 20 random cards
         */
        LinkedList<Card> newCardLinkedList = LinkedList.randomCard(20);
        VBox manyCards = changeLinkedList(newCardLinkedList);
        manyCards.setSpacing(5);

        /**
         * Create a vbox for player 1
         */
        Label labelPlayer1 = new Label("Player 1");
        VBox player1Box = new VBox();
        player1Box.getChildren().add(labelPlayer1);
        player1Box.getChildren().add(button1);
        player1Box.getChildren().add(button2);
        player1Box.getChildren().add(button3);
        player1Box.getChildren().add(button4);
        player1Box.getChildren().add(button5);
        player1Box.getChildren().add(button6);
        player1Box.getChildren().add(button7);
        player1Box.getChildren().add(button8);
        player1Box.getChildren().add(button9);
        player1Box.getChildren().add(button10);
        player1Box.setSpacing(5);

        /**
         * Create a vbox for player 2
         */
        Label labelPlayer2 = new Label("Player 2");
        VBox player2Box = new VBox();
        player2Box.getChildren().add(labelPlayer2);
        player2Box.getChildren().add(button11);
        player2Box.getChildren().add(button12);
        player2Box.getChildren().add(button13);
        player2Box.getChildren().add(button14);
        player2Box.getChildren().add(button15);
        player2Box.getChildren().add(button16);
        player2Box.getChildren().add(button17);
        player2Box.getChildren().add(button18);
        player2Box.getChildren().add(button19);
        player2Box.getChildren().add(button20);
        player2Box.setSpacing(5);

        /**
         * Create a scrollPane Center for three vbox
         */
        ScrollPane scrollPaneCenter = new ScrollPane();
        scrollPaneCenter.setContent(manyCards);
        ScrollPane scrollPaneLeft = new ScrollPane();
        scrollPaneLeft.setContent(player1Box);
        ScrollPane scrollPaneRight = new ScrollPane();
        scrollPaneRight.setContent(player2Box);

        /**
         * Create a label called people collected and add label to vbox
         */
        Label label1 = new Label("People Collected: ");
        Label label2 = new Label("People Collected: ");
        player1Box.getChildren().add(label1);
        player2Box.getChildren().add(label2);

        /**
         * Create a borderpane layout
         */
        BorderPane layout = new BorderPane();

        /**
         * Create two label score for each of the player
         */
        Label labelPlayer1Score = new Label("Score: 0");
        player1Box.getChildren().add(labelPlayer1Score);
        Label labelPlayer2Score = new Label("Score: 0");
        player2Box.getChildren().add(labelPlayer2Score);

        /**
         * Create two new linked List of card that is going to be added into the vbox everytime the button 10/20 is clicked
         */
        LinkedList<Card> resultingCardLinkedList1 = new LinkedList<Card>();
        LinkedList<Card> resultingCardLinkedList2 = new LinkedList<Card>();

        /**
         * Create two box action everytime button 10/20 is clicked and add those box action into 2 player box
         */
        VBox boxAction1 = new VBox();
        VBox boxAction2 = new VBox();
        player1Box.getChildren().add(boxAction1);
        player2Box.getChildren().add(boxAction2);


        /**
         * List of setOnAction buttons that handle when the button is clicked
         */
        button1.setOnAction(e -> {
            newCardLinkedList.moveBack(4);
            button1.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button2.setOnAction(e -> {
            newCardLinkedList.moveBack(3);
            button2.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button3.setOnAction(e -> {
            newCardLinkedList.moveBack(2);
            button3.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button4.setOnAction(e -> {
            newCardLinkedList.moveBack(1);
            button4.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button5.setOnAction(e -> {
            newCardLinkedList.moveFirstToLast();
            button5.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button6.setOnAction(e -> {
            newCardLinkedList.moveLastToFirst();
            button6.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button7.setOnAction(e -> {
            newCardLinkedList.reverseList();
            button7.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button8.setOnAction(e -> {
            newCardLinkedList.reverseFirstK(5);
            button8.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button9.setOnAction(e -> {
            button1.setDisable(true);
            button2.setDisable(true);
            button3.setDisable(true);
            button4.setDisable(true);
            button5.setDisable(true);
            button6.setDisable(true);
            button7.setDisable(true);
            button8.setDisable(true);
            button9.setDisable(true);
            button10.setDisable(true);

            button11.setDisable(false);
            button12.setDisable(false);
            button13.setDisable(false);
            button14.setDisable(false);
            button15.setDisable(false);
            button16.setDisable(false);
            button17.setDisable(false);
            button18.setDisable(false);
            button19.setDisable(false);
            button20.setDisable(false);
        });

        button10.setOnAction(e -> {
            LLNode<Card> newCard1 = newCardLinkedList.getFirstNode();
            Card save = newCardLinkedList.removeFromFront();
            resultingCardLinkedList1.addToEnd(save);
            VBox newBox = changeLinkedList(resultingCardLinkedList1);
            player1Box.getChildren().remove(13);
            player1Box.getChildren().add(newBox);
            VBox newManyCards = changeLinkedList(newCardLinkedList);
            newManyCards.setSpacing(5);
            layout.setCenter(newManyCards);
            labelPlayer1Score.setText("Score: " + resultingCardLinkedList1.calculatePoints());
        });

        button11.setOnAction(e -> {
            newCardLinkedList.moveBack(4);
            button11.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button12.setOnAction(e -> {
            newCardLinkedList.moveBack(3);
            button12.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button13.setOnAction(e -> {
            newCardLinkedList.moveBack(2);
            button13.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button14.setOnAction(e -> {
            newCardLinkedList.moveBack(1);
            button14.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button15.setOnAction(e -> {
            newCardLinkedList.moveFirstToLast();
            button15.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button16.setOnAction(e -> {
            newCardLinkedList.moveLastToFirst();
            button16.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button17.setOnAction(e -> {
            newCardLinkedList.reverseList();
            button17.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button18.setOnAction(e -> {
            newCardLinkedList.reverseFirstK(5);
            button18.setDisable(true);
            VBox updatedCardList = changeLinkedList(newCardLinkedList);
            updatedCardList.setSpacing(5);
            layout.setCenter(updatedCardList);
        });

        button19.setOnAction(e -> {
            button1.setDisable(false);
            button2.setDisable(false);
            button3.setDisable(false);
            button4.setDisable(false);
            button5.setDisable(false);
            button6.setDisable(false);
            button7.setDisable(false);
            button8.setDisable(false);
            button9.setDisable(false);
            button10.setDisable(false);

            button11.setDisable(true);
            button12.setDisable(true);
            button13.setDisable(true);
            button14.setDisable(true);
            button15.setDisable(true);
            button16.setDisable(true);
            button17.setDisable(true);
            button18.setDisable(true);
            button19.setDisable(true);
            button20.setDisable(true);
        });

        button20.setOnAction(e -> {
            LLNode<Card> newCard1 = newCardLinkedList.getFirstNode();
            Card save = newCardLinkedList.removeFromFront();
            resultingCardLinkedList2.addToEnd(save);
            VBox newBox = changeLinkedList(resultingCardLinkedList2);
            player2Box.getChildren().remove(13);
            player2Box.getChildren().add(newBox);
            VBox newManyCards = changeLinkedList(newCardLinkedList);
            newManyCards.setSpacing(5);
            layout.setCenter(newManyCards);
            labelPlayer2Score.setText("Score: " + resultingCardLinkedList2.calculatePoints());
        });

        layout.setLeft(scrollPaneLeft);
        layout.setRight(scrollPaneRight);
        layout.setCenter(scrollPaneCenter);

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setTitle("WELCOME TO CSDS132 GUILLOTINE!");

    }

    /**
     * Helper method that changed a linked list of card into a vbox
     * @param cardList a linked list of card
     * @return a new vbox that transfer each name, group and points of each card
     */
    public VBox changeLinkedList(LinkedList<Card> cardList) {

        // Create a new vbox that stores all the card in the linked list card
        VBox resultingBox = new VBox();

        // a temp Card Node
        LLNode<Card> temp = cardList.getFirstNode();

        // loop through and transfer the card list into a new vbox
        for (int i = 0; i < cardList.length(); i++){
            resultingBox.getChildren().add(new Button(temp.getElement().getName() + " " + temp.getElement().getGroup() + " "   + temp.getElement().getPoints()));
            temp = temp.getNext();
        }
        return resultingBox;
    }

    public static void main(String[] args){
        Application.launch(args);
    }

}