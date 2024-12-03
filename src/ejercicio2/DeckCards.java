package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

    public static void main(String[] args) {

        // Definimos los palos y los números de la baraja.
        String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
        String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        // Creamos una lista para almacenar las cartas en la mano.
        ArrayList<Card> deck = new ArrayList<Card>();

        // Generamos todas las combinaciones de cartas y las añadimos a la mano.
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Card card = new Card(suits[i], values[j]); // Creamos una carta.
                deck.add(card); // Añadimos la carta a la mano.
            }
        }

        // Barajamos la mano aleatoriamente.
        for (int i = 0; i < deck.size(); i++) {
            int j = (int) Math.floor(Math.random() * i); // Posición aleatoria.
            Card tmp = deck.get(i); // Cambiamos las cartas de posiciones.
            deck.set(i, deck.get(j));
            deck.set(j, tmp);
        }

        // Mostramos las primeras 5 cartas de la mano.
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }
}