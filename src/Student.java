import java.time.LocalDate;

public class Student {
    private String name;
    private String sur_name;
    private String gender;
    private LocalDate LocalDate_date_of_start;
    private EducationCenter  education_center;

    public Student(String name, String sur_name, String gender, LocalDate localDate_date_of_start, EducationCenter education_center) {
        this.name = name;
        this.sur_name = sur_name;
        this.gender = gender;
        LocalDate_date_of_start = localDate_date_of_start;
        this.education_center = education_center;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getLocalDate_date_of_start() {
        return LocalDate_date_of_start;
    }

    public void setLocalDate_date_of_start(LocalDate localDate_date_of_start) {
        LocalDate_date_of_start = localDate_date_of_start;
    }

    public EducationCenter getEducation_center() {
        return education_center;
    }

    public void setEducation_center(EducationCenter education_center) {
        this.education_center = education_center;
    }

    @Override
    public String toString() {
        return "Student "+
                "name = " + name +
                ", sur name = " + sur_name +
                ", gender = " + gender +
                ", date of start = " + LocalDate_date_of_start +", || "+
                " education center = " + education_center + "\n";
    }
}
