public class Point {
    private double xC;
    private double yC;
    
    public Point()
    {
        xC = 0.0;
        yC = 0.0;
        
    }
    
    public Point (double x, double y)
    {
     this.xC = x;
     this.yC = y;
     
    }
    
    public double getX()
    {
        return xC;
        
    }
    
    public void setX(double x)
    {
        xC = x; 
    }
    

    
    public double getY()
    {
        return yC;
        
    }
    
    public void setY(double y)
    {
        yC = y; 
    }
    
    
    public String toString()
    {
        return ": " + xC + ", "+ yC+ ")";
    }
    
    public double distanceTo (Point anotherPoint)
    {
        //distance is square root of (x2 -x1)^2 + (y2 - y1)^2
        double xDist = this.xC - anotherPoint.xC
        double yDist = this.yC - anotherPoint.yC;
        return Math.sqrt(xDist*xDist + yDist + yDist)
    }
    }
    
}