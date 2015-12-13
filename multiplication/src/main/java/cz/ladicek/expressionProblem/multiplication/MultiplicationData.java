package cz.ladicek.expressionProblem.multiplication;

public abstract class MultiplicationData<E> {
    private final E left;
    private final E right;

    public MultiplicationData(E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft() {
        return left;
    }

    public E getRight() {
        return right;
    }
}
