class Logical_Operators {
    public static void main(String[] args){

        int a = 8;
        int b = 7;
        int c = 8;
        int d = 4;

        //OR
        System.out.println(a>b || c>d);

        //AND
        System.out.println(a<b && c>d);

        //NOT
        boolean result = a>b && c>=d;
        System.out.println(!result);
    }
}
