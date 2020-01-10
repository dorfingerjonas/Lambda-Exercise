import java.time.LocalDate;

public class Pupil {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String postcode;
    private String city;

    public Pupil(int id, String firstName, String lastName, LocalDate dateOfBirth, String postcode, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " was born on " + dateOfBirth + " and lives in " + postcode + " " + city;
    }
}
