public class Circle {

private double radius;
private Point centre;

public Circle (double radius, ) { 
    centre = new Point();
    radius = 0.0;
    
public voidsetCentre (Point centre){
    this.centre = centre;
}    
    
    
public boolean isInside (Point aPoint)
{
    if (aPoint.distanceTo(centre) <radius)
        return true;
    else 
        return false;

}
}