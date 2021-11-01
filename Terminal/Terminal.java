import java.util.Scanner;

class Terminal {
    public static void main(String[] args) {
        while (true) {
            prompt();
        }
    }

    private static void hadoop() {
        System.out.println("Hadoop Incomplete\n");
    }

    private static void spark() {
        System.out.println("Spark Incomplete\n");
    }

    private static void jupyter() {
        System.out.println("Jupyter Incomplete\n");
    }

    private static void sonarqube() {
        System.out.println("Sonarqube Incomplete\n");
    }

    private static void prompt() {
        System.out.println("Welcome to Big Data Processing Application");
        System.out.println("Please type the number that corresponds to "
            + "which application you would like to run:");
        System.out.println("1. Apache Hadoop");
        System.out.println("2. Apache Spark");
        System.out.println("3. Jupyter Notebook");
        System.out.println("4. SonarQube and SonarScanner");
        System.out.println();
        System.out.print("Type the number here > ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 1:
                hadoop();
                break;
            case 2:
                spark();
                break;
            case 3:
                jupyter();
                break;
            case 4:
                sonarqube();
                break;
            default:
                System.out.println("Unrecognized input, please type a number from 1-4.\n");
                break;
        }
    }
}