package qa.guru_2.data;

public class MasterCard extends Card {

    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return true;
    }
}
