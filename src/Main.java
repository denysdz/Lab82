public class Main {

    public static void main(String[] args) {
        String input = "12 + 24"; // Приклад вводу
        Expression expression = parseExpression(input);
        System.out.println(input + " = " + expression.interpret());
        input = "30 - 12";
        expression = parseExpression(input);
        System.out.println(input + " = " + expression.interpret());
    }


    public static Expression parseExpression(String str) {
        String[] tokens = str.split(" ");
        switch (tokens[1]) {
            case "+":
                return new AddExpression(new NumberExpression(tokens[0]), new NumberExpression(tokens[2]));
            case "-":
                return new SubtractExpression(new NumberExpression(tokens[0]), new NumberExpression(tokens[2]));
            default:
                return null; // Непідтримуваний оператор
        }
    }


}