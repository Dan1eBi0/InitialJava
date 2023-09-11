public class AppClasses {

    public static void main(String[] args) {
        System.out.println("Creating classes\n");
       
        Client client = new Client(); 
        client.setIncome(15000); //receiving data
        client.setGender('F');
        client.setYearOfBirth(1986);     
        System.out.println("Income: " + client.getIncome());//returning data
        System.out.println("Gender: " + client.getGender());
        System.out.println("Year of Birth: " + client.getYearOfBirth() + "\n");

        Client client2 = new Client();
        client2.setIncome(9000);
        client2.setGender('M');
        client2.setYearOfBirth(1990);
        System.out.println("Income: " + client2.getIncome());
        System.out.println("Gender: " + client2.getGender());
        System.out.println("Year of Birth: " + client2.getYearOfBirth() + "\n");
    }
    
}
