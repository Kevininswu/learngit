import java.util.concurrent.FutureTask;

public class threadtest {

static  Object lock = new Object();
static int grass =1;


    static final Thread mythread1  =new Thread( new Runnable(){
        @Override
        public void run(){
            while (true){
                synchronized (lock){
                    if (grass<=10){

                        System.out.println(Thread.currentThread().getName()
                                +"抢到第"+grass+"根萝卜");
                        grass++;

                    }else {
                        break;
                    }

                }

            }

        }
    });
    static final Thread mythread2  =new Thread( new Runnable(){
        @Override
        public void run(){
            while (true){
                synchronized (lock){
                    if (grass<=10){

                        System.out.println(Thread.currentThread().getName()
                                +"抢到第"+grass+"根萝卜");
                        grass++;
                        try {
                            mythread1.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        break;
                    }

                }

            }

        }
    });
    static final Thread mythread3  =new Thread( new Runnable(){
        @Override
        public void run(){
            while (true){
                synchronized (lock){
                    if (grass<=10){

                        System.out.println(Thread.currentThread().getName()
                                +"抢到第"+grass+"根萝卜");
                        grass++;
                        try {
                            mythread2.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }else {
                        break;
                    }

                }

            }

        }
    });
    public static void main(String[] args) throws InterruptedException {
      mythread1.start();
      mythread2.start();
      mythread3.start();




    }
}

