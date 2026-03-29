package org.skillbrain.web.scripts;

import java.time.Duration;

public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Start...");
        String s = "";
        try {
            Thread.sleep(Duration.ofSeconds(5).toMillis());

            throw new InterruptedException("oops...");

        } catch (InterruptedException e) {
            e.printStackTrace();
//            System.out.println("Something went wrong, trying to recover...");
        }
        finally {
            System.out.println("Ending...");
        }

//        System.out.println("Ending...");
    }
}

