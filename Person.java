import java.util.Scanner;
import java.text.DecimalFormat;  

//3import java.util.Arrays;

public class Person 
{
    public static void main(String[] args)
    {    //points= grade*credit
       Double totalPoints=0.0;
       Double totalCredits=0.0;
       Double totalGPA;

        Scanner scan = new Scanner (System.in);

        boolean moreClass= true;
     do{   
        Integer credit=0;
        Boolean valueCredit= true;
        do {
        
        System.out.println("Enter number of credits");
        String Strcredit= scan.nextLine();
        
        try{   
             credit= Integer.parseInt(Strcredit);
            valueCredit = true;
            
            }
        catch (NumberFormatException nfe)
        {
            System.out.println("REtry");
            valueCredit= false;
        }
    } while (!valueCredit);

/////////////////////////////////////////////////////////

       

        Double points;
        Double gradeValue= 0.0;
       Boolean valGrade= true;
        do{ 
            valGrade= true;
        System.out.println("Enter grade");
        String grade= scan.nextLine();

        if(grade.equalsIgnoreCase("a"))
        {
            gradeValue= 4.0;
        }
       else if(grade.equalsIgnoreCase("a-"))
        {
            gradeValue= 3.5;
        }
       else if(grade.equalsIgnoreCase("b"))
        {
            gradeValue=3.0;
        }
        else if(grade.equalsIgnoreCase("c"))
        {
            gradeValue= 2.0;
        }
        else if(grade.equalsIgnoreCase("d"))
        {
            gradeValue= 1.0;
        } 
        else if(grade.equalsIgnoreCase("F"))
        {
            gradeValue= 0.0;
        }
        else 
        {
            System.out.println("You did not enter valid grade");
            valGrade= false;
        }
    } while(!valGrade);
          ////////////////////////////////////////////////
        points= gradeValue * credit;

        totalPoints+= points;
        totalCredits+= credit;
     
         boolean chooseTF= true;
      //  moreClass= choose.equalsIgnoreCase("Y");
        do{ 
            System.out.println("Would you like to take another class(Y/N)");
            String choose= scan.nextLine();
            chooseTF= true;
        switch(choose)
        {
            case "Y":
            moreClass= true;
            break;

            case "N":
            moreClass= false;
            break;

            default: 
            System.out.println("Enter Valid Value");
            chooseTF=false;
            break;
        } }
        while(chooseTF==false);

        totalGPA= Double.valueOf(totalPoints)/ Double.valueOf(totalCredits);
       // Double GPA= points/Double.valueOf(credit);
     }while(moreClass);
      
      DecimalFormat decfor = new DecimalFormat("0.00");

        System.out.println("Total Credits "+totalCredits);
       /// System.out.println(grade);
        //System.out.println("GradeValue " +gradeValue);
        System.out.println("Total Points  "+totalPoints);
        System.out.println("GPA " + decfor.format(totalGPA));
        scan.close();

    }
}