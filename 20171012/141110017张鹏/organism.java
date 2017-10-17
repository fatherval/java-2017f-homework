public class organism{
    private String name;
    
        

    public String GetName(){
         if (this.name==null)
             return "**";
         else 
             return this.name;

    }
    public void SetName(String na){
         this.name=na;
    }
}