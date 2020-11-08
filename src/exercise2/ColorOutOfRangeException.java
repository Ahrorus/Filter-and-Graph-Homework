// CS-151 - HW-3 - Ahror Abdulhamidov
// Exercise 2 - Exception Class (if color code is not between 0 and 255)

package exercise2;

public class ColorOutOfRangeException extends Exception {

    String errMsg;

    public ColorOutOfRangeException() {
        errMsg = "Color out of range. Has to be from 0 to 255.";
    }

    public String getErrMsg() {
        return errMsg;
    }
}
