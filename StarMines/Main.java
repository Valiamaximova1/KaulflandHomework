package StarMines;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] sizes = scan.nextLine().split(",");
        Table table = new Table(Integer.parseInt(sizes[0]), Integer.parseInt(sizes[1]));

        String command = scan.nextLine();
        while (!command.equals("GAME OVER")) {

            String[] takeDamage = command.split(",");
            table.attackingCell(Integer.parseInt(takeDamage[0]),
                    Integer.parseInt(takeDamage[1]),
                    Integer.parseInt(takeDamage[2]));
            command = scan.nextLine();
        }
        table.printTable();
    }
}
