package model;

import javafx.collections.ObservableList;

import java.sql.SQLException;

public class App {
    private Account account;
    private AccountService accountService = new AccountService();

    public App() {
        account = null;
    }

    private  void register(String username, String password, String email, String phone) throws SQLException {
        Account account = new Account(username, password, email, phone);
        accountService.add(account);
    }

    public void login(Account account) {
        this.account = account;
    }

    public boolean login(String email, String password) throws SQLException {
        ObservableList<Object> emails = accountService.getAll();
        for(Object o : emails){
            if(((Account)o).getEmail().equals(email)) {
                if (((Account)o).getPassword().equals(password)) {
                    this.account = ((Account)o);
                    return true;
                }
            }
        }
        return false;
    }

    public void logout() {
        this.account = null;
    }
}
