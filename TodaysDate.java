import java.util.Date;
import java.text.SimpleDateFormat;

public class TodaysDate {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf(" welcome to the dates and animal class!");
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        String strTodaysDate  = formatter.format(today);
       System.out.println("todays date in the Format yyyy-MM-dd:"+ strTodaysDate);










        // calculate birthdate for the following two hyenas
        //4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        //12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia
        // input : "4 year old female hyena,born in spring"
        //processing : find the age and birth season
        // and then use decisions contro; structures to calculate the data.
        // parse the string
        String strStarting = "4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia.";
        String[] arrayOfStrPartsOnComma = strStarting.split(",");
        // this is a for each loop - very handy when examining array elements.
        int elementNum = 0;
        for (String thepart : arrayOfStrPartsOnComma){
            System.out.println("Element" + elementNum + "of arrayOfStrPartsOnComma is : " + thepart);
            elementNum++;


        }

        String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(" ");
        for (String thePart : arrayOfStrPartsOnSpace) {
            System.out.println("Element" + elementNum + "arrayOfStrPartsOnComma" + thePart);
        }
        System.out.println();
        String[] arrayofstrpartsonspace02 = arrayOfStrPartsOnComma[1].split(" ");
        for (String thepart : arrayofstrpartsonspace02){
            System.out.println();

        }
        String ageInYears = arrayOfStrPartsOnSpace[0];
        String Animalbirthseason = arrayofstrpartsonspace02[2];
        System.out.println("the age in years of the animal is :" + ageInYears);
        System.out.println("THE SEASON OF BIRTH OF THE ANIMAL IS :" + Animalbirthseason);
        String animalbirthdate = "";
        String strTodaysYear = "";
        int todaysyear = Integer.parseInt(strTodaysYear);
        int Animalbirthyear = todaysyear - Integer.parseInt(ageInYears);


        if (Animalbirthseason.contains("spring"));{
            animalbirthdate = "2020-03-21";

        }
        System.out.println("\n animalbirthdate = " + Animalbirthseason);
    }



        }

