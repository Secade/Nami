package model;

public class App {
    private Account account;

    public App() {
        account = null;
    }

    public void login(Account account) {
        this.account = account;
    }

    public void logout() {
        this.account = null;
    }
}
