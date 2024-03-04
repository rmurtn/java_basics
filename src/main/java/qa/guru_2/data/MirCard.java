package qa.guru_2.data;

public class MirCard extends Card {

    public MirCard() {
        super(PaymentSystem.MIR);
    }


    protected boolean isCountryValidForThisCard(Country country) {
        return country == Country.RU;

//        if (country == Country.RU)
//            return true;
//        else
//            return false;
    }
}
