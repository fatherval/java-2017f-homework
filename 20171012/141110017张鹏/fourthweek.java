public class fourthweek{
      public static void main(String[] args){
           
           Huluwa [] huluwas=new Huluwa[7];

           
           huluwas[0]=new Huluwa("����",COLOR.RED,1);
           huluwas[1]=new Huluwa("����",COLOR.ORANGE,2);
           huluwas[2]=new Huluwa("����",COLOR.YELLOW,3);
           huluwas[3]=new Huluwa("����",COLOR.GREEN,4);
           huluwas[4]=new Huluwa("����",COLOR.CYAN,5);
           huluwas[5]=new Huluwa("����",COLOR.BLUE,6);
           huluwas[6]=new Huluwa("����",COLOR.PURPLE,7);
           space hulushan=new space(12);
           snake snakebrothers=new snake();
           snakebrothers.SetSupporter(huluwas);
                       
           supporting grandpa=new supporting();
           grandpa.SetName("�Ϻ�");
           snakebrothers.SetLeader(grandpa,3,3);
           hulushan.Addsubspace(snakebrothers,0,0);

           yaoguai [] yaoguais=new yaoguai[7];
           yaoguais[5]=new yaoguai();
           yaoguais[5].SetName("Ы��");
           yaoguais[6]=new yaoguai();
           yaoguais[6].SetName("�߾�");
           for(int i=0;i<5;i++){
                yaoguais[i]=new yaoguai();
                yaoguais[i].SetName("ආ�");
           }
           goose goosebrothers=new goose();
           goosebrothers.SetLeader(yaoguais);
           hulushan.Addsubspace(goosebrothers,0,5);

           hulushan.printout();
           grandpa.cheerfor();
           yaoguais[6].cheerfor();


           moon moonbrothers=new moon();
           moonbrothers.SetLeader(yaoguais);
           hulushan.Addsubspace(moonbrothers,0,5);


           hulushan.printout();
           grandpa.cheerfor();
           yaoguais[6].cheerfor();
      }
}