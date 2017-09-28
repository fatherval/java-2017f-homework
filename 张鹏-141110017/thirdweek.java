public class thirdweek{
      public static void main(String[] args){
           
           Huluwa [] huluwas=new Huluwa[7];
           
           huluwas[0]=new Huluwa("ºìÍÞ",COLOR.RED,1);
           huluwas[1]=new Huluwa("³ÈÍÞ",COLOR.ORANGE,2);
           huluwas[2]=new Huluwa("»ÆÍÞ",COLOR.YELLOW,3);
           huluwas[3]=new Huluwa("ÂÌÍÞ",COLOR.GREEN,4);
           huluwas[4]=new Huluwa("ÇàÍÞ",COLOR.CYAN,5);
           huluwas[5]=new Huluwa("À¶ÍÞ",COLOR.BLUE,6);
           huluwas[6]=new Huluwa("×ÏÍÞ",COLOR.PURPLE,7);
           Queue positions=new Queue();
           positions.beg(huluwas);
           positions.bubblesort();
           positions.beg(huluwas);
           positions.binarysort();
      }
}