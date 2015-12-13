package cz.ladicek.expressionProblem.multiplicationFormat;

import cz.ladicek.expressionProblem.format.ExpressionFormat;

public interface MultiplicationFormat<E extends ExpressionFormat> extends ExpressionFormat {
    E getLeft();
    E getRight();

    default String format() {
        return "(" + getLeft().format() + " * " + getRight().format() + ")";
    }
}
