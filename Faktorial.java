package sk.kosickaakademia.stanovska.school;

public class Faktorial {
    public static void main(String[] args) {
        int count= faktorial (4);
    }
    public static int faktorial (int f){
        if (f==1)
            return 1;
        else
            return  f*faktorial(f-1);
    }
}
