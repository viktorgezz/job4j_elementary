package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String nameDay;
        switch (day) {
            case 1:
                nameDay = "Monday";
                break;
            case 2:
                nameDay = "Tuesday";
                break;
            case 3:
                nameDay = "Wednesday";
                break;
            case 4:
                nameDay = "Thursday";
                break;
            case 5:
                nameDay = "Friday";
                break;
            case 6:
                nameDay = "Saturday";
                break;
            case 7:
                nameDay = "Sunday";
                break;
            default:
                return "error";
        }
        return nameDay;
    }
}
