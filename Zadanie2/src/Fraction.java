import java.util.Scanner;

public class Fraction {

    int x;
    int y;

    Fraction(){
    }

    Fraction(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void  setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }

    public String toString(){
        return " {" + x + "/" + y + "} ";
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дробей, которое нужно напечатать: ");
        int k = scanner.nextInt();
        Fraction[] array = new Fraction[k];
        for (int i=0; i < array.length; i++){
            int n = (int) (Math.random()*11);
            int m = (int) (Math.random()*11);
            array[i] = new Fraction(n, m);
            System.out.println(array[i].toString());
        }

    }

}
