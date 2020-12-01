/**
 * Matt Minchhoff, 9-8-2019, CSC240_01 Lab1, public and private modifiers were used to implement methods
 * @author mcmin
 */
import java.util.Scanner;
public class HealthRecord {
    
        
    private long ssn;
    private String firstName;
    private String lastName;
    private int age;
    private long phoneNumber;
    private String email;
    private double weight;
    private double height;
    
        public void readInputs() {
        
        setSSN();
        setFirstName();
        setLastName();
        setAge();
        setPhoneNumber();
        setEmail();
        setWeight();
        setHeight();
        }
        
     public void display() {
        System.out.println();
        System.out.println("\tSSN: " + getSSN());
        System.out.println("\tFirst Name: " + getFirstName());
        System.out.println("\tLast Name: " + getLastName());
        System.out.println("\tAge: " + getAge());
        System.out.println("\tPhone Number: " + getPhoneNumber());
        System.out.println("\tEmail: " + getEmail());
        System.out.println("\tWeight: " + getWeight());
        System.out.println("\tHeight: " + getHeight());
    }

    public void calculateBMIValue() {
//        
        double bmiValue = weight * 703.0 / height * height;
        System.out.println("\tThe  BMI value is "
                + bmiValue);
    }

    
    private void setSSN() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("[Q1] Enter Social Security Number: ");
        ssn = keyboard.nextLong();

        if (ssn < 0000000001) {
            System.out.println("ERROR: Invalid SSN .");
            System.exit(0);
        }
        if (ssn > 999999999) {
            System.out.println("ERROR: Invalid SSN .");
            System.exit(0);
        }

    }

    private void setFirstName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q2] Enter First Name: ");
        firstName = keyboard.next();
    }

    private void setLastName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q3] Enter Last Name: ");
        lastName = keyboard.next();
    }

    private void setAge() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q4] Enter your Age: ");
        age = keyboard.nextInt();

        if (age <= 0) {
            System.out.println("ERROR:  Error" );
            System.exit(0);
        }
        if (age > 125) {
            System.out.println("ERROR:  Error" );
            System.exit(0);
        }

    }

    private void setPhoneNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q5] Enter Phone Number: ");
        phoneNumber = keyboard.nextLong();

        if (phoneNumber < 00000000001) {
            System.out.println("ERROR: Invalid Phone Number .");
            System.exit(0);
        }
        
    }

    private void setEmail() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q6] Enter email: ");
        email = keyboard.next();
        

        }
    private void setWeight() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q7] Enter Weight in pounds: ");
        weight = keyboard.nextInt();
        
        if (weight < 1) {
            System.out.println("ERROR: Weight .");
            System.exit(0);
        }
        if (weight > 1400) {
            System.out.println("ERROR: Weight .");
            System.exit(0);

        }
    }
    private void setHeight() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("[Q8] Enter Height in inches: ");
        height = keyboard.nextInt();
        
        if (height < 1) {
            System.out.println("ERROR: Height .");
            System.exit(0);
        }
        if (height > 108) {
            System.out.println("ERROR: Height .");
            System.exit(0);

        }
    }


    private long getSSN() {
        return ssn;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private int getAge() {
        return age;
    }

    private long getPhoneNumber() {
        return phoneNumber;
    }

    private String getEmail() {
        return email;
    }
    private double getWeight() {
        return weight;
    }
    private double getHeight() {
        return height;
    }

}

  class HealthRecordDemo{
      public static void main(String[] args) {
  
      System.out.println("Hello and Welcome to the Health Record. Please enter your information.");
      
      HealthRecord patientEntry;
          patientEntry = new HealthRecord();

        patientEntry.readInputs();
        patientEntry.display();
        patientEntry.calculateBMIValue();

        System.out.println("Thanks for Using the Health Record!");
      }
  }  

 

 