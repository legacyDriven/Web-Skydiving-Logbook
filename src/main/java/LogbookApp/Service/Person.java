package LogbookApp.Service;

import java.util.List;

class Person {
    private final String name;
    private final String surname;
    private final List<String> emails;
    private Address address;

    Person(String name, String surname, List<String> emails, Address address) {
        this.name = name;
        this.surname = surname;
        this.emails = emails;
        this.address = address;
    }
}
