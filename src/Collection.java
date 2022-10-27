import java.util.Objects;

public class Collection {
    private final String month;
    static int numberDays;

    public Collection(String month, int numberDays) {
        this.month = month;
        Collection.numberDays = numberDays;
    }

    public String getMonth() {
        return month;
    }

    public static int getNumberDays() {
        return numberDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return Objects.equals(month, that.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, numberDays);
    }

    @Override
    public String toString() {
        return "Collection{" +
                "month='" + month + '\'' +
                ", numberDays=" + numberDays +
                '}';
    }
}
