import java.util.Random;

public class SellThread implements Runnable {
    static Integer asiento;
    static boolean cont = true;
    //Constructor
    public SellThread() {
    }

    //Bucle que suma a la i de main 1 5000 veces
    @Override
    public void run() {
     comprar(new Random().nextInt(5) +1 );

    }

    private static synchronized void comprar(Integer numEntradas) {
        System.out.println("entradas:"+ numEntradas);
        for (int i = 0; i < numEntradas+1 ; i++) {
            cont = true;
            while (cont){
                asiento=  new Random().nextInt(99) +1 ;
                if (main.entradas.get(asiento) == 0){
                    main.entradas.set(asiento,main.entradas.get(asiento)+1) ;
                    cont= false;

                }
            }

        }



    }
}