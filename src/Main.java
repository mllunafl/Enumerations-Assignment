public class Main {

    public static void main(String[] args) {
        Month monthAp = Month.APRIL;
        if (monthAp.daysInMonth(2016) == 30) {
            System.out.println("SUCCESS: days is equal to 30");
        } else {
            System.out.println("ERROR: days should be equal to 30");
        }

        Month month = Month.FEBRUARY;
        if (month.daysInMonth(2016) == 29) {
            System.out.println("SUCCESS: its a leap year");
        } else {
            System.out.println("ERROR: its a leap year");
        }

        Month month1 = Month.FEBRUARY;
        if (month1.daysInMonth(2015)==28){
            System.out.println("SUCCESS: its not a leap year");
        } else {
            System.out.println("ERROR: its not a leap year");
        }

        Month month2 = Month.FEBRUARY;
        if (month2.daysInMonth(2017) == 28){
            System.out.println("SUCCESS: its not a leap year");
        } else {
            System.out.println("ERROR: its not a leap year");
        }
    }
}
