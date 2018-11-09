public class OutputCitizen {
    public Citizen citizen;

    static void theCitizen(Citizen citizen) {
        System.out.println("Name: " + citizen.getName());
        System.out.println("Age: " + citizen.getAge());
        System.out.println("Nationality: " + citizen.getNationality());
    }

}
