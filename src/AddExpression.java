class AddExpression implements Expression {
    private Expression firstOperand;
    private Expression secondOperand;

    public AddExpression(Expression firstOperand, Expression secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    @Override
    public int interpret() {
        return firstOperand.interpret() + secondOperand.interpret();
    }
}
