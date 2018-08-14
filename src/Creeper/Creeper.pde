PImage creeper;
int x=184;
int y=489;
int c=681;
int d=456;
int e=792;
int f=523;
int g=592;
int h=262;

void setup(){
  size(1300,900);
  PImage Forest = loadImage("Forest.jpg");
  Forest.resize(1300, 900);
  background(Forest);
  creeper=loadImage("Creeper.png");
  creeper.resize(40,40);
  image(creeper, x, y);
  image(creeper, c, d);
  image(creeper, e, f);
  image(creeper, g, h);
}
void draw(){
  if(mousePressed){
        if (isNear(x+20,y+20)==true){
      fill(0,255,0);
      ellipse(mouseX,mouseY,30,30);
      print("You found a creeper!");
        }
        else if (isNear(c+20,d+20)==true){
      fill(0,255,0);
      ellipse(mouseX,mouseY,30,30);
      print("You found a creeper!");
              }
        else if (isNear(e+20,f+20)==true){
      fill(0,255,0);
      ellipse(mouseX,mouseY,30,30);
      print("You found a creeper!");
            }
         else if (isNear(g+20,h+20)==true){
      fill(0,255,0);
      ellipse(mouseX,mouseY,30,30);
      print("You found a creeper!");
             }
      else if(isNear(x+20,y+20)==false){
      fill(255,0,0);
      ellipse(mouseX,mouseY,30,30);
      }
    }
  }
boolean isNear(int a, int b) {
if (dist(a,b,mouseX,mouseY) < 40){
     return true;
}
else{
     return false;
}
}