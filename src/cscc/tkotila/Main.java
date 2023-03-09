package cscc.tkotila;

public class Main {
    public static void main(String[] args) {
        EmailContact emailContact = new EmailContact("tkotila@student.cscc.edu");
        PhoneContact phoneContact = new PhoneContact("+16148011222"); // jimmy johns phone number :p

        emailContact.contact();
        phoneContact.contact();
    }
}

class EmailContact extends Contact {
    private String email;

    public EmailContact(String email) {
        this.email = email;
    }

    @Override
    void contact() {
        System.out.println("Emailing " + email);
    }
}

class PhoneContact extends Contact {
    private String phoneNumber;

    public PhoneContact(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    void contact() {
        System.out.println("Calling " + phoneNumber);
    }
}

abstract class Contact {
    abstract void contact();
}
