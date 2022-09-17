package service;

public interface SecutityService {
    String findLoggedInLogin();

    void autoLogin(String login, String password);
}
