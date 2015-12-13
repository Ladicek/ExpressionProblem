package cz.ladicek.expressionProblem.core;

public interface ConstantEval extends ExpressionEval {
    int getValue();

    default int eval() {
        return getValue();
    }
}
