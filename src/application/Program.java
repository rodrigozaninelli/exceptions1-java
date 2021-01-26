package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number: ");
        int number = teclado.nextInt();
        System.out.print("Check-in date: (dd/Mm/yyyy): ");
        Date checkIn = sdf.parse(teclado.next());
        System.out.print("Check-out date: (dd/Mm/yyyy): ");
        Date checkOut = sdf.parse(teclado.next());

        if(!checkOut.after(checkIn)){
            System.out.println("Error in Reservation: Check-out date must be after check-in date");
        }else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);


            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date: (dd/Mm/yyyy): ");
            checkIn = sdf.parse(teclado.next());
            System.out.print("Check-out date: (dd/Mm/yyyy): ");
            checkOut = sdf.parse(teclado.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if(error != null){
                System.out.println("Error in reservation: " + error);
            }
            else{
                System.out.println("Reservation: " + reservation);

            }
        }
    }
}
