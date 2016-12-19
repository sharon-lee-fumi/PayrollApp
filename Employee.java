package payroll;

/** Name: Sharon
  * Email: sharon.lee.fumi@hotmail.com
  * Assignment: Employee class of Assignment 4
  * 
  * This class is to model employee Objects.
  * Based on the number of hours worked, 
  * The class calculates the total amount to be paid to the Employee.
  * Employees have a name, an hourly wage and a number of hours worked to date.
  * 
  */

public class Employee
{
  //fields
  private String name; //the name of the employee
  private double hourlyWage; //the inidividual employee's hourly wage
  private int workedHours; //the inidividual employee's number of hours worked to date

  //default constructor
  public Employee()
  {
  }

  //accessor: return the private field name
  public String getName()
  {
    return name;
  }
  
  //mutator: passes name value from PayrollApp
  public void setName(String newName)
  {
    name = newName; 
  }

  //accessor: return the private field hourlyWage
  public double getHourlyWage()
  {
    return hourlyWage;
  }
  
  //mutator: passes hourlyWage value from PayrollApp
  public void setHourlyWage(double newHourlyWage)
  {
    hourlyWage = newHourlyWage; 
  }
  
  //accessor: return the private field workedHours
  public double getWorkedHours()
  {
    return workedHours;
  }
  
  //mutator: passes hourlyWage value from PayrollApp
  public void setWorkedHours(int newWorkedHours)
  {
    workedHours = newWorkedHours; 
  }

  //getPayment method:returns the total amount to be paid to the Employee
  //based on the number of hours worked 
  public double getPayment()
  {
    double payment = hourlyWage * workedHours;
    return payment;
  }
} 