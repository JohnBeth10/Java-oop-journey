class Arithmetic_Operation {
    public static void main(String a[]) {
        int num1 =5;
        int num2 =3;
        
        
        int sum =(num1+num2);
        int difference =(num1-num2);
        int product=(num1*num2);
        int quotient=(num1/num2);
        int remainder=(num1%num2);

        System.out.println("sum = "+sum);
        System.out.println("difference = "+difference);
        System.out.println("quotient = "+quotient);
        System.out.println("product = "+product);
        System.out.println("remainder = "+remainder);


        // pre-increment

        int pre = ++num1; // First increment then assign
        System.out.println("pre-increment = "+pre);


        // post-increment

        int post = ++num1; // First assign then increment
        System.out.println("post-increment = "+post);


    }
}