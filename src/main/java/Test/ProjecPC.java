/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Test;
import com.mycompany.projecpc.*;

/**
 *
 * @author ferca
 */
public class ProjecPC {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Monitor mon1 = new Monitor ("DELL", 14.3);
        Teclado tec1 = new Teclado ("Bluetooh", "DELL");
        Raton rat1 = new Raton ("Bluetooh", "DELL");
        
        Monitor mon2 = new Monitor ("Lenovo", 21.3);
        Teclado tec2 = new Teclado ("USB", "Lenovo");
        Raton rat2 = new Raton ("USB", "Lenovo");
        
        
        
        Computadora pc1 = new Computadora("XPS", mon1, tec1, rat1);
        Computadora pc2 = new Computadora("VOSTRO", mon2, tec1, rat2);
        Computadora pc3 = new Computadora("DANGER", mon1, tec2, rat1);
        
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(pc3);
        orden1.agregarComputadora(pc1);
        orden1.agregarComputadora(pc2);
        
        orden1.mostrarOrden();
        orden1.agregarComputadora(pc2);
        orden1.agregarComputadora(pc2);
        
    }
}
