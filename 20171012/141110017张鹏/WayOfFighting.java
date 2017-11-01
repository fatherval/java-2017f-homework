public class WayOfFighting extends space{
   

       

        
   private int lineofleader;
   private int columnofleader;
   private int lineofsupporter;
   private int columnofsupporter;
   public void SetLeader(organism leader,int lol,int col)throws MyException{
       if(lol>this.Getsize()||col>this.Getsize())
              throw new MyException("Out of bounds");

       this.lineofleader=lol;
       this.columnofleader=col;
       positions[lol][col].holder=leader;
   }
   public int GetLeader(){
        return   lineofleader*7+columnofleader+1;
   }
   public void SetSupporter(organism supporter,int los,int cos)throws MyException{
       if(los>this.Getsize()||cos>this.Getsize())
              throw new MyException("Out of bounds");

       this.lineofsupporter=los;this.columnofsupporter=cos;
       positions[los][cos].holder=supporter;
   }
   public int GetSupporter(){
        return   lineofsupporter*7+columnofsupporter+1;
   }
/*±‰’Û
   public void changeto(WayOfFighting wof){
         for(int i=0;i<7;i++)
            for(int j=0;j<7;j++){
               this.positions[i*size+j].holder=wof.positions[i*size+j+1].holder;
            }
   }*/

   public void tr(){
          organism x;
          for(int i=0;i<7;i++)
            for(int j=0;j<7;j++){
               x=this.positions[i][j].holder;this.positions[i][j].holder=this.positions[j][i].holder;this.positions[j][i].holder=x;
            }
          }
}



 class snake extends WayOfFighting{
    private int num;
    public void Setnum(int num){
        this.num=num;
    }

    public void SetSupporter(organism[] supporters)throws MyException{
      for(int i=0;i<supporters.length;i++)
         SetSupporter(supporters[i],i,1);
    }
}


 class goose extends WayOfFighting{
     public void SetLeader(organism[] gooses)throws MyException{
        for(int i=0;i<gooses.length;i++)
           SetLeader(gooses[i],i,i);
     }
}


 class moon extends WayOfFighting{
     public void SetLeader(organism[] moons)throws MyException{
         for(int i=0;i<moons.length;i++){
             if(i%2==0)
                    SetLeader(moons[i],3-i/2,i/2);
             else
                    SetLeader(moons[i],3+(i+1)/2,(i-1)/2);
         }
     }
}


 class crane extends WayOfFighting{
      public void SetLeader(organism[] cranes)throws MyException{
         for(int i=0;i<cranes.length;i++){
            if(i<cranes.length/2)
                  SetLeader(cranes[i],i,i);
            else
                  SetLeader(cranes[i],cranes.length-i,i);
         }
       }
}

 class fish extends WayOfFighting{
         public void SetLeader(organism[] fish){
         }
}

 class diamond extends WayOfFighting{
        public void SetLeader(organism[] diamonds){
        }
}