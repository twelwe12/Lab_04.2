void main(){
    Scanner sc = new Scanner(System.in);
    double x, xp, xk, dx, A, B, y = 0;

    System.out.print("xp = ");
    xp = sc.nextInt();

    System.out.print("xk = ");
    xk = sc.nextInt();

    System.out.print("dx = ");
    dx = sc.nextInt();

    System.out.println("+-------+----------------------+");
    System.out.println("|   x   |           y          |");
    System.out.println("+-------+----------------------+");

    for (x = xp; x < xk; x += dx) {
        A = 13.5 - 2 * x;

        if (x <= -1) {
            B = Math.exp(0.4 + x);
        } else if (x < 1) {
            B = 1 - Math.pow(Math.sin(x), 2);
        } else {
            B = Math.cos(x) / Math.pow(Math.sin(x), 2);
        }

        y = A - B;
        System.out.printf("| %5.1f | %20.10f |%n", x, y);
        System.out.println("+-------+----------------------+");
    }
}
