package cz.ladicek.expressionProblem.format;

public interface AdditionFormat<E extends ExpressionFormat> extends ExpressionFormat {
    E getLeft();
    E getRight();

    default String format() {
        return "(" + getLeft().format() + " + " + getRight().format() + ")";
    }
}
