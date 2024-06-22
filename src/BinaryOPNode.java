public class BinaryOPNode extends ASTNode {
    ASTNode left;
    ASTNode right;

    Token operationToken;

    public BinaryOPNode(ASTNode left, ASTNode right, Token operationToken) {
        this.left = left;
        this.right = right;
        this.operationToken = operationToken;
    }


    public void print(String indent)
    {
        System.out.println(indent+"Op{" +operationToken.value+"}");
        left.print(indent+indent);
        right.print(indent+indent);
    }
}
