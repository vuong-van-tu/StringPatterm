import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public EmailExample(){
        pattern = pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập email : ");
//        String email = sc.nextLine();
        emailExample = new EmailExample();
        for (String emails : validEmail){
            boolean isValid =emailExample.validate(emails);
            System.out.println("Email : "+emails+" is valid : "+isValid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email : " + email +" is valid: "+ isvalid);
        }
    }
}
