class MathOperations {
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Multiply 2 numbers: " + math.multiply(3, 4));
        System.out.println("Multiply 3 numbers: " + math.multiply(3, 4, 5));
    }
}
