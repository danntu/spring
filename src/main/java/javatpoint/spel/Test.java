package javatpoint.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Expression expression = parser.parseExpression("'Hello SPEL'");
        String message = (String) expression.getValue();
        System.out.println(message);

        expression = parser.parseExpression("'Welcome SPEL'.concat('!')");
        message = (String) expression.getValue();
        System.out.println(message);

        expression = parser.parseExpression("'Hello World'.bytes");
        byte[] bytes = (byte[]) expression.getValue();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
        System.out.println();
        Expression exp = parser.parseExpression("'Hello World'.bytes.length");
        int length = (Integer) exp.getValue();
        System.out.println(length);

        exp = parser.parseExpression("new String('hello world').toUpperCase()");
        message = exp.getValue(String.class);
        System.out.println(message);
//OR
        System.out.println(parser.parseExpression("'hello world'.toUpperCase()").getValue());
    }
}
