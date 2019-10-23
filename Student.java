public class Student {

    // data - properties
    private String name;
    private int gradeLevel;

    private String mathScore;
    private String englishScore;
    private String csScore;

    // constructor
    public Student(String name, int gradeLevel) {

        this.name = name;
        this.gradeLevel = gradeLevel;

        mathScore = "A";
        englishScore = "A";
        csScore = "B";

    }

    // functions - abilities

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        }
    }

    public void setMathSCore(String score) {
        this.mathScore = score;
    }

    public void setEnglishSCore(String score) {
        this.englishScore = score;
    }

    public void setCSSCore(String score) {
        this.csScore = score;
    }


    // calculate gpa
    public double calculateGPA() {

        return (letterToNumberGrade(this.mathScore) + letterToNumberGrade(this.englishScore) + letterToNumberGrade(this.csScore)) / 3;

    }

    private double letterToNumberGrade(String letterGrade) {

        if (letterGrade.equals("F")) {
            return 0.0;
        } else if (letterGrade.equals("D")) {
            return 1.0;
        } else if (letterGrade.equals("C")) {
            return 2.0;
        } else if (letterGrade.equals("B")) {
            return 3.0;
        } else if (letterGrade.equals("A")) {
            return 4.0;
        } else {
            return 0.0;
        }

    }

    public String toString() {
        return this.name;
    }

}