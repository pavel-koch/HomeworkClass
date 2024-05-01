import static java.util.Objects.hash;

public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Имя автора: " + firstName + "\nФамилия автора: " + secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a1 = (Author) other;
        if (firstName == null && a1.firstName == null && secondName == null && a1.secondName == null) {
            return true;
        }
        return firstName.equals(a1.firstName) && secondName.equals(a1.secondName);
    }

    @Override
    public int hashCode() {
        if (firstName == null || secondName == null) {
            return 0;
        }
        return (firstName.hashCode() + secondName.hashCode());
    }


}
