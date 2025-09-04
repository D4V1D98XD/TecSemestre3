let x= 10

function preload(){

}

function setup() {
  createCanvas(800, 600)
}

function draw() {
  fill(red, green, blue, alpha)
  ellipse(mouseX, mouseY, 30, 40)
  /*background(220)
  strokeWeight(1)
  stroke(0,255,0)
  fill("DarkOrChild")
  rect(100,100,100,100)
  strokeWeight(10)
  point(x,100)
  point(200,100)
  line(10,10,10, height - 10)
  line(width-10, 10, width - 10, height - 10)*/
  strokeWeight(1)
  x = x + desp
  if( x > width-10){
    desp = -desp
  }
  if(x < 10){
    desp = -desp
  }
}

function mouseClicked(){
  saveCanvas("gifsinaloense")
}

