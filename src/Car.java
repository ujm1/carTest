public class Car {

    Car() {}

    Tire frontLeftTire=new Tire("앞왼쪽",6);
    Tire frontRightTire=new Tire("앞오른쪽",2);
    Tire backLeftTire=new Tire("뒤왼쪽",3);
    Tire backRightTire=new Tire("뒤오른쪽",4);

     int run() {
        System.out.println("출발");

        if(frontLeftTire.roll()==0) {stop(); return 1;}
        if(frontRightTire.roll()==0) {stop(); return 2;}
        if(backLeftTire.roll()==0) {stop(); return 3;}
        if(backRightTire.roll()==0) {stop(); return 4;}
        return 0;
    }

    void stop() {
        System.out.println("멈추겠습니다.");
    }
}
