package cz.ladicek.expressionProblem.core;

public abstract class AdditionData<E> {
    private final E left;
    private final E right;

    public AdditionData(E left, E right) {
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
