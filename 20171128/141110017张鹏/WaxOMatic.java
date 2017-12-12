package concurrency.waxomatic;



import java.util.concurrent.*;



import static net.mindview.util.Print.*;



public class WaxOMatic {

    public static void main(String[] args) throws Exception {

        Car car = new Car();

        ExecutorService exec = Executors.newCachedThreadPool();

        exec.execute(new WaxOff(car));

        exec.execute(new WaxOn1(car));

        exec.execute(new WaxOn2(car)); 

        TimeUnit.SECONDS.sleep(10); // Run for a while...

        exec.shutdownNow(); // Interrupt all tasks

    }

}

class Car {

    private boolean waxOn = false;



    public synchronized void waxed() {

        waxOn = true; // Ready to buff

        notifyAll();

    }



    public synchronized void buffed() {

        waxOn = false; // Ready for another coat of wax

        notifyAll();

    }



    public synchronized void waitForWaxing()

            throws InterruptedException {

        while (waxOn == false)

            wait();

    }



    public synchronized void waitForBuffing()

            throws InterruptedException {

        while (waxOn == true)

            wait();

    }

}



class WaxOn1 implements Runnable {

    private Car car1;



    public WaxOn1(Car c) {

        car1 = c;

    }



    public void run() {
        synchronized(car1)
        {
        try {

            while (!Thread.interrupted()) {

                printnb("WaxOn1:Wax On! \n");

                TimeUnit.MILLISECONDS.sleep(200);

                car1.waxed();

                car1.waitForBuffing();

            }

        } catch (InterruptedException e) {

            print("Exiting via interrupt");

        }

        print("Ending Wax On task");

    }

}


class WaxOn2 implements Runnable {

    private Car car2;



    public WaxOn1(Car c) {

        car2 = c;

    }



    public synchronized void run() {
        synchronized(car2)
        {
        try {

            while (!Thread.interrupted()) {

                printnb("WaxOn2:Wax On! \n");

                TimeUnit.MILLISECONDS.sleep(200);

                car2.waxed();

                car2.waitForBuffing();

            }

        } catch (InterruptedException e) {

            print("Exiting via interrupt");

        }

        print("Ending Wax On task");

    }

}


class WaxOff implements Runnable {

    private Car car;



    public WaxOff(Car c) {

        car = c;

    }



    public void run() {

        try {

            while (!Thread.interrupted()) {

                car.waitForWaxing();

                printnb("Wax Off!\n ");

                TimeUnit.MILLISECONDS.sleep(200);

                car.buffed();

            }

        } catch (InterruptedException e) {

            print("Exiting via interrupt");

        }

        print("Ending Wax Off task");

    }

}



