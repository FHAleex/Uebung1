package ac.at.fhcampuswien;
import java.lang.*;


public class Password {


    public boolean checkPassword(String actual) {
        return LengthPassword(actual) && UpperandLowercase(actual) &&
                hasInterger(actual) && hasspecialchar(actual) &&
                samenextNumbers(actual) && samenextNumbers(actual);

    }

    public boolean LengthPassword(String actual) {
        return actual.length() >= 8 && actual.length() <= 25;
    }

    public boolean UpperandLowercase(String actual) {
        int upper = 0;
        int lower = 0;

        for (char elem : actual.toCharArray()) {
            if (Character.isUpperCase(elem)) {
                upper += 1;
            } else if (Character.isLowerCase(elem)) {
                lower += 1;
            }
        }
        return lower != 0 && upper != 0;
    }

    public boolean hasInterger(String actual) {
        int number = 0;

        for (int elem : actual.toCharArray()) {
            if (Character.isDigit(elem)) {
                number += 1;
            }
        }
        return number != 0;
    }

    public boolean hasspecialchar(String actual) {
      char[] specialchars = {'(', ')', '#', '$', '?', '!', '%', '/', '@'};

      for (int i = 0; i < actual.length(); i++) {
          for (char specialchar : specialchars) {
              if (actual.charAt(i) == specialchar) {
                  return true;
              }
          }
      }
      return false;
    }

    public boolean nextNumbers(String actual) {

        int firstdigit = 0;
        int seconddigit = 0;
        int thirddigit = 0;


        for (int i = 0; i <= actual.length(); i++) {
            if (i < actual.length()-2 && Character.isDigit(actual.charAt(i)) && Character.isDigit(actual.charAt(i+1)) && Character.isDigit(actual.charAt(i+2))){
              firstdigit = actual.charAt(i);
              seconddigit = actual.charAt(i+1);
              thirddigit = actual.charAt(i+2);
          }
        }
        return firstdigit != seconddigit - 1 || firstdigit != thirddigit - 2;
    }

    public boolean samenextNumbers(String actual) {
        int firstdigit = 0;
        int seconddigit = 0;
        int thirddigit = 0;
        int fourthdigit = 0;


        for (int i = 0; i <= actual.length(); i++) {
            if (i < actual.length()-3 && Character.isDigit(actual.charAt(i)) && Character.isDigit(actual.charAt(i+1)) &&
                    Character.isDigit(actual.charAt(i+2)) && Character.isDigit(actual.charAt(i+3))){

                firstdigit = actual.charAt(i);
                seconddigit = actual.charAt(i+1);
                thirddigit = actual.charAt(i+2);
                fourthdigit = actual.charAt(i+3);

                if (firstdigit == seconddigit && firstdigit == thirddigit && firstdigit == fourthdigit) {
                    return false;
                }
            }
        }
        return true;

    }


}
