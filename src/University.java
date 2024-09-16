import java.util.Set;
import java.util.TreeSet;

// Основной класс для работы с множеством студентов
public class University {
    public static void main(String[] args) {

        // Используем TreeSet для сортировки студентов
        Set<Student> students = new TreeSet<>();

        // Добавляем студентов в коллекцию
        students.add(new Student("Alice", 12345, 2001, "123@google.com"));
        students.add(new Student("Bob", 67890, 2002, "234@google.com"));
        students.add(new Student("Charlie", 54321, 2004, "345@google.com"));
        students.add(new Student("David", 67890, 2002, "456@google.com")); // Студент с тем же годом обучения, что и Bob

        // Выводим отсортированных студентов
        System.out.println(students);
        updateStudentEmail(students, 12345, "new@google.com");
    }


    // Метод для поиска студента по номеру зачетной книжки
    public static Student findStudentByBookNumber(Set<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Студент не найден
    }

    // Метод для обновления email студента по номеру зачетной книжки
    public static void updateStudentEmail(Set<Student> students, int bookNumber, String newEmail) {
        Student student = findStudentByBookNumber(students, bookNumber);
        if (student != null) {
            student.setEmail(newEmail);
            System.out.println("Email студента с номером зачетной книжки " + bookNumber + " успешно обновлен.");
        } else {
            System.out.println("Студент с номером зачетной книжки " + bookNumber + " не найден.");
        }
    }
}

