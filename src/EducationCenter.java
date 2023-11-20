import java.time.LocalDate;
public abstract class EducationCenter {
    private String name;
    private String located_Country;
    private LocalDate foundation_Year;

    public EducationCenter(String name, String located_Country, LocalDate foundation_Year) {
        this.name = name;
        this.located_Country = located_Country;
        this.foundation_Year = foundation_Year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocated_Country() {
        return located_Country;
    }

    public void setLocated_Country(String located_Country) {
        this.located_Country = located_Country;
    }

    public LocalDate getFoundation_Year() {
        return foundation_Year;
    }

    public void setFoundation_Year(LocalDate foundation_Year) {
        this.foundation_Year = foundation_Year;
    }

    @Override
    public String toString() {
        return "EducationCenter " +
                "name = " + name +
                ", located Country = " + located_Country +
                ", foundation Year = " + foundation_Year + "\n";
    }
}