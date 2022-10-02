// Washing machine console programming

import java.io.*;

class A {

    static {
        System.out.println("Switched on.....");
    }
    static int clt, flag;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void quick() throws IOException {

        int w, a, t;
        System.out.println("Enter the no.of clothes to be washed");
        clt = Integer.parseInt(br.readLine());
        w = clt * 2;
        System.out.println("Amount of water needed in liters is " + w);
        System.out.println("Temperature= 30");
        System.out.println("To continue washing press 1.....");
        a = Integer.parseInt(br.readLine());
        if (a == 1) {
            t = clt * 1;
            System.out.println("Time required is " + t + " minutes.......");
            System.out.println("Washing started......");
            for (int j = 0; j < 5; j++) {
                System.out.println(".");
            }
            System.out.println("Washing finished.....");
        } else {
            System.out.println("Washing stopped clothes not found......");
        }
    }

    void cotton() throws IOException {

        int w, a;
        double temp, t;
        System.out.println("Enter the no.of clothes to be washed");
        clt = Integer.parseInt(br.readLine());
        w = clt * 2;
        System.out.println("Set the temperature");
        temp = Integer.parseInt(br.readLine());
        System.out.println("Amount of water needed in liters is " + w);
        System.out.println("To continue washing press 1.....");
        a = Integer.parseInt(br.readLine());
        if (a == 1) {
            t = clt * 3.33;
            System.out.println("Time required is " + t + " minutes.......");
            System.out.println("Washing started......");
            for (int j = 0; j < 5; j++) {
                System.out.println(".");
            }
            System.out.println("Washing finished.....");
        } else {
            System.out.println("Washing stopped clothes not found......");
        }

    }

    void wool() throws IOException {

        int w, a;
        double t;
        System.out.println("Enter the no.of clothes to be washed");
        clt = Integer.parseInt(br.readLine());
        w = clt * 3;
        System.out.println("Amount of water needed in liters is " + w);
        System.out.println("Temperature= 40");
        System.out.println("To continue washing press 1.....");
        a = Integer.parseInt(br.readLine());
        if (a == 1) {
            t = clt * 4.33;
            System.out.println("Time required is " + t + " minutes.......");
            System.out.println("Washing started......");
            for (int j = 0; j < 5; j++) {
                System.out.println(".");
            }
            System.out.println("Washing finished.....");
        } else {
            System.out.println("Washing stopped clothes not found......");
        }

    }

    void mix() throws IOException {

        int w, a;
        double t, temp;
        System.out.println("Enter the no.of clothes to be washed");
        clt = Integer.parseInt(br.readLine());
        w = clt * 2;
        System.out.println("Set the temperature");
        temp = Integer.parseInt(br.readLine());
        System.out.println("Amount of water needed in liters is " + w);
        System.out.println("To continue washing press 1.....");
        a = Integer.parseInt(br.readLine());
        if (a == 1) {
            t = clt * 5.33;
            System.out.println("Time required is " + t + " minutes.......");
            System.out.println("Washing started......");
            for (int j = 0; j < 5; j++) {
                System.out.println(".");
            }
            System.out.println("Washing finished.....");
        } else {
            System.out.println("Washing stopped clothes not found......");
        }

    }

    void off() {
        System.out.println("Switched off.....");
    }
}

class B extends A {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void spin() throws IOException {
        int t, a;
        if (A.clt != 0) {
            if (flag == 1) {
                t = 2 * A.clt;
                System.out.println("Time required for spinning is " + t + " minutes......");
                System.out.println("To continue press 1.....");
                a = Integer.parseInt(br.readLine());
                if (a == 1) {
                    System.out.println("Spinning started......");
                    for (int j = 0; j < 5; j++) {
                        System.out.println(".");
                    }
                    System.out.println("Spinning completed....");
                } else {
                    System.out.println("Spinning stopped.....");
                }

            } else {
                System.out.println("Clothes are not rinsed");
            }
        } else {
            System.out.println("No clothes found...");
        }

    }

    void rinse() throws IOException {
        int t, a;
        if (A.clt != 0) {
            t = 1 * A.clt;
            System.out.println("Time required for rinse is " + t + " minutes......");
            System.out.println("To continue press 1.....");
            a = Integer.parseInt(br.readLine());
            if (a == 1) {
                System.out.println("Rinse started......");
                for (int j = 0; j < 5; j++) {
                    System.out.println(".");
                }
                System.out.println("Rinse completed....");
                flag = 1;
            } else {
                System.out.println("Rinse stopped.....");
            }
        } else {
            System.out.println("No clothes found...");
        }
    }
}

class washing_machine {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        B ob = new B();
        int ch;
        while (true) {
            System.out.println("|-----------------------------------|");
            System.out.println("| 1.Washing           2.Rinse       |");
            System.out.println("| 3.Spinning          4.Switch off  |");
            System.out.println("|-----------------------------------|");
            System.out.println("Enter your choice");
            ch = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1: {
                    int ch1;
                    System.out.println("Which type of clothes do you want to wash?");
                    System.out.println("|-----------------------------------|");
                    System.out.println("| 1.Quick Wash           2.Cottons  |");
                    System.out.println("| 3.Wool                 4.Mix load |");
                    System.out.println("| 5.Switch off                      |");
                    System.out.println("|-----------------------------------|");
                    System.out.println("Select your choice");
                    ch1 = Integer.parseInt(br.readLine());
                    switch (ch1) {
                        case 1:
                            ob.quick();
                            break;
                        case 2:
                            ob.cotton();
                            break;
                        case 3:
                            ob.wool();
                            break;
                        case 4:
                            ob.mix();
                            break;
                        case 5:
                            ob.off();
                            System.exit(0);
                        default:
                            System.out.println("Wrong choice");
                    }
                    break;
                }
                case 2: {
                    ob.rinse();
                    break;
                }
                case 3: {
                    ob.spin();
                    break;
                }
                case 4:
                    ob.off();
                    System.exit(0);
                default:
                    System.out.println("Wrong option please enter correct option");
            }
        }
    }
}
