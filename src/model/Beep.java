package model;

public class Beep {
    private String cardNo;
    private String name;

    public Beep(String cardNo, String name) {
        this.cardNo = cardNo;
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getName() {
        return name;
    }
}
