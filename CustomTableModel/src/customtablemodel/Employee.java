/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package customtablemodel;

/**
 *
 * @author thienlh
 */
public class Employee {
    String id;
    String name;
    String address;
    boolean gender; //  True for male, false for female
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String id, String name, String address, boolean gender, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
