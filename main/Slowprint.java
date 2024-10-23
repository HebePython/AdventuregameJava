package main;

public class Slowprint {

    public void slowPrint(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(30); // change 30 to variable to change speed
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }

    public void slowPrint(int number) {
            slowPrint(Integer.toString(number)); // Convert int to String
        }
        public void slowPrint(Object obj) {
            // Handle any object by converting it to a String
            slowPrint(obj.toString()); 
        }
}