package core.basesyntax.model;

public class FruitTransaction {
    private Operation operation;
    private String fruit;
    private int quantity;

    public FruitTransaction(Operation operation, String fruit, int quantity) {
        this.operation = operation;
        this.fruit = fruit;
        this.quantity = quantity;
    }

    public Operation getOperation() {
        return operation;
    }

    public String getFruit() {
        return fruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public enum Operation {
        BALANCE("b"),
        SUPPLY("s"),
        PURCHASE("p"),
        RETURN("r");

        private final String code;

        Operation(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        // Метод для конвертації коду в Operation
        public static Operation fromCode(String code) {
            for (Operation operation : values()) {
                if (operation.getCode().equalsIgnoreCase(code)) {
                    return operation;
                }
            }
            throw new IllegalArgumentException("No enum constant with code " + code);
        }
    }
}