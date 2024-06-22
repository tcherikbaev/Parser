public class Token {

    enum Type
    {
        NUMBER,PLUS,MINUS,DIVIDE,MULTIPLY,LPAREN,RPAREN,
    }
    public final Type type;
    public final String value;

    public Token(Type type, String value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Token{" +
               "type=" + type +
               ", value='" + value + '\'' +
               '}';
    }
}
