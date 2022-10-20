public class TryingMethods {
    // class for doing the assignment
    public static void main(String[] args) {
        summer();
        winter();

    public static void summer() {
        int myCount = 1;
        int sum = 0;
        while (myCount < 1000) {
            myCount += 1;
            sum += myCount;
        }
        System.out.println(sum); 
    }

    public static void winter() {
        int sum = 0;
        for (int i = 12; i <= 103; i++) {
            sum += i;
        }
        System.out.println(sum);
     }
}
}