import java.util.Scanner;

class Validator {

    private static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }


    public static int getInt(Scanner sc, String prompt,
                             int min, int max) {
        int i = 0;
        boolean isValid = false;

        while (!isValid) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be " + min + " or greater.");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be " + max + " or less. Try again.");
            } else {
                isValid = true;
            }
        }
        return i;
    }


    static int getInt(Scanner sc, String prompt,
                      int min) {
        int i = 0;
        boolean isValid = false;

        while (!isValid) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Error! Number must be higher than " + min + ". Try again.");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    static double getDouble(Scanner sc, String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
                                   double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(sc, prompt);
            if (d < min) {
                System.out.println(
                        "Error! Number must be " + min + " or greater.");
            } else if (d > max) {
                System.out.println(
                        "Error! Number must be " + max + " or less.");
            } else {
                isValid = true;
            }
        }
        return d;
    }

    static String getFirstChar(Scanner sc, String prompt, String char1, String char2) {
        String character = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            character = Character.toString(sc.nextLine().charAt(0)).toLowerCase();
            if (character.equals(char1) || character.equals(char2)) {
                isValid = true;
            } else {
                System.out.println("Error! Invalid response. Try again.");
            }
        }
        return character;
    }


    static String getFirstChar(Scanner sc, String prompt, String char1, String char2, String char3) {
        String character = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            character = Character.toString(sc.nextLine().charAt(0)).toLowerCase();
            if (character.equals(char1) || character.equals(char2) || character.equals(char3)) {
                isValid = true;
            } else {
                System.out.println("Error! Invalid response. Try again.");
            }
        }
        return character;
    }


    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next();
        sc.nextLine();
        return s;
    }
}




