/**
 * Created by LunaFlores on 12/13/16.
 */
public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private int days;

    Month(int days){
        this.days = days;
    }

    public int daysInMonth (int years){
        if(isLeapYear(years) && this == FEBRUARY){
            return 29;
        }
        return days;

    }

    private boolean isLeapYear (int year){
        if(((year % 4 == 0)&& (year % 100 != 0))|| (year % 400 == 0)){
            return true;
        } else {
            return false;
        }

    }



    @Override
    public String toString() {
        return "Month{" +
                "days=" + days +
                '}';
    }
}
