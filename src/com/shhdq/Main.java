package com.shhdq;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        // dblogic
        DBlogic dblogic = new DBlogic();
        // scann
        Scanner scann = new Scanner(System.in);

        // main play
        while(true) {
            System.out.println("Ko Tu velies darit? (i) ievadit datus, (d) dzest datus, (u) atjaunot datus, (s) apskatit datus");
            String user_choice = scann.nextLine();

            if(user_choice.equals("i")) {
                // insert
                System.out.println("Ievadi datus: ");
                String insert_data = scann.nextLine();

                dblogic.insert(insert_data);
                System.out.println(insert_data + " veiksmigi ievadits!");
            } else if(user_choice.equals("d")) {
                // delete
                System.out.println("Ievadi rindas ID, kuru velies izdzest:  ");
                int delete_data = scann.nextInt();

                dblogic.delete(delete_data);
                System.out.println(delete_data + " veiksmigi izdzests!");
            } else if(user_choice.equals("u")) {
                // update
                System.out.println("Ievadi rindas ID, kuru velies atjaunot:  ");
                int update_data = scann.nextInt();

                System.out.println("Ievadi tekstu:  ");
                String text_data = scann.nextLine();

                dblogic.update(update_data, text_data);
                System.out.println(update_data + " veiksmigi atjaunoti ar so: " + text_data);

            } else if(user_choice.equals("s")) {
                // select
                dblogic.select();
            } else {
                // else
                System.out.println("Atvaino si darbiba nav iespejama");
                break;
            }
        }
    }
}
