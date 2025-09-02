/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

public class MyClass {
  public static void main(String args[]) {
    // Logical && ,|| , Not
        int a = 10, b = 20;

        // AND 
        if (a < b && b < a) 
            System.out.println("Both conditions are true (a < b AND b <a).");
        // OR 
        if (a > b || b < a) 
            System.out.println("At least one condition is true (a > b OR b < a).");       
        // NOT
        boolean result = (a < b); // true
        System.out.println("Before NOT: " + result);  
        System.out.println("After NOT: " + !result); 
  }
}