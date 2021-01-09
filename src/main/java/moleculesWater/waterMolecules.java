package moleculesWater;

import java.util.Scanner;

public class waterMolecules {

    public static void main(String[] args) {

        double m = 410e-24,l = 010,tedad;    // m = Weight of a molecule, l= Weight of one liter water.
        long w;    // w= Weight of one liter water that we will get in Scanner.

        System.out.print("Enter w:");

        w = (new Scanner(System.in).nextLong());
        tedad = (w * l) / m;  // tedad = Number of water molecules
        
        System.out.printf("Tedad = $1%s" + "\n", tedad);

    }

}