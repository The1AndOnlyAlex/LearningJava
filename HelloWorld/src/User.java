import java.util.ArrayList;
import java.util.List;

public class User {
    String username;

    List<Calculator> MyCals = new ArrayList<Calculator>();
    //List<Computer> MyComps = new ArrayList<Computer>();

    public User(String name)
    {
        username = name;
    }
    public String toString()
    {
        return username;
    }



    public void addCalculator(Calculator a)
    {
        if(a != null)
        {
            MyCals.add(a);
            a.addOwner(this);
        }
        else
        {
            System.out.println("Product not added to User");
        }
    }

    public void checkCalculator()
    {
        System.out.println("I own " + MyCals);
    }



    /*public void addComputer(Computer a)
    {
        MyComps.add(a);
        a.addOwner(this);
    }

    public void checkComputer()
    {
        System.out.println("I have " + MyComps);
    }*/
}
