package model;

import java.util.ArrayList;

public class Account {
    private String username;
    private String password;
    private String email;
    private String phone;
    private ArrayList<Beep> cards;

    public Account(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        cards = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Beep> getCards() {
        return cards;
    }

    public void addCard(Beep card) {
        cards.add(card);
    }
}
