import processing.core.PApplet;
import java.util.Random;
public class Sketch extends PApplet {
	Random myRandom = new Random();
  int intNumberRain = 10;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
    for(int intCounter = 0; intCounter < intNumberRain; intCounter++){
      drawRaindrop(myRandom.nextInt(400+1),myRandom.nextInt(400+1),myRandom.nextInt(30+1)+20);
    }
    
  }

  // flower code
  public void draw() {
  
    setColor(getColor(255, 128, 0));
    drawFlower(255,20,30);

    setColor(getColor(255, 350, 170));
    drawFlower(120,120,20);
    drawFlower(370,310,30);
    drawFlower(50,50,70);

    setColor(getColor(40, 0, 70));
    drawFlower(310,100,50);
    
  }
  private void drawFlower(float fltFlowerX, float fltFlowerY, float fltPetalSize) {
    float fltPetalDistance = fltPetalSize / 2;

    // upper-left petal
    ellipse(fltFlowerX - fltPetalDistance, fltFlowerY - fltPetalDistance, 
      fltPetalSize, fltPetalSize);

    // upper-right petal
    ellipse(fltFlowerX + fltPetalDistance, fltFlowerY - fltPetalDistance, 
      fltPetalSize, fltPetalSize);

    // lower-left petal
    ellipse(fltFlowerX - fltPetalDistance, fltFlowerY + fltPetalDistance, 
      fltPetalSize, fltPetalSize);

    // lower-right petal
    ellipse(fltFlowerX + fltPetalDistance, fltFlowerY + fltPetalDistance, 
      fltPetalSize, fltPetalSize);

    // center petal
    fill(255, 0, 0);
    ellipse(fltFlowerX, fltFlowerY, fltPetalSize, fltPetalSize);
}
  // rain drop code
  private void drawRaindrop(float fltRainX, float fltRainY, float fltRainSize) {
    fill(0, 0, 255); // Blue color for the raindrop
    noStroke(); 

    // Main shape of the raindrop
    ellipse(fltRainX, fltRainY, fltRainSize, (float)fltRainSize * 1.5f);


    // Highlight ellipse to give a glossy effect
    fill(255);
    ellipse((float)(fltRainX - fltRainSize * 0.2), (float)(fltRainY - fltRainSize * 0.2), (float)(fltRainSize * 0.4), (float)(fltRainSize * 0.4));
  }
  
  // change values into rgb
  private int getColor(int red, int green, int blue) {
    return color(red, green, blue);
  }
  // stes fill to rgb
  private void setColor(int color) {
    fill(color);
  }
}