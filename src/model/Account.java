package model;

import java.util.ArrayList;

public class Account {
    private String username;
    private String password;
    private String phone;
    private ArrayList<Beep> cards;

    public Account(String username, String password,String phone) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        cards = new ArrayList<>();
    }

    public Account(){

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCards(ArrayList<Beep> cards) {
        this.cards = cards;
    }

    public ArrayList<Beep> getCards() {
        return cards;
    }

    public void addCard(Beep card) {
        cards.add(card);
    }
}
