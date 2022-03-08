import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main{
    public static List<Integer> entradas = new ArrayList<>(Collections.nCopies(100,0));


    public static void main(String[] args) throws InterruptedException {

        // Declaración de los objetos
        SellThread r1 = new SellThread();
        SellThread r2 = new SellThread();
        SellThread r3 = new SellThread();
        SellThread r4 = new SellThread();
        SellThread r5 = new SellThread();
        SellThread r6 = new SellThread();
        SellThread r7 = new SellThread();
        SellThread r8 = new SellThread();
        SellThread r9 = new SellThread();
        SellThread r10 = new SellThread();

        // Crear los threads
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        Thread t5 = new Thread(r5);
        Thread t6 = new Thread(r6);
        Thread t7 = new Thread(r7);
        Thread t8= new Thread(r8);
        Thread t9 = new Thread(r9);
        Thread t10 = new Thread(r10);


        // Inicializar los threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        //Esperar a que acaben todos los threads antes de mostrar el resultado de i
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
        }catch (Exception e){

        }
        //mostrar por pantalla i
        entradas.forEach( entrada -> {
            if (entrada != 0){
                System.out.println(entrada);
            }
        });

    }
}
