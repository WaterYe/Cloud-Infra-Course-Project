import java.util.Scanner;

class Terminal {
    public static void main(String[] args) {
        while (true) {
            prompt();
        }
    }

    private static void hadoop() {
        System.out.println("Please visit http://34.135.57.13:9870/\n");
    }

    private static void spark() {
        System.out.println("Please visit http://35.232.68.95:8080/\n");
    }

    private static void jupyter() {
        System.out.println("Please visit http://104.197.52.68:8888/\n");
    }

    private static void sonarqube() {
        System.out.println("Please visit 34.122.8.225:9000/\n");
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