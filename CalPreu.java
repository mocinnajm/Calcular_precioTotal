import java.util.Scanner;

public class CalPreu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double total = 0; 
        final double DESCUENTO = 0.06; 
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el precio del producto " + i + ": ");
            double precio = teclado.nextDouble();

            
            if (precio < 0) {
                System.out.println("Error: el precio no puede ser negativo.");
                i--; 
                
            }

            
            if (precio >= 50) {
                double precioConDescuento = precio - (precio * DESCUENTO);
                System.out.printf("El precio con descuento es: %.2f%n",( precioConDescuento));
                total += precioConDescuento; 
            } else {
                System.out.println("No tienes descuento en este producto.");
                total += precio; // Sumar precio sin descuento al total
            }
        }

        // Mostrar el total de los precios
        System.out.printf("El total de los precios es: %.2f%n", total);
        teclado.close();
    }
}
