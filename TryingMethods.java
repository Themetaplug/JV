public class TryingMethods {
    // class for doing the assignment
    public static void main(String[] args) {
        TryingMethods firstBody = new TryingMethods();
        firstBody.daysOfTheWeek(2);
        firstBody.printSomething(3);
        summer();
        winter();
    }

    public static void summer() {
        {
            int myCount = 1;
            int sum = 0;
            while (myCount < 1000) {
                myCount += 1;
                sum += myCount;
            }
            System.out.println(sum);
        }
    }

    public static void winter() {
        {
            int sum = 0;
            for (int i = 12; i <= 103; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }

    String printSomething(int days) {
        if (days > 30) {
            System.out.println("Wednesday");
        } else if (days > 2) {
            System.out.println("Tuesday");
        } else if (days > 1) {
            System.out.println("Saturday");
        }
        return "";
    }

    String daysOfTheWeek(int month) {
        switch (month) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");

                break;
            case 4:
                System.out.println("Tuesday");

                break;
            case 5:
                System.out.println("Wednesday");

                break;
            case 6:
                System.out.println("Thursday");

                break;
            case 7:
                System.out.println("Friday");

                break;

            default:
                break;
        }
        return "";
    }

}