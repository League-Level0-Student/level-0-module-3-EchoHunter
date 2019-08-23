 void setup(){
  size(500,500);
  
 }
void draw(){
 int ree = (1);
 int size = 450;
 for(int i = 0; i < 10; i++){ 
  if(ree % 2 ==0){
   fill(#050505);
   ellipse(250,250,size,size);
 }
 else if (ree % 1 == 0){
  fill(#FF0000);
  ellipse(250,250,size,size);
 }
ree++;
size = size -(50);

 }
}
