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
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a1 = (Author) other;
        return firstName.equals(a1.firstName) && secondName.equals(a1.secondName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName);
    }


}
