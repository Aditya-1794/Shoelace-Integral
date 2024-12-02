import java.util.ArrayList;

public class Shoelace {
  private ArrayList<int[]> coords = new ArrayList<int[]>();
  
  //constructor overloading
  public Shoelace() {}
  
  public Shoelace(ArrayList<int[]> coords) {
    this.coords = coords;
  }
  
  //add a new point (going to be used for point (x, f(x)) with spacing dx)
  public void addPoint(int[] point) {
    this.coords.add(point);
  }
  
  public double evaluateArea() {
    //find area using shoelace theorem
    int leftSum = 0;
    int rightSum = 0;
    
    for(int i = 0; i<this.coords.size()-1; i++) {
      leftSum += this.coords.get(i)[0] * this.coords.get(i+1)[1];
    }
    leftSum += this.coords.get(this.coords.size()-1)[0] * this.coords.get(0)[1];
    
    for(int i = 0; i<this.coords.size()-1; i++) {
      rightSum += this.coords.get(i)[1] * this.coords.get(i+1)[0];
    }
    rightSum += this.coords.get(0)[0] * this.coords.get(this.coords.size()-1)[1];
    
    return 0.5 * Math.abs(leftSum - rightSum);
  }
  
  public void clear() {
    this.coords.clear();
  }
}
