/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 *@Sanjeev Paudel
 * @Kshitij Ale
 * @Sheshmani Bhandari
 * @Sahil Sharma
 *
 */
package ca.sheridancollege.project;


public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}


