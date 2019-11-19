package pl.krakow.uek.pp5.creditcard.model;

import pl.krakow.uek.pp5.creditcard.model.commands.WithdrawCommand;

import java.math.BigDecimal;

public class CreditCardFacade {
    private final CreditCardStorage storage;

    CreditCardFacade(CreditCardStorage storage){
        this.storage = storage;
    }

    public void handle(String creditCardNumber, BigDecimal withdrawValue) {
        CreditCard loaded = storage.load(creditCardNumber);

        loaded.withdraw(withdrawValue);

        storage.add(loaded);
    }
}