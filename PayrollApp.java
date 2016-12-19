package payroll;
import java.util.Scanner;

/** Name: Sharon
  * Email: sharon.lee.fumi@hotmail.com
  * Assignment: PayrollApp class of Assignment 4
  * 
  * This program is to report on the payroll status of employees.
  * The application prints out the payroll information for each employee, 
  * which holds up to 100 Employee Objects. 
  * Contains a main method as the entry point and a private run method.
  * 
  */

public class PayrollApp
{
  public static void main(String[] args)
  {
     PayrollApp payroll = new PayrollApp();
     payroll.run(); 
  }
  
  //An array Employee to hold up to 100 Employee Objects
  Employee [] employee = new Employee[100];
  int total = 0; // the total number of employees and it used to avoid nullpointer exception
  
  //Entry point of required functionality that read and write information on user input with PrintStatment()
  private void run()
  {
    System.out.println("Welcome to the Payroll Application.");
    Scanner input = new Scanner(System.in);
        
    for (int i=0; i<employee.length;i++)
    {
      //take in name, hourlyWage, workedHours
      System.out.println("Please enter the Employee's name:");
      String name = input.nextLine();
      System.out.println("Please enter the Employee's hourly wage:");
      double hourlyWage = Double.parseDouble(input.nextLine());
      System.out.println("Please enter the Employee's number of hours worked as a number:");
      int workedHours = Integer.parseInt(input.nextLine());
            
      //enroll all employees
      employee[i] = new Employee();
      employee[i].setName(name);
      employee[i].setHourlyWage(hourlyWage);
      employee[i].setWorkedHours(workedHours);
      
      System.out.println("Would you like to enter another employee (yes or no)?");
      String msg = input.nextLine();
      //check valid input with yes or no
      while(!(msg.equals("no")||msg.equals("yes")))
      {
        System.out.println("Please Enter yes or no");
        msg = input.nextLine();
      }
     
      total++; //count employee number
      if(msg.equals("no"))
      {
        printStatement();
        break; //jump out to the loop
      }
    }
  }
  
  //print out the payroll information
  private void printStatement()
  {
    double amount = 0.0; 
    for (int i=0; i<total;i++)
    {
      System.out.println("Employee:" + employee[i].getName() + " is owed:");
      
      //format returning value to two decimal places
      String formatedGetPayment = String.format("%.2f",employee[i].getPayment());
      System.out.println("$" + formatedGetPayment);
      System.out.println("***********************************************************************");
      amount = amount + employee[i].getPayment();
    }
    System.out.println("The total number of Employee is:");
    System.out.println(total);
    System.out.println("The total amount to be paid to all employees is:");
    
    //format amount to two decimal places
    String formatedAmount = String.format("%.2f",amount);
    System.out.println("$" + formatedAmount);
  }
}
