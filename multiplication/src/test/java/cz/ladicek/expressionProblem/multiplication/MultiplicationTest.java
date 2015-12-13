package cz.ladicek.expressionProblem.multiplication;

import cz.ladicek.expressionProblem.core.AdditionData;
import cz.ladicek.expressionProblem.core.AdditionEval;
import cz.ladicek.expressionProblem.core.ConstantData;
import cz.ladicek.expressionProblem.core.ConstantEval;
import cz.ladicek.expressionProblem.core.ExpressionEval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

interface Expression extends ExpressionEval {}

class Addition<E extends Expression> extends AdditionData<E> implements AdditionEval<E>, Expression {
    public Addition(E left, E right) {
        super(left, right);
    }
}

class Multiplication<E extends Expression> extends MultiplicationData<E> implements MultiplicationEval<E>, Expression {
    public Multiplication(E left, E right) {
        super(left, right);
    }
}

class Constant extends ConstantData implements ConstantEval, Expression {
    public Constant(int value) {
        super(value);
    }
}

public class MultiplicationTest {
    @SuppressWarnings("unchecked")
    @Test
    public void multiplication() {
        assertEquals(6, new Multiplication(new Constant(2), new Constant(3)).eval());
    }
}
