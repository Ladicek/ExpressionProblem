package cz.ladicek.expressionProblem.multiplication;

import cz.ladicek.expressionProblem.core.ExpressionEval;

public interface MultiplicationEval<E extends ExpressionEval> extends ExpressionEval {
    E getLeft();
    E getRight();

    default int eval() {
        return getLeft().eval() * getRight().eval();
    }
}
