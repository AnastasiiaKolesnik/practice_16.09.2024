import java.util.Objects;

class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int yearOfStudy;
    private String email;// Год обучения

    public Student() {
    }

    public Student(String name, int id, int yearOfStudy, String email) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return yearOfStudy == student.yearOfStudy && id == student.id && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    // Переопределяем метод hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, id, yearOfStudy, email);
    }

    // Переопределяем метод compareTo для сортировки по году обучения
    @Override
    public int compareTo(Student other) {
        // Сначала сортируем по году обучения
        int yearComparison = Integer.compare(this.yearOfStudy, other.yearOfStudy);
        if (yearComparison != 0) {
            return yearComparison;
        }
        // Если год обучения одинаковый, сортируем по имени
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", email='" + email + '\'' +
                '}';
    }
}
