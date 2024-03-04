package qa.guru_2;

import qa.guru_2.data.Card;
import qa.guru_2.data.MasterCard;
import qa.guru_2.data.UnionPayCard;
import qa.guru_2.data.VisaCard;

import java.util.ArrayList;
import java.util.List;

import static qa.guru_2.data.Country.RU;

public class Main {

    public static void main(String[] args) {
        invoke(new UnionPayCard());
        List<String> aList = new ArrayList<>();

    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println("Current balance: " + card.getBalance());
    }
}

