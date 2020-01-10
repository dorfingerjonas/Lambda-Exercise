import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pupil {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int postcode;
    private String city;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Pupil(int id, String firstName, String lastName, String dateOfBirth, int postcode, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, formatter);
        this.postcode = postcode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " was born on " + dateOfBirth + " and lives in " + postcode + " " + city + ".";
    }
}