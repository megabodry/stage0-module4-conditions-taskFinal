package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month < 1 || month > 12 || year < 0) {
            System.out.println("invalid date");
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                    || month == 10 || month == 12) {
                System.out.println(31);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println(30);
            } else {
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            }
        }
    }
}
