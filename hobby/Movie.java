package sk.kosickaakademia.stanovska.school.hobby;

public class Movie extends Hobby {
    private String year;
    public Movie(String name, String year) {
        super(name);
        this.year=year;
    }
    public String getYear() {
        return year;
    }
}
