package koschei.models;

// Egg6 связано с Needle7 через конструктор (по аналогии Island2 - Wood3).
// Аннотация не требуется, т.к. бин конструируется в классе AppConfig.

public class Egg6 {
    private final Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
