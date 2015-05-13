public NodeC convertTtoBT (char[] values) {
    char xx = values[0];
    NodeC n = new NodeC(xx);
    Stack<NodeC> a =  new Stack<NodeC>();
    for (int i = 1; i < values.length; i += 2) {
        if (values[i] == '?') {
            n.left = new NodeC (values[i + 1]);
            a.add(n);
            n = n.left;

        }
        else if (values[i] == ':') {
            n = a.pop();
            while (n.right != null) {
                n = a.pop();
            }             
            n.right = new NodeC (values[i + 1]);
            a.add(n);
            n = n.right;
        }
    }
    return n;
}