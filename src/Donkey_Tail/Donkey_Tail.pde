import ddf.minim.*;          //at the very top of your sketch
AudioSample correct;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
PImage donkey;
PImage tail;
int x=0;
int y=0;
  int x1=0;
  int y2=0;
boolean isClicked=false;
void setup(){
  Minim minim = new Minim(this);   //In the setup method
correct = minim.loadSample("correct.wav");     //In setup. Change the file name if you need to
donkey = loadImage("donkey.jpg");
tail = loadImage("Donkeytail.png");
size(550,406);
tail.resize(50,100);

}
void draw(){
background(donkey);
fill(255);
textSize(10);
text("Look at the donkey and figure out where you should pin its tail.",0,360);
text ("When you have, pin the tail on the donkey!",0,380);
text("However, when you move out of the corner box, the donkey will disappear and you'll have to use your memory.",0,400);
rect(0,0,30,30);
if (dist(0, 0, mouseX, mouseY) >30){
  background(0);
}
if (mousePressed){
  isClicked=true;
  x=mouseX-30;
  y=mouseY-10;
x1=mouseX;
y2=mouseY;
}
if (isClicked){
    background(donkey);
  image(tail,x,y);
}
else{
  image(tail,mouseX-30,mouseY-10);
}
if (dist(480,125,x1,y2)<30){
  if (playSound) {
     correct.trigger();
     playSound = false;
}
  
}
}

// put these lines where you want the sound to play