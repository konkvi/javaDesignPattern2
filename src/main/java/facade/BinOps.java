package facade;

public class BinOps {

    //для парсинга из двоичной записи используйте Integer.parseInt(binStr, 2),
    // для конвертации обратно - Integer.toBinaryString.

    public String sum(String a, String b) {
    //Переведите числа из двоичной записи в строках в int,
        // сложите и переведите обратно в двоичную запись
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString(x + y);
    }

    public String mult(String a, String b) {
    // Переведите числа из двоичной записи в строках в int,
        // перемножьте и переведите обратно в двоичную запись
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString(x * y);
    }

}
