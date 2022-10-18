package javaprogrammewk7;
/*
Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
 */

public class Programme4 {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);

        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    public static boolean isLeapYear(int year) {
        boolean answer = false;
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("should return true since " + year + "is a leap year");
                answer = true;
            } else {
                System.out.println("should return false since " + year + "is a not leap year");
                answer = false;
            }
            } else {
                System.out.println("should return false since the parameter is not in the range (1-9999)");

            }
            return answer;

        }
        public static int getDaysInMonth ( int month, int year){
            if (month < 1 || month > 12) {
                System.out.println("the parameter month is invalid");
                return -1;
            } else if (year < 1 || year > 9999) {
                System.out.println("the parameter year is outside the range of 1 to 9999");
                return -1;
            } else {
                int a = 0;
                switch (month) {
                    case 1:
                        System.out.println("January has 31 days in a " + year);
                        a = 1;
                        break;
                    case 2:
                        System.out.println("Febuary has 28 days in a " + year);
                        a = 2;
                        break;
                    case 3:
                        System.out.println("March has 31 days in a " + year);
                        a = 3;
                        break;
                    case 4:
                        System.out.println("April has 30 days in a " + year);
                        a = 4;
                        break;
                    case 5:
                        System.out.println("May has 31 days in a " + year);
                        a = 5;
                        break;
                    case 6:
                        System.out.println("June has 30 days in a " + year);
                        a = 6;
                        break;
                    case 7:
                        System.out.println("July has 31 days in a " + year);
                        a = 7;
                        break;
                    case 8:
                        System.out.println("August has 31 days in a " + year);
                        a = 8;
                        break;
                    case 9:
                        System.out.println("September has 30 days in a " + year);
                        a = 9;
                        break;
                    case 10:
                        System.out.println("October has 31 days in a " + year);
                        a = 10;
                        break;
                    case 11:
                        System.out.println("November has 30 days in a " + year);
                        a = 11;
                        break;
                    case 12:
                        System.out.println("December has 31 days in a " + year);
                        a = 12;
                        break;
                }
                return a;
            }
        }
    }

