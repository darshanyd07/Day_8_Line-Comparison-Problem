import java.io.*;
public class LineComparison_UC2
{
    LineComparison_UC2()
    {
        System.out.println("------Welcome to Line Comparison Computation Program------");
        DataInputStream d = new DataInputStream(System.in);
        double length1,length2;
        try
        {
            System.out.println("Enter end point co-ordinates for Line 1:");
            System.out.println("Enter X1 value is :");
            int x1 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y1 value is :");
            int y1 = Integer.parseInt(d.readLine());

            System.out.println("Enter X2 value is :");
            int x2 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y2 value is :");
            int y2 = Integer.parseInt(d.readLine());

            System.out.println("Enter end point co-ordinates for Line 2:");
            System.out.println("Enter X3 value is :");
            int x3 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y3 value is :");
            int y3 = Integer.parseInt(d.readLine());

            System.out.println("Enter X4 value is :");
            int x4 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y4 value is :");
            int y4 = Integer.parseInt(d.readLine());

            length1 = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
            length2 = Math.pow((Math.pow(x4-x3,2)+Math.pow(y4-y3,2)),0.5);

            System.out.println("Length of Line 1 is: " + length1);
            System.out.println("Length of Line 2 is: " + length2);

            if( (Double.toString(length1) ).equals( Double.toString(length2) ) == true)
            {
                System.out.println("The Lines are equal");
            }
            else
            {
                System.out.println("The Lines are NOT equal");
            }

        }
        catch (IOException I)
        {
            System.out.println(I);
        }
    }

    public static void main(String[] darsh)
    {
        LineComparison_UC2 UC2 = new LineComparison_UC2();
    }
}


