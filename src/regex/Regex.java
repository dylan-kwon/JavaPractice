package regex;

import java.util.regex.Pattern;

public class Regex {

    public static final String REGEX_PHONE = "^01\\d(\\d{3,4})(\\d{4})$";
    public static final String REGEX_EMAIL = "^.+@.+\\.(com|co\\.kr|net)$";
    public static final String REGEX_PASSWORD = "[a-z0-9]{8,}]";

    public boolean checkPhone(String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        return Pattern.compile(REGEX_PHONE)
                .matcher(phoneNumber)
                .matches();
    }

    public boolean checkEmail(String email) {
        if (email == null) {
            return false;
        }
        return Pattern.compile(REGEX_EMAIL)
                .matcher(email)
                .matches();
    }

    public boolean checkPassword(String password) {
        if (password == null) {
            return false;
        }
        return Pattern.compile(REGEX_PASSWORD)
                .matcher(password)
                .matches();
    }

}
