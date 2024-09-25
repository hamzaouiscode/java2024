import java.util.Scanner;

class ZooManagement {
    // Declaring the static variables 
    int nbrCages = 20; 
    String zooName = "my zoo"; 
    
    // Main function to run at start 
    public static void main(String[] args){
        // Creating zoo management instance to access attributes
        ZooManagement z = new ZooManagement();
        // Printing the string requested in first instruction 
        System.out.println(z.zooName + " comporte " + z.nbrCages + " cages");
        // Initializing Scanner 
        Scanner scanner = new Scanner(System.in); 
        // Reading values into instance attribute variables
        z.nbrCages = scanner.nextInt();
        z.zooName = scanner.nextLine().trim(); 
        
        // Printing the new changes 
        System.out.println(z.zooName + " comporte " + z.nbrCages + " cages");

    }
}

