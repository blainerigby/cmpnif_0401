import java.util.Scanner;

public class App {
    //initilizing the scanner
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        //initiating user input and defining them as variables
        String name = getCatName();
        int age = getCatAge();
        String meowSound = getCatMeowSound();
        String funnyStory = getCatFunnyStory();
        int energyLevel = getCatEnergyLevel();
        //closing the scanner class 
        myScanner.close();
        System.out.println(name+" says "+meowSound+".They are "+age+". "+ funnyStory);
        //catorizing the cat and information given for some feedback to the user input
        Cat.catigorize(name,age,energyLevel);
    }
    //asking for the cats name from the user
    static String getCatName() {
        System.out.println("What is your cats name? ");
        return myScanner.nextLine();

    }
    //asking the cound of the cat from the user
    static String getCatMeowSound() {
		System.out.println("What is your cats meow sound? ");
        return myScanner.nextLine();

    }
    //asking the age of the users cat
	static int getCatAge(){
		System.out.println("What is your cats age? ");
        int age = myScanner.nextInt();
        //making sure the age is valid and not a negative number
        if (age<0){
            System.out.println("Invalid Age!");
        }
		myScanner.nextLine();
		return age;
	}
    //asking for a story about the users cat
    static String getCatFunnyStory() {
		System.out.println("What is a funny story about your cat? ");
        return myScanner.nextLine();

    }
    //asking for ht eenergy  level of ht eusers cat
    static int getCatEnergyLevel() {
        System.out.println("What is your cats energy level? (1-10)");
        int energyLevel = myScanner.nextInt();
        //making sure the user inouts a valid energy level of the cat and it is between 1 and 10
        if (energyLevel<0||energyLevel>10 ){
            System.out.println("Invalid EnergyLevel!");
        }
		myScanner.nextLine();
		return energyLevel;

	}
}