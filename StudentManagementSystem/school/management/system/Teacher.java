package school.management.system;

/**Created by Alex on 10/9/2021.
 * This class is responsible for keeping track of the
 * teacher's name, id, and salary. 
*/

public class Teacher {
   
    private int id;
    private String name;
    private int salary;

    //Creates new teacher object

    public Teacher(int id, String name, int salary) {
        
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
