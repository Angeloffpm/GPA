import java.util.Scanner;

public class GPA {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student student = new Student("Cayden",10);

        boolean repeat = true;

        while (repeat) {

            System.out.println("Enter Math score: ");
            String mathScore = scan.nextLine();
            student.setMathSCore(mathScore);

            System.out.println("Enter English score: ");
            String englishScore = scan.nextLine();
            student.setEnglishSCore(englishScore);

            System.out.println("Enter CS score: ");
            String csScore = scan.nextLine();
            student.setCSSCore(csScore);

            double gpa = student.calculateGPA();

            System.out.println(gpa);

            System.out.println("Calculate again? (Enter y for yes, anything else for no)");
            String input = scan.nextLine();
            if (!input.equals("y")) {
                repeat = false;
            }

        }

    }

}