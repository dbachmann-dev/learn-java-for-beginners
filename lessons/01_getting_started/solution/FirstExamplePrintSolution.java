public class FirstExamplePrintSolution {

    public static void main(String[] args) {
        // Variables from Lesson 02 (without 'public' because they are local inside main)
        String date = "15.04.1985";
        int day = 15;
        int month = 4;
        int year = 1985;

        // Printing the String variable directly
        System.out.println("Saved date: " + date);

        // Combining text and int variables using '+'
        System.out.println("Date: " + day + "." + month + "." + year);
    }

}