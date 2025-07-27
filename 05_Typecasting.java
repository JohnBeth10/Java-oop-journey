class Typecasting {
    public static void main(String a[]) {
        int num = 9;
        

        //converting into double
        long num_long = (long)num;
        System.out.println(num_long);

         //converting into byte
        byte num_byte = (byte)num;
        System.out.println(num_byte);

        float ft_num = 5.67f;

        //converting into int
        int ft_int = (int)ft_num;
        System.out.println(ft_int);

        //type promotion
        byte num2 = 100;
        byte num3 = 20;

        int result = num2*num3;
        System.out.println(result);


    }
}
