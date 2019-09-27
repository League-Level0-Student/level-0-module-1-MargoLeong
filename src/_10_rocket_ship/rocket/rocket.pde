int x = 400; 
int y = 600; 
int moonXPosition= 150;
int crater1XPosition= 170;
int crater2XPosition= 155;
void setup() {

    background(0, 0, 40); size(800, 800);

}

void draw() {
 background(0, 0, 40);
    fill(random(255), 0, 0);
    ellipse(x, y-- + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y-- + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y-- + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y+ 10, x + 50, y + 100, x - 50, y + 100);
    fill(212,201,188);
    ellipse(moonXPosition++,150,100,100);
    fill(145,145,145);
    ellipse(crater1XPosition++,170,10,10);
    ellipse(crater2XPosition++,155,10,10);
    
    
}
