import java.util.ArrayList;
import java.util.List;

class Calculator
{
    int a;
    int b;
    public String calName;

    public Calculator()
    {
        //calName = name;
    }
    public Calculator(int _a, int _b)
    {
        a = _a;
        b = _b;
    }

    public Calculator(String name)
    {
        calName = name;
    }

    public int sum()
    {
        return a + b;
    }

    public static int add2(int num1, int num2)
    {
        return num1 + num2;
    }
    public int add3(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
    public String toString()
    {
        return calName;
    }
    public void setCalcName(String name)
    {
        calName = name;
    }



    List<User> Users = new ArrayList<User>();
    public void addOwner(User a)
    {
        Users.add(a);
    }

    public void checkOwner()
    {
        System.out.println(Users);
    }
}