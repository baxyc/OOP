package HW4.Test;

import java.util.Scanner;

import HW4.Controller.MenuController;
import HW4.DataBase.TestDb.InitializerDb;
import HW4.Model.Input;
import HW4.View.Menu;

public class test {
    public static void main(String[] args) {
        InitializerDb db = new InitializerDb();
        System.out.println(db.getAllChats().toString());
        // Menu menu = new Menu();
        // Scanner scanner = new Scanner(System.in, "Cp866");
        // Input input = new Input();

        // MenuController menuController = new MenuController(db, menu, scanner, input);
        // System.out.println(menuController.InitializationUser().toString());
    }
}
