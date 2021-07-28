
public class Game {
    private String winner = null;
    public void play(){
        System.out.println("==========YutGame==========");
        Gamer gamer1 = new Gamer();
        Gamer gamer2 = new Gamer();
        Rule rule = new Rule();
        YutBoard yutBoard = new YutBoard();

        rule.insertName(gamer1, gamer2);
        rule.selectTurn(gamer1, gamer2);
        while(winner == null){
            int yut = 0;
            yutBoard.showBoard(gamer1, gamer2);
            if(gamer1.getTurn() == 0){
                System.out.println("[" + gamer1.getName() + "] 님이 던졌습니다.");
                yut = rule.throwYut();
                gamer1.moveHorse(yut);
                gamer1.setTurn(1);
                gamer2.setTurn(0);
                winner = rule.judgeGame(gamer1, gamer2);
            }else{
                System.out.println("[" + gamer2.getName() + "] 님이 던졌습니다.");
                yut = rule.throwYut();
                gamer2.moveHorse(yut);
                gamer1.setTurn(0);
                gamer2.setTurn(1);
                winner = rule.judgeGame(gamer1, gamer2);
            }
        }
        System.out.println(winner + "님이 승리하셨습니다.");
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
