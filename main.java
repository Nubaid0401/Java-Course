import java.util.*;

class ReportCard {
    String name;
    int grade;
    int rollNo;
    int physics;
    int chemistry;
    int biology;
    int mathematics;
    int english;

    ReportCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter grade: ");
        grade = scanner.nextInt();
        System.out.print("Enter roll no: ");
        rollNo = scanner.nextInt();

        System.out.println("Enter marks for 5 subjects: ");
        System.out.println("Enter marks of physics: ");
        physics = scanner.nextInt();
        System.out.println("Enter marks of chemistry: ");
        chemistry = scanner.nextInt();
        System.out.println("Enter marks of biology: ");
        biology = scanner.nextInt();
        System.out.println("Enter marks of Maths: ");
        mathematics = scanner.nextInt();
        System.out.println("Enter marks of English: ");
        english = scanner.nextInt();
    }

    void Report() {
        int total = physics + chemistry + biology + mathematics + english;
        double percentage = (total / 500.0) * 100.0;

        System.out.println("__________Report Card__________");
        System.out.println("NAME: " + name);
        System.out.println("_____________________");
        System.out.println("Subject    Marks");
        System.out.println("_____________________");
        System.out.println("Grade: " + grade);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Biology: " + biology);
        System.out.println("Mathematics: " + mathematics);
        System.out.println("English: " + english);
        System.out.println("_____________________");
        System.out.println("Total marks: " + total);
        System.out.println("_____________________");
        System.out.println("Average: " + (total / 5.0));
        System.out.println("_____________________");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
            System.out.println("Congratulations! You have done very well. Wishing best of luck!");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Congratulations! You have done well. Wishing best of luck!");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
            System.out.println("Good job! Keep it up!");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
            System.out.println("You have passed. Work hard.");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
            System.out.println("You have passed. Work hard.");
        } else {
            System.out.println("Grade: F");
            System.out.println("You failed! Try again next time.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        ReportCard reportCard = new ReportCard();
        reportCard.Report();
    }
}
