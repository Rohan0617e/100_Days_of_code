class second {
    int a = 10; // instance variable
    static double b = 25.5;

    public static void main(String[] args) {

        boolean c = true; // local var

        second s = new second();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s.a+" "+b+" "+c);
    }
}