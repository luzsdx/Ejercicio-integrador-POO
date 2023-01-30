/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPOO;

/**
 *
 * @author luzsd
 */
public class Principal {
    public static void main(String[] args){
        Postnet postnet=new Postnet();
        Persona p= new Persona ("41250927", "luz", "britez", "3704999", "luz@gmail.com");
        TarjetaDeCredito t= new TarjetaDeCredito("galicia", "1234567890123456", 12333, EntidadFinanciera.BIRZA, p);
        
        System.out.println(" Tarjeta antes del pago");
        System.out.println(t);
        Ticket ticketGenerado=postnet.efectuarPago(t, 2000, 5);
        System.out.println("ticket tras pagar...");
                
        System.out.println(ticketGenerado);
                        
        System.out.println("tarjeta después del pago");
        System.out.println(t);
        
    }
}
