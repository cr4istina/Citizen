import java.util.Scanner;

public class InputCitizen {

    public static Citizen setCitizen(){
        System.out.println("Please, enter the name:");
        String theName = new Scanner(System.in).nextLine();

        System.out.println("Please, enter your age:");
        int theAge = new Scanner(System.in).nextInt();

        System.out.println("Please, enter your nationality:");
        String theNationality = new Scanner(System.in).nextLine();

        Citizen citizen = new Citizen(theName, theAge, theNationality);
        citizen.setName(theName);
        citizen.setAge(theAge);
        citizen.setNationality(theNationality);

        return citizen;
    }

}
