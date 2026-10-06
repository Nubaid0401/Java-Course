public class leapyear {
    public static void main(String[] args) {
        int year = 1600;

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            isLeapYear = true;
        } else if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = false;
        }

        System.out.println(year + " is a leap year: " + isLeapYear);
    }
}
