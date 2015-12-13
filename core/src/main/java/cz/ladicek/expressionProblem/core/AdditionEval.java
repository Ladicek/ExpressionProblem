package cz.ladicek.expressionProblem.core;

public interface AdditionEval<E extends ExpressionEval> extends ExpressionEval {
    E getLeft();
    E getRight();

    default int eval() {
        return getLeft().eval() + getRight().eval();
    }
}
