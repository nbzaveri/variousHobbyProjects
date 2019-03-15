package pluralsight_java8;

public class RunnableExample {

    public static void main(String[] args){

        Runnable runnable = getRunnableOldWay();
        System.out.println("Runnable using old Way");
        threadRunner(runnable);

        Runnable newRunable = getRunnableJava8Way();
        System.out.println("Runnable using Java8 lambda");
        threadRunner(newRunable);
    }

    private static Runnable getRunnableJava8Way(){
        return () -> {
            for (int i=0; i <3; i++){
                System.out.println("Hello World from Thread ["
                        + Thread.currentThread().getName()
                        + "]");
            }
        };
    }

    private static Runnable getRunnableOldWay() {
        return new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i <3; i++){
                        System.out.println("Hello World from Thread ["
                                + Thread.currentThread().getName()
                                + "]");
                    }
                }
            };
    }

    private static void threadRunner(Runnable runnable) {
        Thread t = new Thread(runnable);
        t.start();
    }
}
