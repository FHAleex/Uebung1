package ac.at.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
Earbeitet mit Zeljko Sekulic, Petar Vranesevic
 */
public class PasswordTest {

    /**checks what happens when password is to short**/
    @Test
    @DisplayName("Length of Password")
    public void LengthPasswordTest() {
        Password password = new Password();
        assertFalse(password.LengthPassword("abc"));
    }
    /**checks what happens when password has the right length**/
    @Test
    @DisplayName("Length of Password2")
    public void LengthPasswordTest2() {
        Password password = new Password();
        assertTrue(password.LengthPassword("abcdefghijk"));
    }

    /**checks what happens when password has no upper cases**/
    @Test
    @DisplayName("Upper and Lower case")
    public void UpperandLowercaseTest() {
        Password password = new Password();
        assertFalse(password.UpperandLowercase("abcdefghijkl"));
    }
    /**checks what happens when password has upper and lower cases**/
    @Test
    @DisplayName("Upper and Lower case2")
    public void UpperandLowercase2() {
        Password password = new Password();
        assertTrue(password.UpperandLowercase("Password"));
    }

    /**checks what happens when password has no numbers in it**/
    @Test
    @DisplayName("Has Integer")
    public void hasIntegerTest() {
        Password password = new Password();
        assertFalse(password.hasInterger("Password"));
    }
    /**checks what happens when password has numbers**/
    @Test
    @DisplayName("Has Integer2")
    public void hasIntegerTest2() {
        Password password = new Password();
        assertTrue(password.hasInterger("Password12"));
    }

    /**checks what happens when password has no special chars**/
    @Test
    @DisplayName("Has special char")
    public void hasspecialchar() {
        Password password = new Password();
        assertFalse(password.hasspecialchar("Password12"));
    }
    /**checks what happens when password has special chars**/
    @Test
    @DisplayName("Has special char2")
    public void hasspecialchar2() {
        Password password = new Password();
        assertTrue(password.hasspecialchar("Password@"));

    }

    /**checks what happens when the next numbers are continues**/
    @Test
    @DisplayName("Next numbers")
    public void nextnumbersTest() {
        Password password = new Password();
        assertFalse(password.nextNumbers("Pass123word"));
    }
    /**checks what happens when the next numbers are not continues**/
    @Test
    @DisplayName("Next numbers2")
    public void nextnumbers3() {
        Password password = new Password();
        assertTrue(password.nextNumbers("Pass12word"));
    }

    /**checks what happens when the next numbers are the same**/
    @Test
    @DisplayName("Same next numbers")
    public void samenextnumbers() {
        Password password = new Password();
        assertFalse(password.samenextNumbers("Pass1111word"));
    }
    /**checks what happens when the next numbers are not the same**/
    @Test
    @DisplayName("Same next numbers2")
    public void samenextnumbers2() {
        Password password = new Password();
        assertTrue(password.samenextNumbers("Pass111word"));
    }

    /**checks everything when true**/
    @Test
    @DisplayName("Ultimate Test")
    public void checkPasswordTest() {
        Password password = new Password();
        assertTrue(password.checkPassword("Password12@"));
    }
    /**checks everything when false**/
    @Test
    @DisplayName("Ultimate Test2")
    public void checkPasswordTest2() {
        Password password = new Password();
        assertFalse(password.checkPassword("1234"));
    }
}
/*
END
 */
