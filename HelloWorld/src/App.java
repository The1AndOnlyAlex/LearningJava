public class App {
    public static void main(String[] args) throws Exception 
    {

        Store Apple = new Store();

        //System.out.println(Calculator.add2(10, 5));
        //System.out.println(aCal.add3(15, 2, 7));
        
        //System.out.println(Calculator.add2(10, 15));

        //Calculator bCal = new Calculator();

        //System.out.println(bCal.add3(15, 3, 7));;


    
        User Alex = new User("Shiny Kazoo");
        Alex.addCalculator(Apple.Buy(false));
        Alex.addCalculator(Apple.Buy(true));
        System.out.println(Alex);
        Alex.checkCalculator();
        System.out.println("~   ~   ~");

        User Jim = new User("Yajing");
        Jim.addCalculator(Apple.Buy(true));
        Jim.addCalculator(Apple.Buy(false));
        Jim.addCalculator(Apple.Buy(false));
        System.out.println(Jim);
        Jim.checkCalculator();
        //Jim.checkComputer();

        System.out.println("~   ~   ~");

        User Lenya = new User ("TheShmackaloe");
        Lenya.addCalculator(Apple.Buy(true));
        System.out.println(Lenya);
        Lenya.checkCalculator();
        System.out.println("~   ~   ~");

        //System.out.println(aCal + " is owned by:");
        //aCal.checkOwner();

    }
}
