import java.util.Scanner;

public class Cat {
	

	//initilizing the scanner
	static Scanner myScanner = new Scanner(System.in);
    public static void catigorize(String name, int age, int energyLevel){
		//catorizing the age of the cat to see what stage of its' life the users cat is in
        if (age <= 1){
            System.out.println(name+" is a kiten. (0-1)");
        }else if (age>=2 && age<=10){
            System.out.println(name + " is an adult. (2-10)");

        }else{
            System.out.println(name+" is a senior. (11+)");
        }

		//catorizingn the users cats energy to give feedback on what kinda activities it could do24
		if (energyLevel>=1 && energyLevel<=3){
			System.out.println(name+" has low energy. Some recomended activities are napping/bird watching. ");
		}else if(energyLevel>=4 && energyLevel<=6){
			System.out.println(name+" has moderate energy. Some recomended activities are chasing a toy or playing with another cat.");
		}else{
			System.out.println(name+" has high energy. Some recomended activities are climbing or hunting. ");
		}
    }
}