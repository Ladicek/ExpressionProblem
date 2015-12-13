package cz.ladicek.expressionProblem.format;

import cz.ladicek.expressionProblem.core.AdditionData;
import cz.ladicek.expressionProblem.core.AdditionEval;
import cz.ladicek.expressionProblem.core.ConstantData;
import cz.ladicek.expressionProblem.core.ConstantEval;
import cz.ladicek.expressionProblem.core.ExpressionEval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

interface Expression extends ExpressionEval, ExpressionFormat {}

class Addition<E extends Expression> extends AdditionData<E> implements AdditionEval<E>, AdditionFormat<E>, Expression {
    public Addition(E left, E right) {
        super(left, right);
    }
}

class Constant extends ConstantData implements ConstantEval, ConstantFormat, Expression {
    public Constant(int value) {
        super(value);
    }
}

public class FormatTest {
    @SuppressWarnings("unchecked")
    @Test
    public void format() {
        assertEquals("(2 + 3)", new Addition(new Constant(2), new Constant(3)).format());
    }
}
