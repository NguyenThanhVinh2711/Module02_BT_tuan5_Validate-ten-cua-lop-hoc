import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validName {
    private static Pattern pattern1;

    private Matcher matcher1;

    private static final String AR = "^[CAP]\\d{4}[GHIKLM]$";

    public validName (){
        pattern1 = Pattern.compile(AR);
    }

    public boolean checkRegex (String regex){
        matcher1 = pattern1.matcher(regex);
        return  matcher1.matches();
    }
}
