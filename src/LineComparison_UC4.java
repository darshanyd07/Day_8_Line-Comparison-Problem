import java.io.*;
public class LineComparison_UC4
{
    double length1,length2;
    int x1,x2,x3,x4,y1,y2,y3,y4;
    LineComparison_UC4()
    {
        System.out.println("------Welcome to Line Comparison Computation Program------");
        DataInputStream d = new DataInputStream(System.in);

        try
        {
            System.out.println("Enter end point co-ordinates for Line 1:");
            System.out.println("Enter X1 value is :");
            x1 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y1 value is :");
            y1 = Integer.parseInt(d.readLine());

            System.out.println("Enter X2 value is :");
            x2 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y2 value is :");
            y2 = Integer.parseInt(d.readLine());

            System.out.println("Enter end point co-ordinates for Line 2:");
            System.out.println("Enter X3 value is :");
            x3 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y3 value is :");
            y3 = Integer.parseInt(d.readLine());

            System.out.println("Enter X4 value is :");
            x4 = Integer.parseInt(d.readLine());

            System.out.println("Enter Y4 value is :");
            y4 = Integer.parseInt(d.readLine());

            length1 = Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)),0.5);
            length2 = Math.pow((Math.pow(x4-x3,2)+Math.pow(y4-y3,2)),0.5);

            System.out.println("Length of Line 1 is: " + length1);
            System.out.println("Length of Line 2 is: " + length2);

        }
        catch (IOException I)
        {
            System.out.println(I);
        }
    }
    void get()
    {
        if( (Double.toString(length1) ).equals( Double.toString(length2) ) == true)
        {
            System.out.println("-----The Lines are equal-----");
        }
        else
        {
            System.out.println("-------The Lines are NOT equal------");
        }

        System.out.println("----------Comparing Lines-------");
        int compare_to =  (Double.toString(length1) ).compareTo( Double.toString(length2) );

        if(compare_to <0)
        {
            System.out.println("Line 1 is lesser than Line 2");
        }
        else if (compare_to >0)
        {
            System.out.println("Line 1 is greater than Line 2");
        }
        else
        {
            System.out.println("Line 1 is equal to Line 2");
        }

    }

    public static void main(String[] darsh)
    {
        LineComparison_UC4 UC4 = new LineComparison_UC4();
        UC4.get();
    }
}


