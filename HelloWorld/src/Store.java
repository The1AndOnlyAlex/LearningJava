import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    List<Calculator> Products = new ArrayList<Calculator>();

    int numCalculators;
    int numComputers;

    public Store()
    {
        Random rand = new Random();
        int upperbound = 3;
        numCalculators = rand.nextInt(upperbound);
        numComputers = rand.nextInt(upperbound);

        for(int i = 0; i < numCalculators; i++)
        {
            Calculator newCal = new Calculator("Cal_" + i);
            Products.add(newCal);
        }
        for(int i = 0; i < numComputers; i++)
        {
            Computer newComp = new Computer("Comp_" + i);
            Products.add(newComp);
        }

        System.out.println(numCalculators + " calculators and " + numComputers + " computers in stock");
    }

    public Calculator Buy(Boolean isCal)
    {
        Calculator ac = null;
        for( int i = 0; i < Products.size(); i++)
        {
            ac = Products.get(i);
            if(!isCal)
            {
                if (ac instanceof Computer)
                {
                    break;
                }
            }
            else
            {
                if (!(ac instanceof Computer))
                {
                    break;
                }
            }
        }
        if(ac != null)
            Products.remove(ac);
        else
            System.out.println("Sorry, product not available");
        
        return ac;

    }
}
