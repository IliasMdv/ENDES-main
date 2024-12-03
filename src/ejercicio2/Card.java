package ejercicio2;

public class Card {

    // Atributos para almacenar el palo y el valor de la carta.
    public String suit;
    public String value;
    
    // Iniciamos el palo y el valor de la carta.
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    
    // Método toString para devolver la carta en texto.
    public String toString() {
        return (this.suit + "-" + this.value); // Ejemplo: "Spades-Ace"
    }
}