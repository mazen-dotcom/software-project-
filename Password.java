import java.util.*;

class Pass {
    private String value;

    public  Pass(String value ) {
        this.value = value;
    }
    public boolean hasDigit() {
        for(char c : value.toCharArray()){
            if (Character.isDigit(c))
                return true;
        }
        return false ;
    }
    public boolean hasSymbol() {
        for(char c :value.toCharArray()){
            if(Character.isLetterOrDigit(c))
                return true ;
        }
        return false ;
    }
    public boolean longLength() {
        if(value.length() >=9)
            return true ;
        else
            return false ;
    }
    public boolean UpperCase() {
       for(char c : value.toCharArray()) {
        if(Character.isUpperCase(c))
            return true ;
       }
       return false ;
    }
    public String Strength(){
        int st = 0 ;
        if(hasDigit()) st++;
        if(hasSymbol()) st++;
        if(longLength()) st++;
        if(UpperCase() ) st++;
                if (st <=2)
            return "Weak";
        else if (st == 3)
            return "Medium";
        else
            return "Strong";
    }
}

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)  ;
            System.out.print("Enter password: ");
            String key = input.nextLine();
            Pass password = new Pass(key);

            System.out.println("Password Strength: " + password.Strength());
        
    }
}