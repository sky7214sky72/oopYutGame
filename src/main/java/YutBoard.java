import java.util.Arrays;

public class YutBoard {
    private String[] horse1;
    private String[] horse2;
    private String[] coordinates;
    public void showBoard(Gamer gamer1,Gamer gamer2){
        coordinates = new String[30];
        horse1 = gamer1.getCurrentHorse();
        horse2 = gamer2.getCurrentHorse();
        for(int i=0;i<30;i++){
            coordinates[i]= " ";
        }
        for(int i=0;i<21;i++){
            coordinates[i]= Integer.toString(i);
        }
        System.out.println(horse1[10] + horse2[10] + coordinates[10] + "\t" + horse1[9] + horse2[9] +coordinates[9] + "\t" + horse1[8] + horse2[8] + coordinates[8] + "\t" + "\t" + horse1[7] +  horse2[7] + coordinates[7] + "\t" + horse1[6] +  horse2[6] + coordinates[6] + "\t" + horse1[5] + horse2[5] + coordinates[5]);
        System.out.println(horse1[11] + horse2[11] + coordinates[11] + "\t" + "\t" + horse1[26] +horse2[26] +coordinates[26] + "\t" + "\t" + horse1[21] +horse2[21] +coordinates[21] + "\t" + "\t"  + horse1[4] +horse2[4] +coordinates[4]);
        System.out.println(horse1[12] + horse2[12] +coordinates[12] + "\t" + "\t" +  "\t" + horse1[22] + horse2[22] +coordinates[22] + "\t"+ "\t" + "\t" + horse1[3] +horse2[3] +coordinates[3]);
        System.out.println(horse1[13] + horse2[13] +coordinates[13] + "\t" + "\t" + horse1[23] + horse2[23] + coordinates[23] + "\t" + "\t" + horse1[27] +horse2[27] +coordinates[27] + "\t" + "\t"  + horse1[2] + horse2[2] +coordinates[2]);
        System.out.println(horse1[14] + horse2[14] +coordinates[14] + "\t" + horse1[24]+ horse2[24] +coordinates[24] + "\t" + "\t" + "\t" + "\t" + horse1[28] +horse2[28] +coordinates[28] + "\t"  + horse1[1] + horse2[1] +coordinates[1]);
        System.out.println(horse1[15] + horse2[15] +coordinates[15] + "\t" + horse1[16] + horse2[16] +coordinates[16]+ "\t" + horse1[17] +horse2[17] +coordinates[17] + "\t" + "\t" + horse1[18] + horse2[18] +coordinates[18] + "\t" + horse1[19] + horse2[19] +coordinates[19] + "\t" + horse1[20] +horse2[20] +coordinates[20]);
    }



}
