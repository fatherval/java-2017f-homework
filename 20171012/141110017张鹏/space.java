public class space{
        private int size;
        public Position[][] positions;



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
           positions=new Position[size][size];
           for(int i=0;i<size;i++)
              for(int j=0;j<size;j++){
                  positions[i][j]=new Position();
                  positions[i][j].line=i;
                  positions[i][j].column=j;
                  positions[i][j].holder=ground;
              }
        }
        space(){
           Setsize(7);
           organism  ground=new organism();
           ground.SetName("****");
           positions=new Position[size][size];
           for(int i=0;i<size;i++)
              for(int j=0;j<size;j++){
                  positions[i][j]=new Position();
                  positions[i][j].line=i;
                  positions[i][j].column=j;
                  positions[i][j].holder=ground;
           }
         }
   

//空间打印
        public void printout(){
          for(int i=0;i<size;i++)
            for(int j=0;j<size;j++){
                 if(j<size-1)
                     System.out.print(positions[i][j].holder.GetName()+" ");
                 else
                     System.out.println(positions[i][j].holder.GetName());
            }
        }
//植入子空间
       public void Addsubspace(space sub,int i,int j) throws MyException{
           if(i+sub.Getsize()>this.size||j+sub.Getsize()>this.size)
              throw new MyException("Out of bounds");


           for(int m=0;m<sub.Getsize();m++)
              for(int n=0;n<sub.Getsize();n++){
                   /*if(sub.positions[m][n].holder!=ground){
                       if(this.positions[i+m][j+n].holder!=ground)
                          throw new MyException("Conflicted");
                       else*/
                           this.positions[i+m][j+n].holder=sub.positions[m][n].holder;
                   
              }
       }









}