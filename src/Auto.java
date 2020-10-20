public class Auto {

     String merk = "Toyota";
    int snelheid = 0;
     int kilometerstand = 23000;


       public static void main(String[] args){
           Auto auto1 = new Auto();
auto1.start();
auto1.stop();
auto1.geefGas();
           System.out.println("de kilometerstand is " +  auto1.kilometerstand );

    }

    void geefGas() {
        System.out.println("de "  +merk+  " rijdt.");
    }

    void stop() {
        System.out.println("de "  +merk+  " stopt.");
    }

    void start() {
        System.out.println("de " +  merk + " start.");
    }


}

