package qa.guru_2.data;

public class UnionPayCard extends Card {
    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        return country == Country.CN;

//        if (country == Country.CN)
//            return true;
//        else
//            return false;
    }
}
