package school.management.system;

/**
 * Created by Alex on 10/9/2021.
 * This class is responsible for keeping track of
 * student fees, names, grade, and fees paid.
 */

 public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Initializing student's id, name, and grade.
    //Setting student fees to $30,000 and the paid initally value to 0.

    public Student(int id. String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's name or id
    //Used to update student's grade

    public void setGrade(int grade) {
        this.grade = grade;
    }

    //Used to update the fees paid value.

    public void UpdateFeesPaid(int fees) {
        feesPaid += fees;
    }


    //returns the id of the student

    public int getId() {
        return id;
    }

    //returns the name of the student

    public String getName() {
        return name;
    }

    //returns the fees paid by the student

    public int getFeesPaid() {
        return feespaid;
    }

    //returns the total fees of the student

    public int getFeesTotal() {
        return feesTotal;
    }

 }