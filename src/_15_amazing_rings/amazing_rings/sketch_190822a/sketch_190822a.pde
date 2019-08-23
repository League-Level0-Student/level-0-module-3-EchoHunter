 int place = (250);
 
 
 int place2 =(750);

 
void setup(){
  size(1000,1000);
  
}
void draw(){
int size = 450;
 int size2 = (450);
 background(#E0D9D9);
 for(int i = 0; i < 70; i++){ 

   
  noFill();
 
   ellipse(place,500,size,size);
 


size = size -(10);
 }
if(place>0){
place++;
}
else if(place>1000){
  place++;
}
 
 for(int q = 0; q < 70; q++){ 
  
  noFill();
   ellipse(place2,500,size2,size2);
 
 

size2 = size2 -(10);
 


}
if(place>0){
place2--;
}
else if(place>1000){
  place2--;
}
else if(place<0){
 place2++ ;
}

}
