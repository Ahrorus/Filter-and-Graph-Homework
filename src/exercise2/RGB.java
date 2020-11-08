// CS-151 - HW-3 - Ahror Abdulhamidov
// Exercise 2 - RGB Model Class

package exercise2;

public class RGB {

    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    public void setRed(int red) throws ColorOutOfRangeException {
        if ((red < 0) || (red > 255))
            throw new ColorOutOfRangeException();
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) throws ColorOutOfRangeException {
        if ((green < 0) || (green > 255))
            throw new ColorOutOfRangeException();
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) throws ColorOutOfRangeException {
        if ((blue < 0) || (blue > 255))
            throw new ColorOutOfRangeException();
        this.blue = blue;
    }

}
