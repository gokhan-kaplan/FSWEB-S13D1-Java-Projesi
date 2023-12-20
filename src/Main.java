import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("--------------");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println("--------------");
        System.out.println(hasTeen2(9,99,19,25));
        System.out.println(hasTeen2(10,12,23,15,42));
        System.out.println(hasTeen2(22,23,34));
        System.out.println("--------------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("--------------");
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Width değerini girin:");
            double width = scanner.nextDouble();
            System.out.println("Height değerini girin:");
            double height = scanner.nextDouble();
            System.out.println("Dikdörtgenin alanı: " + area(width,height));
        }catch(Exception ex){
            System.out.println("Hatalı input");
        }
        
    }
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) return false;
        if (!isBarking) return false;
        return clock < 8 || clock >= 20;
    }
    public static boolean hasTeen(int firstAge, int secondAge,int thirdAge) {
        return(firstAge >= 13 && firstAge <= 19) ||
            (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }
    public static boolean hasTeen2(int... ages){
        for(int age: ages){
            if(age >= 13 && age <= 19){
                return true;
            }
        }
        return false;
    }
    public static boolean isCatPlaying(boolean isSummer,int temp){
        if(!isSummer && temp>=25 && temp<=35) return true;
        else if(isSummer && temp>=25 && temp<=45) return true;
        else return false;
    }
    public static double area(double width, double height){
        if(width<0 || height<0){
            System.out.println("width ve height geçersiz değer");
            return -1;
        }
        return width*height;
    }
    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI * radius * radius;
    }

}