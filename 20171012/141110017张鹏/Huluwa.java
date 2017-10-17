 public class Huluwa extends organism{
    
    private COLOR co;
    private int rank;

    Huluwa(String na,COLOR co,int ra){
          SetName(na);SetColor(co);SetRank(ra);
    }
        


    public  String GetColor(){
         return this.co.GetCoName();
    }
    public void SetColor(COLOR co){
          this.co=co;
    }



    public int GetRank(){
          return this.rank;
    }
    public void SetRank(int ra){
          this.rank=ra;
    }


    public void report(Huluwa hu,int i,int j){
         System.out.println("ÀÏ"+hu.GetRank()+":"+i+"->"+j);
    }
    public void reportRank(Huluwa hu){
         System.out.println(hu.GetRank());
    }
    public void reportCo(Huluwa hu){
         System.out.println(hu.GetColor());
    }
}