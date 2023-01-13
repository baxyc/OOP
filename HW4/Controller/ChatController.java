package HW4.Controller;

import java.util.Scanner;

import HW4.DataBase.TestDb.InitializerDb;
import HW4.Model.Infrastructure;
import HW4.Model.Input;
import HW4.Model.Entities.Chat;
import HW4.Model.Entities.User;
import HW4.View.Menu;

public class ChatController {
    Chat chat;
    Scanner scanner;
    Menu view;
    Input input;
    User user;
    Infrastructure infrastructure;
    InitializerDb db;

    public ChatController(Chat chat, Scanner scanner, Menu view, Input input, User user, Infrastructure infrastructure, InitializerDb db) {
       this.chat = chat;
       this.scanner = scanner;
       this.view = view;
       this.input = input;
       this.user = user;
       this.infrastructure = infrastructure;
       this.db = db;
    }
    
    public void startChat(){
        String startMessage = "Введите сообщение, для добавления пользователя введите @имяпользователя,\nдля выхода введите свой логин для выхода";
        view.showText(infrastructure.getAllMessagesFromChat(chat));
        view.showText(startMessage);
        while(true){
            String text = input.inputStringLine(scanner);
            if(text.toLowerCase().equals(user.getUserName().toLowerCase())) return;
            if(text.startsWith("@")){
                chat.addUser(db.getUserByName(text.replace("@", "")));
                db.setChatDb(chat);
            }
            if(text.isEmpty()) continue;
            String messageText = user.getUserName() + " >>> " + text;
            infrastructure.createMessage(user, chat, messageText);
            view.showText(infrastructure.getAllMessagesFromChat(chat));
            view.showText(startMessage);
        }
    }
}
