package pl.krakow.uek.pp5.creditcard.model;

import java.util.HashMap;

class InMemoryCCStorage implements CreditCardStorage {
    private HashMap<String, CreditCard> cards;
    InMemoryCCStorage(){
        this.cards = new HashMap<>();
    }

    @Override
    public void add(CreditCard card) {
        this.cards.put(card.getCardNumber(), card);
    }

    @Override
    public CreditCard load(String creditCardNumber) {

        return this.cards.get(creditCardNumber);
    }
}