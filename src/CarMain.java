public class Main {
    public static void main(String[] args) {
  Car car1=new Car();
        for (int i = 0; i < 5; i++) {
            int result=car1.run();

            switch(result) {
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
            }
        }
    }
}