package facade;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("10", "11"));
        System.out.println(bins.mult("101", "110"));
    }
}
