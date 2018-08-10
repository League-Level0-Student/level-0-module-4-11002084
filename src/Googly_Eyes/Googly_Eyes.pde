void setup(){
  size(800,800);
}
void draw(){
  PImage face= loadImage("Trump.jpg");
  image(face, -375,0,1200,1000);
  fill(255);
  ellipse(300,400,150,100);
  ellipse(500,400,150,100);
  fill(0);
  if(mouseX<260){
    mouseX=260;
  }
  if(mouseY<385){
    mouseY=385;
  }
    if(mouseY>415){
    mouseY=415;
  }
    if(mouseX>340){
    mouseX=340;
  }
  ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX+200,mouseY,50,50);
}