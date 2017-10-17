public class space{
        private int size;
        public Position[] positions;



        public void Setsize(int size){
          this.size=size;
        }
        public int Getsize(){
          return size;
        }        
        space(int size){
           Setsize(size);
           organism  ground=new organism();
           ground.SetName("****");
           positions=new Position[size*size];
           for(int i=0;i<size;i++)
              for(int j=0;j<size;j++){
                  positions[i*size+j]=new Position();
                  positions[i*size+j].line=i;
                  positions[i*size+j].column=j;
                  positions[i*size+j].holder=ground;
              }
        }
        space(){
           Setsize(7);
           organism  ground=new organism();
           ground.SetName("****");
           positions=new Position[size*size];
           for(int i=0;i<size;i++)
              for(int j=0;j<size;j++){
                  positions[i*size+j]=new Position();
                  positions[i*size+j].line=i;
                  positions[i*size+j].column=j;
                  positions[i*size+j].holder=ground;
           }
         }
   

//空间打印
        public void printout(){
          for(int i=0;i<size;i++)
            for(int j=0;j<size;j++){
                 if(j<size-1)
                     System.out.print(positions[i*size+j].holder.GetName()+" ");
                 else
                     System.out.println(positions[i*size+j].holder.GetName());
            }
        }
//植入子空间
       public void Addsubspace(space sub,int i,int j){
           for(int m=0;m<sub.Getsize();m++)
              for(int n=0;n<sub.Getsize();n++){
                   this.positions[i*size+j+n+m*size].holder=sub.positions[m*sub.Getsize()+n].holder;
              }
       }









}