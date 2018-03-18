
package businesscardreader;
import java.util.*; //imports the java utilities package and everything within
import java.io.*; // imports the java io package and everything within
import java.util.regex.*; // imports the java regex package and everything within
/**
 *
 * @author Matthew Wisnewski
 */
public class BusinessCardReader { //Sets up public class

   //Contact Information
    private static String name, phoneNumber, emailAddress;   //Set aside three String variables to store name, email address and phone Number
    
   public String getName() //When called upon, gets the name listed on the Business card
    {
        return name;  //Returns the name to the user
    }
    
   public String getPhoneNumber() //When called upon, gets the phone number listed on the business card
   {
      return phoneNumber; //Returns the phone number to the user
   }
   
   public String getEmailAddress() //When called upon, gets the email address listed on the business card
   {
       return emailAddress; //Returns the email address to the user
   }
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("ExampleOne.dat"); //File ExampleOne contains the data of Mike Smith, ExampleTwo contains the data
                                                                //of Lisa Huang and FileThree contains the data of Arthur Wilson
        FileReader readBusinessCard = new FileReader("ExampleOne.dat"); //The FileReader reads the incoming file
        Scanner contactInfoScanner = new Scanner (file); //Scanner analyzes the file part by part
        
        Pattern nameFinder = Pattern.compile("(^(?!Software)[A-Z][a-z]*)[\\s]([A-Z][a-z]*)$"); 
        /*
        Search for a pattern starting with one capital letter followed by any amount of lower case letters followed by one space followed by a word
        starting with a capital letter which is then followed by any number of lower case letters. The $ sign means it should be concluded with the
        end of the line. A check has been implemented that will not accept a string starting with the word "Software".
        */
        
        Pattern phoneNumberFinder = Pattern.compile("^(Phone:|Tel:)?[\\s]?[+]?[0-9]?[\\s]?[(]?[0-9]{3,10}[)]?[-]?[\\s]?[0-9]{3,7}[-]?[0-9]{4}$");
        /*
        Search for a pattern that possibly starts with the word "Phone: or Tel:" then possibly followed by a space which is possibly followed by a +
        which is possibly followed by a number 0 to 9. This is then possibly followed by a space which is possibly followed by an open parenthesis ( 
        Next should appear at least 3 digits but no more than 10 digits. This could be followed by a closed parenthesis ) or a dash - or a space. Next 
        should appear at least 3 digits but no more than 7 digits. This could be followed by a dash - and should be followed by 4 digits.
        */
        
        Pattern emailAddressFinder = Pattern.compile("^[A-Z a-z _ .]*[@][a-z]*[.][a-z]*$");
        /*
        Search for a pattern that begins at the start of the line and contains any number of uppercase or lowercase letters or a dots . or underscores _
        This should be followed by one @ sign which is then followed by any number of lowercase letters. Next should be one dot . followed by any number
        of lowercase letters and then the end of the line.
        */
        
         while (contactInfoScanner.hasNextLine()) { //While there is a line for the scanner to read
           String LineContents  = contactInfoScanner.nextLine(); //The current contents of the scanner should be the current line
            Matcher nameMatcher = nameFinder.matcher(LineContents); //declare a matcher to try to find the name pattern in the current line
            
            Matcher phoneNumberMatcher = phoneNumberFinder.matcher(LineContents); //declare a matcher to try to find the phone pattern in the current line
            
            Matcher emailAddressMatcher = emailAddressFinder.matcher(LineContents); //declare a matcher to try to find the email pattern in the current line
            while (nameMatcher.find()) //if the name pattern is found
            {
                name = nameMatcher.group(); //set name equal to what is found
            }
            while (phoneNumberMatcher.find()) //if the phone number pattern is found
            {
                phoneNumber = phoneNumberMatcher.group(); //set the phone number equal to what is found
            }
            while (emailAddressMatcher.find()) //if the email pattern is found
            {
                emailAddress = emailAddressMatcher.group(); //set email equal to what is found
            }
        }
        contactInfoScanner.close(); //close the scanner
        
       BusinessCardReader example = new BusinessCardReader(); //Declare new object of class BusinessCardReader 
       
       System.out.println("Name: " + example.getName()); //Print out "Name: " concatenated with the getName function
       System.out.println("Phone: " + example.getPhoneNumber()); //Print out "Phone: " concatenated with the getPhoneNumber function
       System.out.println("Email: " + example.getEmailAddress()); //Print out "Email: " concatenated with the getEmailAddress function
    }
    
}
