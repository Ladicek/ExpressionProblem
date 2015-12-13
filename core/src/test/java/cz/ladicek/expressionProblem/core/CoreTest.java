package cz.ladicek.expressionProblem.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

interface Expression extends ExpressionEval {}

class Addition<E extends Expression> extends AdditionData<E> implements AdditionEval<E>, Expression {
    public Addition(E left, E right) {
        super(left, right);
    }
}

class Constant extends ConstantData implements ConstantEval, Expression {
    public Constant(int value) {
        super(value);
    }
}

public class CoreTest {
    @SuppressWarnings("unchecked")
    @Test
    public void constant() {
        assertEquals(5, new Constant(5).eval());
    }

    @SuppressWarnings("unchecked")
    @Test
    public void addition() {
        assertEquals(5, new Addition(new Constant(2), new Constant(3)).eval());
    }
}
