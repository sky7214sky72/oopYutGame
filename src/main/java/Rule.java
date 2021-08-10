import java.util.Random;
import java.util.Scanner;

public class Rule {
    public int getScore(){
        return 0;
    }
    public void selectTurn(Gamer gamer1, Gamer gamer2){
        System.out.println("순서를 결정합니다.....");
        Random random = new Random();
        int turnNumber = random.nextInt(2);
        gamer1.setTurn(turnNumber);
        if(turnNumber == 0){
            gamer2.setTurn(turnNumber+1);
            System.out.println("["+ gamer1.getName() + "]"+ "님의 선공입니다");
            System.out.println("게임을 시작하겠습니다....");
        }else{
            gamer2.setTurn(turnNumber-1);
            System.out.println("["+ gamer2.getName() + "]"+ "님의 선공입니다");
            System.out.println("게임을 시작하겠습니다....");
        }
    }

    public void insertName(Gamer gamer1, Gamer gamer2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1p의 이름을 설정해주세요");
        gamer1.setName(scanner.nextLine());
        System.out.println("2p의 이름을 설정해주세요");
        gamer2.setName(scanner.nextLine());
    }

    public int throwYut(){
        Random random = new Random();
        int throwNumber = random.nextInt(6);
        throwNumber += 1;
        return throwNumber;
    }

    public String judgeGame(Gamer gamer1,Gamer gamer2){
        if(gamer1.getScore() == 4){
            return gamer1.getName();
        }else if(gamer2.getScore() == 4){
            return gamer2.getName();
        }else{
            return null;
        }
    }
}
