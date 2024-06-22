import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Token> tokens=Lexer.getHardcodedTokens();
        Parser parser=new Parser(tokens);
        ASTNode root=parser.parse();
        root.print(" ");

    }
}