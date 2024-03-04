package qa.guru_2.data;

import java.io.Serializable;

import static qa.guru_2.data.Country.RU;
import static qa.guru_2.data.PaymentSystem.MAESTRO;

public class MaestroCard extends Card implements ICard, Serializable {

    public MaestroCard() {
        super(MAESTRO);
    }

    @Override
    protected boolean isCountryValidForThisCard(Country country) {
        return RU == country;
    }
}
