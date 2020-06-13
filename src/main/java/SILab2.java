import java.util.ArrayList;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String makedonka) {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public boolean function (User user, List<String> allUsers) {
        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        if (user!=null) {
            if (user.getUsername()!=null && user.getPassword()!=null) {
                String password = user.getPassword();
                String passwordLower = password.toLowerCase();
                if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) {
                    boolean digit = false, upper = false, special = false;
                    for (int i=0;i<password.length();i++) {
                        if (Character.isDigit(password.charAt(i)))
                            digit = true;
                        if (Character.isUpperCase(password.charAt(i)))
                            upper = true;
                        if (specialCharacters.contains(String.valueOf(password.charAt(i))))
                            special = true;
                    }
                    if (digit && upper && special)
                        return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] users = {"makedonka","elena","spase","deana"};
        User user = new User("makedonka") ;
        List<String> allU = new ArrayList<>();
        for(String s : users){
            allU.add(s);
        }
        new SILab2().function(user,allU);

    }
}
