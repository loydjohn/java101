// Compute distance light travels using long variables
public class Light {
  public static void main(String args[]) {
    int lightspeed;
    long days;
    long seconds;
    long distance;
    // approximate speed of light in miles per hour
    lightspeed = 186000;
    days = 1000;
    seconds = days * 24 * 60 * 60;
    distance = lightspeed * seconds;
    System.out.println("In " + days);
    System.out.println(" days light will travel about");
    System.out.println(distance + "miles.");
  }
}
