import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //название, страна , местная дата, год основания

        College college = new College("Оксвард", "Америка", LocalDate.of(2000, 5, 13));
        University university = new University("Жусуп Баласагын", " Кыргызстан", LocalDate.of(2006, 6, 22));
        School school = new School("Средняя общеобразовательная школа №10", "Кыргызстан", LocalDate.of(2003, 8, 12));

        Student student1 = new Student(" Айчурок ", " Элебесов ", " Ж ", LocalDate.of(2015, 3, 1), college);
        Student student2 = new Student(" Муктарбек ", " Нурпазылов ", " М ", LocalDate.of(2006, 7, 1), college);
        Student student3 = new Student(" Алина ", " Макэева ", " Ж ", LocalDate.of(2001, 1, 1), college);
        Student student4 = new Student(" Рамазан ", " Каракэев ", " М ", LocalDate.of(1988, 10, 1), college);
        Student student5 = new Student(" Рабия ", " Меваза ", " Ж ", LocalDate.of(1900, 5, 1), college);
        Student student6 = new Student(" Кандыбек ", " Исаев ", " М ", LocalDate.of(1845, 9, 1), college);
        Student student7 = new Student(" Мырзайым ", " Келдибекова ", " Ж ", LocalDate.of(2009, 1, 1), college);
        Student student8 = new Student(" Дастан ", " Джалилов ", " М ", LocalDate.of(2904, 8, 1), college);
        Student student9 = new Student(" Айнура ", " Анарбаева ", " Ж ", LocalDate.of(2019, 2, 1), college);
        Student student0 = new Student(" Даниэль ", " Ойгонбосов ", " М ", LocalDate.of(2017, 4, 1), college);

        Student[] student = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student0};
        //getInfoStudent(student);
        //where_does_the_student_study(student);
        how_many_years_did_he_study(student);

    }
    public static void getInfoStudent(Student [] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(Arrays.toString(students));
        }
    }
    public static void where_does_the_student_study (Student [] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println("Студент под именем "+students[i].getName()+" учится в "+students[i].getEducation_center());
        }
    }
    public static void how_many_years_did_he_study(Student[] students) {
        LocalDate currentDate = LocalDate.now();

        for (int i = 0; i < students.length; i++) {
            LocalDate startDate = students[i].getLocalDate_date_of_start();
            Period period = Period.between(startDate, currentDate);

            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            System.out.println(" Студент " + students[i].getName() +" учится в "+students[i].getEducation_center()+" в этом учириждение "+ ": " + years + " лет, " + months + " месяцев, " + days + " дней\n");
        }
    }
}
