public class thirdweek{
      public static void main(String[] args){
           
           Huluwa [] huluwas=new Huluwa[7];
           
           huluwas[0]=new Huluwa("����",COLOR.RED,1);
           huluwas[1]=new Huluwa("����",COLOR.ORANGE,2);
           huluwas[2]=new Huluwa("����",COLOR.YELLOW,3);
           huluwas[3]=new Huluwa("����",COLOR.GREEN,4);
           huluwas[4]=new Huluwa("����",COLOR.CYAN,5);
           huluwas[5]=new Huluwa("����",COLOR.BLUE,6);
           huluwas[6]=new Huluwa("����",COLOR.PURPLE,7);
           Queue positions=new Queue();
           positions.beg(huluwas);
           positions.bubblesort();
           positions.beg(huluwas);
           positions.binarysort();
      }
}