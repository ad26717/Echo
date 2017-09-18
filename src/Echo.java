import javax.swing.JOptionPane;
import java.util.Scanner;

public class Echo {

    public static void main(String [] args)
    {
        // Determine the values that you are going to need
        double givendouble;
        float givenfloat;
        byte givenbyte;
        short givenshort;
        int givenint;
        long givenlong;
        String givenchar;
        boolean givenboolean;
        // Here we want the values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a Number(double)");
        givendouble = keyboard.nextDouble();

        System.out.println("Enter a Number(float)");
        givenfloat = keyboard.nextFloat();

        System.out.println("Enter a number(byte)");
        givenbyte = keyboard.nextByte();

        System.out.println("Enter a number(short)");
        givenshort = keyboard.nextShort();

        System.out.println("Enter an integer");
        givenint = keyboard.nextInt();

        System.out.println("Enter a number(long)");
        givenlong = keyboard.nextLong();

        System.out.println("Enter a character");
        givenchar = keyboard.next();

        System.out.println("True of False?");
        givenboolean = keyboard.nextBoolean();

        //Show the results in a dialog box.
        JOptionPane.showMessageDialog(null, "The double that you typed is \"" + givendouble + "\"" + "." +
                                            "\n" + "The float that you typed is " + "\"" + givenfloat + "\"" +"."+
                                            "\n" + "The byte that you typed is " + "\"" + givenbyte + "\"" + "." +
                                            "\n" + "The short that you typed is " + "\"" + givenshort + "\"" + "." +
                                            "\n" + "The integer that you typed is " + "\"" + givenint + "\"" + "." +
                                            "\n" + "The long that you typed is " + "\"" + givenlong + "\"" + "."+
                                            "\n" + "The character that you typed is " + "\"" + givenchar + "\"" + "."
                                            +"\n" + "The boolean value that you typed is " + "\"" + givenboolean + "\"" + ".");
    }
}
