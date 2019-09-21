
void setup() {
  size(700,700);  

}
void draw() {
  PImage pepperoni = loadImage("cheese.jpg");
   pepperoni.resize(80, 80);
  image(pepperoni, 200,200);

  
  
    fill(207,146,81);
    ellipse(350,350,270,270);
    
}
