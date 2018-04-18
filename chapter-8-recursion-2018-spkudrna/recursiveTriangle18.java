import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {

        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {       
       if (distance(xPos[0], yPos[0], xPos[1], yPos[1]) <= 10)
       {
           return;
       }
       
        //bottom midpoint
        int MidBottomX = ((xPos[0] + xPos[1])/2);
        int MidBottomY = ((yPos[0] + yPos[1])/2);
        
        //left midpoint
        int MidLeftX = ((xPos[1] + xPos[2])/2);
        int MidLeftY = ((yPos[1] + yPos[2])/2);
        
        //right midpoint
        int MidRightX = ((xPos[2] + xPos[3])/2);
        int MidRightY = ((yPos[2] + yPos[3])/2);


       //make the x and y array (3 points + first point to finish triangle)
        int[] xPosNew = {MidBottomX, MidLeftX, MidRightX, MidBottomX};
        int[] yPosNew = {MidBottomY, MidLeftY, MidRightY, MidBottomY};


       //draw the Triangle
       page.drawPolyline (xPosNew, yPosNew, xPosNew.length);

       //create x,y Array using the midpoints you calculated
       //xPos = xPosNew;
       //yPos = yPosNew;
            




       try
            {
               Thread.sleep(17);
            }
            catch (InterruptedException e) 
            {
      }
       // Recursive calls for each section of triangle
       int[] leftCascX = {MidBottomX, xPos[1], MidLeftX, MidBottomX};
       int[] leftCascY = {MidBottomY, yPos[1], MidLeftY, MidBottomY};
       
       page.setColor (Color.blue);
       Triangle(leftCascX, leftCascY, page);
       
       
       int[] RightCascX = {MidBottomX, xPos[0], MidRightX, MidBottomX};
       int[] RightCascY = {MidBottomY, yPos[0], MidRightY, MidBottomY};
       
       page.setColor (Color.green);
       Triangle(RightCascX, RightCascY, page);
       
       int[] TopCascX = {MidLeftX, xPos[2], MidRightX, MidLeftX};
       int[] TopCascY = {MidLeftY, yPos[2], MidRightY, MidLeftY};
       
       page.setColor (Color.pink);
       Triangle(TopCascX, TopCascY, page);
       
       xPos = xPosNew;
       yPos = yPosNew;


        //}



   }//end of Triangle
   
   private static double distance(int x1, int y1, int x2, int y2)
   {
       double distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
       return distance;
   }
}
