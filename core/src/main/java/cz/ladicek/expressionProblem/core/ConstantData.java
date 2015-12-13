package cz.ladicek.expressionProblem.core;

public abstract class ConstantData {
    private final int value;

    public ConstantData(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
