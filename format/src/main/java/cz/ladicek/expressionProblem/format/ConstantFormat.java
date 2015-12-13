package cz.ladicek.expressionProblem.format;

public interface ConstantFormat extends ExpressionFormat {
    int getValue();

    default String format() {
        return "" + getValue();
    }
}
