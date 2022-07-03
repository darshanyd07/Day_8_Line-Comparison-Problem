import java.io.*;
public class LineComparison_UC1
{
    LineComparison_UC1()  //Constructor
    {
        System.out.println("------Welcome to Line Comparison Computation Program------");
        DataInputStream d = new DataInputStream(System.in);
        try
        {
            System.out.println("Enter X1 value is :");
            int x1 = Integer.parseInt(d.readLine());
            System.out.println("Enter Y1 value is :");
            int y1 = Integer.parseInt(d.readLine());
            System.out.println("Enter X2 value is :");
            int x2 = Integer.parseInt(d.readLine());
            System.out.println("Enter Y2 value is :");
            int y2 = Integer.parseInt(d.readLine());

            double length = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
            System.out.println("Distance between (" + x1 + "," + y1 +") and (" + x2 + "," + y2 +") is :" + length);


        }
        catch (IOException I)
        {
            System.out.println(I);
        }
    }
    public static void main(String dm[])
    {
        LineComparison_UC1 UC1 = new LineComparison_UC1();
    }
}
