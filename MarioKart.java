/**
 * Simple Mario Kart Game
 *
 *
 * @author Maria Garcia
 * @version 1.0
 *
 */

class MarioKart {

    //Attributes
    private String playerName;
    private String character;
    private int speed;

    /**
     * Constructor, constructs a player with a given name, character, and speed.
     *
     * @param playerName The name of the person.
     * @param character  The character the person is playing as.
     * @param speed      The current speed of the person.
     */
    MarioKart(String playerName, String character, int speed){
        this.playerName = playerName;
        this.character = character;
        this.speed = speed;
    }

    /**
     * Gets and prints the name of the person.
     *
     * @return None
     */

    public void getPlayerName(){
        System.out.println("Player Name: " + playerName);
    }

    /**
     * Gets and prints the name of the character the person is using.
     *
     * @return None
     */

    public void getCharacter(){
        System.out.println("Character: " + character);
    }

    /**
     * Gets and prints the current speed of the character.
     *
     * @return None
     */
    public void getSpeed(){
        System.out.println("Current speed: " + speed);
    }

    /**
     * Simulate the dash mushroom power up.
     * Increases speed by 30
     *
     * @return speed
     */
    public int dashMushroom(){
        System.out.println(character + " got a Dash Mushroom! Speed +30");
        speed += 30;
        return speed;
    }


    /**
            * Simulate the coin power up.
            * Increases speed by 10
            *
            * @return speed
     */
    public int coin(){
        System.out.println(character + " got a Coin! Speed +10");
        speed += 10;
        return speed;
    }

    //Main Method
    public static void main(String[] args) {

        /**
         * Create new player
         *
         * @return The name, character, and speed of the player
         */
        MarioKart player1 = new MarioKart("Maria", "Baby Toad",60);
        MarioKart player2 = new MarioKart("Karla","Baby Peach",45);

        //Print out
        System.out.println("Mario Kart!");
        System.out.println();
        System.out.println("Starting Stats: ");

        //Output Player 1 Stats
        player1.getPlayerName();
        player1.getCharacter();
        player1.getSpeed();

        System.out.println();

        //Output Player 2 Stats
        player2.getPlayerName();
        player2.getCharacter();
        player2.getSpeed();

        //Print Out
        System.out.println();
        System.out.println("3......");
        System.out.println("2......");
        System.out.println("1......");
        System.out.println("GO!");

        //Give each player a power up
        System.out.println();
        player1.dashMushroom();
        player2.coin();

        //Print updated stats
        System.out.println();
        System.out.println("New Stats: ");

        //Player 1
        player1.getPlayerName();
        player1.getCharacter();
        player1.getSpeed();

        //Player 2
        System.out.println();
        player2.getPlayerName();
        player2.getCharacter();
        player2.getSpeed();
        
    }
}
