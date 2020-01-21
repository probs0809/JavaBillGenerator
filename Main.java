import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Industrial i = new Industrial(100000, "Some Industry co.");
        // i.getBill();

        // Domestic d = new Domestic(100000, "Prabodh ");
        // d.getBill();

        ArrayList<Industrial> indBills = new ArrayList<>();
        ArrayList<Domestic> domBills = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        
        System.out.println("Please set : \n 1 for industrial \n 2 for domestic ");
        int x = Integer.parseInt(s.nextLine());
        while (x == 1) {
            System.out.println("Please enter the name of the consumer");
            String name = s.nextLine();
            System.out.println("Please enter Total unit consumed");
            String unit = s.nextLine();
            indBills.add(new Industrial(Integer.parseInt(unit), name));
            System.out.println(" 0 print bills \n 1 Continue \n 2 Domestic");
            x = Integer.parseInt(s.nextLine());
        }

        while(x == 2) {
            System.out.println("Please enter the name of the consumer");
            String name = s.nextLine();
            System.out.println("Please enter Total unit consumed");
            String unit = s.nextLine();
            domBills.add(new Domestic(Integer.parseInt(unit), name));
            System.out.println(" 0 print bills \n 1 Industrial \n 2 Domestic");
            x = Integer.parseInt(s.nextLine());
        }
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");
        System.out.println("Type of User \t Name of User \t\t Consumed Units \t Free Units \t Rate Per Unit \t Fixed Rent \t Sub Chargeable Limit \t Sub Charge \t Total Bill");
        System.out.println("____________________________________________________________________________________________________________________________________________________________________________________");

        while (x == 0) {
            for (int i = 0; i < indBills.size(); i++) {
                indBills.get(i).getBill();
            }

            for (int i = 0; i < domBills.size(); i++) {
                domBills.get(i).getBill();
            }
            break;
        }

    }
    
}