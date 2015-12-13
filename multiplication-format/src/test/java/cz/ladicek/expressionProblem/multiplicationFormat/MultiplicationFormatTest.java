package cz.ladicek.expressionProblem.multiplicationFormat;

import cz.ladicek.expressionProblem.core.AdditionData;
import cz.ladicek.expressionProblem.core.AdditionEval;
import cz.ladicek.expressionProblem.core.ConstantData;
import cz.ladicek.expressionProblem.core.ConstantEval;
import cz.ladicek.expressionProblem.core.ExpressionEval;
import cz.ladicek.expressionProblem.format.AdditionFormat;
import cz.ladicek.expressionProblem.format.ConstantFormat;
import cz.ladicek.expressionProblem.format.ExpressionFormat;
import cz.ladicek.expressionProblem.multiplication.MultiplicationData;
import cz.ladicek.expressionProblem.multiplication.MultiplicationEval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

interface Expression extends ExpressionEval, ExpressionFormat {}

class Addition<E extends Expression> extends AdditionData<E> implements AdditionEval<E>, AdditionFormat<E>, Expression {
    public Addition(E left, E right) {
        super(left, right);
    }
}

class Multiplication<E extends Expression> extends MultiplicationData<E> implements MultiplicationEval<E>, MultiplicationFormat<E>, Expression {
    public Multiplication(E left, E right) {
        super(left, right);
    }
}

class Constant extends ConstantData implements ConstantEval, ConstantFormat, Expression {
    public Constant(int value) {
        super(value);
    }
}

public class MultiplicationFormatTest {
    @SuppressWarnings("unchecked")
    @Test
    public void multiplicationFormat() {
        assertEquals("(2 * (3 + 5))", new Multiplication(new Constant(2), new Addition(new Constant(3), new Constant(5))).format());
    }
}
