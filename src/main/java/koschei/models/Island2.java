package koschei.models;

// Island2 связан с Wood3 через конструктор (аналогично свяжем Egg6 с Needle7).
// Аннотация не требуется, т.к. бин конструируется в классе AppConfig.

public class Island2 {
    private final Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
