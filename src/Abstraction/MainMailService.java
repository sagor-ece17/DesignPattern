package Abstraction;

public class MainMailService {
    public static void main(String[] args) {
        var mailService = new MailService();
        mailService.sendEmail();
    }
}
