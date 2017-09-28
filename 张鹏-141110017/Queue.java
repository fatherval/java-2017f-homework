public class Queue{
    public Position[] positions;
    
    public Queue(){
      positions=new Position[8]; 
      for(int i=0;i<positions.length;i++){
          positions[i]=new Position();
          positions[i].index=i;
          positions[i].holder=null;
      }
    }
    public void beg(Huluwa[] huluwas){
       if(huluwas.length>this.positions.length){
            return;
       }

       positions[0].holder=null;
       positions[1].holder=huluwas[5];
       positions[2].holder=huluwas[6];
       positions[3].holder=huluwas[1];
       positions[4].holder=huluwas[3];
       positions[5].holder=huluwas[4];
       positions[6].holder=huluwas[2];
       positions[7].holder=huluwas[0];
    }
    public void bubblesort(){
       
       
       
       for(int i=1;i<positions.length-1;i++){
           for(int j=1;j<positions.length-1;j++){
               

               if(positions[j].holder.GetRank()>positions[j+1].holder.GetRank()){
                  positions[0].holder=positions[j].holder;positions[j].holder=positions[j+1].holder;positions[j+1].holder=positions[0].holder;
                  positions[j].holder.report(positions[j].holder,j+1,j);positions[j+1].holder.report(positions[j+1].holder,j,j+1);
               }
           }
       }
       for(int i=1;i<positions.length;i++){
            positions[i].holder.reportRank(positions[i].holder);
       }
    }  
    public void binarysort(){


        for(int i=1;i<positions.length-1;i++){
            for(int j=i;j<positions.length;j++){
                if(positions[j].holder.GetRank()==i){
                    positions[0].holder=positions[j].holder;positions[j].holder=positions[i].holder;positions[i].holder=positions[0].holder;
                    positions[i].holder.report(positions[i].holder,j,i);positions[j].holder.report(positions[j].holder,i,j);
                }
            }
        }
        for(int i=1;i<positions.length;i++){
              positions[i].holder.reportCo(positions[i].holder);
        }
     }
}



