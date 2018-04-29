class Deck {
 public Deck( ) {
 cards = new ArrayList<Card>( );
 // build the deck
 Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS,
Suit.DIAMONDS};
 for(Suit suit: suits) {
 for(int i = 2; i <= 14; i++) {
 cards.add(new Card(suit, i));
 }
 }
 // shuffle it!
 Collections.shuffle(cards, new Random( ));
 }
 public void print( ) {
 for(Card card: cards) {
 card.print( );
 }
 }
 private List<Card> cards;
}
public class SingletonExercise {
 public static void main(String args[]) {
 Deck deck = new Deck( );
 deck.print( );
 }
}