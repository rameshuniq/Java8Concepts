package java8concepts;

//With anonymous inner class
class AnonInnerclassvsLamdaExpression {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                }
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread");
        }

    }

}

class WithLambda {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        });
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
