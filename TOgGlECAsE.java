// toggle case
package toggle.pkgcase;
import java.util.*;
public class TOgGlECAsE {

    public static void strin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int len = str.length();
        String newstr = "";
        char temp;
        for(int i = 0; i < len; i++){
            temp = str.charAt(i);
            
           if(Character.isLetter(temp)){
               
               if(Character.isUpperCase(temp)){
                   newstr = newstr + Character.toLowerCase(temp);
               }
               if(Character.isLowerCase(temp)){
                   newstr = newstr + Character.toUpperCase(temp);
               }
            }
           
           else
               newstr = newstr + temp;
        }
        System.out.println("toggle case: " + newstr);
    }
    
    public static void main(String[] args) {
        TOgGlECAsE ob = new TOgGlECAsE();
        ob.strin();
        
    }
    
}
