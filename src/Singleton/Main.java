package Singleton;

public class Main {
    public static void main(String[] args) {
        Pessoa p = Pessoa.getInstance("Cebola", 120, "2349036");
        System.out.println(p);
    }
}
