public class Tire {
    public int maxLifeCycle;
    public int killLife;
    public String position;

    Tire() {
    }

    Tire(String postition,int maxLifeCycle) {this.position=position;
    this.maxLifeCycle = maxLifeCycle;}

    public int roll() {
        if (killLife < maxLifeCycle) {
killLife++;
            System.out.println(position+"의 남은 수명은 "+(maxLifeCycle -killLife)+"입니다.");
return 1;
        } else {return 0;}
    }
}