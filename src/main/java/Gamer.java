import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Gamer {
    Rule rule = new Rule();
    YutBoard yutBoard = new YutBoard();
    private int score;
    private int turn;
    private String name;
    private String[] currentHorse;
    private int currentPosition;
    private final String[] YUT_NAME = {"도","개","걸","윷","모","뒷도"};
    private LinkedList<Horse> horses;
    public Gamer() {
        score = 0;
        name = "";
        currentPosition = 0;
        currentHorse = new String[30];
        horses = new LinkedList<Horse>();
        for(int i=0;i<30;i++){
            currentHorse[i] = "";
        }
        for(int i=0;i<4;i++){
            horses.add(new Horse(i,0,1,20));
        }
    }

    public void moveHorse(int yut){
        Scanner scanner = new Scanner(System.in);
        System.out.println(YUT_NAME[yut-1] + "!");
        System.out.println("몇번 말을 이동시키겠습니까?(0~3)");
        int i = -1;
        while(i < 0 || i > 3){
            i = scanner.nextInt();
            if(i < 0 || i > 3){
                System.out.println("0~3중 하나를 입력해주세요");
                System.out.println("몇번 말을 이동시키겠습니까?(0~3)");
                i = -1;
                continue;
            }
            if(horses.get(i).getPosition() == 20){
                System.out.println("이미 골인한 말입니다. 다른 말을 이동시켜주세요.");
                System.out.println("몇번 말을 이동시키겠습니까?(0~3)");
                i = -1;
                continue;
            }

            if(horses.get(i).getConbinedName() != 20 && horses.get(i).getPosition() == 0){
                System.out.println("현재 합쳐진 말 입니다.");
                System.out.println("몇번 말을 이동시키겠습니까?(0~3)");
                i = -1;
                continue;
            }
        }
        System.out.println(i+"번 말을 이동시키겠습니다.");
        currentPosition = horses.get(i).getPosition();
        if(yut == 6){
            yut = -1;
        }
        if(currentPosition == 19 && yut != -1){
            currentHorse[currentPosition] = "";
            currentPosition = 20;
        }
        currentHorse[currentPosition] = "";
        currentPosition = currentPosition + yut;
        for(int j=0;j<horses.size();j++){
            if(horses.get(j).getPosition() == currentPosition){
                horses.get(j).setPosition(0);
                horses.get(j).setConbinedName(horses.get(i).getName());
                horses.get(i).setConbinedName(horses.get(j).getName());
                horses.get(i).setCombined(horses.get(i).getCombined()+horses.get(j).getCombined());
                horses.get(j).setConbinedName(horses.get(i).getCombined()+horses.get(j).getCombined());
            }
        }
        if(currentPosition >= 20 || (currentPosition == -1 || currentPosition == 0)){
            currentPosition = 20;
        }
        horses.get(i).setPosition(currentPosition);
        currentHorse[currentPosition] = "["+name + Integer.toString(horses.get(i).getName())+"]";
        if(currentPosition == 20){
            currentHorse[currentPosition] = "";
            System.out.println("골인!");
            System.out.println();
            if(horses.get(i).getCombined() == 1){
                score += 1;
                horses.get(i).setName(i+50);
                System.out.println(name+"의 점수는"+score+"입니다!");
            }else{
                score = horses.get(i).getCombined();
                int combinedHorse = horses.get(i).getConbinedName();
                if(combinedHorse != 20){
                    horses.get(combinedHorse).setName(combinedHorse+50);
                }
                horses.get(i).setName(i+50);
                System.out.println(name+"의 점수는"+score+"입니다!");
            }
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCurrentHorse() {
        return currentHorse;
    }

    public void setCurrentHorse(String[] currentHorse) {
        this.currentHorse = currentHorse;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public LinkedList<Horse> getHorses() {
        return horses;
    }

    public void setHorses(LinkedList<Horse> horses) {
        this.horses = horses;
    }
}
