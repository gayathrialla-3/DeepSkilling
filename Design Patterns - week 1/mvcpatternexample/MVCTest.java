public class MVCTest {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Bhagyasri");
        student.setId("IT2027");
        student.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(
                        student,
                        view);

        controller.updateView();

        System.out.println();

        controller.setStudentGrade("A+");

        controller.updateView();
    }
}