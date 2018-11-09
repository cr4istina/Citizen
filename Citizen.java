public class Citizen {
    private String name = "Name, please.";
    private int age;
    private String nationality = "Your nationality, please.";

    public Citizen(String name, int age, String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public void setName(String name){
        if (name.equals("Ahmed")){
            System.out.println("Name not found.");
        } else {
            this.name = name;
        }
    }
    public String getName(){ return name; }

    public void setAge(int age){
        if (age < 18) {
            System.out.println("Invalid number, please enter your age!");
        } else {
            this.age = age;
        }
    }
    public int getAge(){ return age; }

    public void setNationality(String nationality){
        if (nationality.equals("MD")){
            System.out.println("You're allowed to vote.");
        } else if (nationality.equals("Moldova")){
            System.out.println("You're allowed to vote.");
        } else if (nationality.equals("moldova")){
            System.out.println("You're allowed to vote.");
        } else if (nationality.equals("md")){
            System.out.println("You're allowed to vote.");
        } else {
            System.out.println("You're not allowed to vote.");
        }
    }
    public String getNationality(){ return this.nationality; }

}
