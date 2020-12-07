package com.company.tgbot.tgConfig;

import com.company.tgbot.service.UserTgService;
import com.haulmont.cuba.core.global.CommitContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.inject.Inject;

@Component
public class MyTelegramBot extends TelegramLongPollingBot {

//    private String botUserName;
//    private String botToken;

    @Autowired
    private UserTgService userTgService;



    @Override
    public void onUpdateReceived(Update update) {


           if (update.hasMessage()){
               Message message = update.getMessage();
               Long id = message.getChatId();
               SendMessage sendMessage = new SendMessage();
               sendMessage.setChatId(String.valueOf(id));
               sendMessage.setText("salom");
               try {
                   execute(sendMessage);
                   userTgService.createUser(update);
               } catch (TelegramApiException e) {
                   e.printStackTrace();
               }
           }



    }



//    public MyTelegramBot(DefaultBotOptions botOptions) {
//        super(botOptions);
//    }

//    public MyTelegramBot(DefaultBotOptions options) {
//        super(options);
//    }

    @Override
    public String getBotUsername() {
        return "lolMessagBot";
    }

    @Override
    public String getBotToken() {
        return "1487031714:AAHetBYdfukPU3k4KbE-eVGOdEJnKNQE8uQ";
    }

    public void message(SendMessage sendMessage){

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

//    public String getBotUserName() {
//        return botUserName;
//    }
//
//    public void setBotUserName(String botUserName) {
//        this.botUserName = botUserName;
//    }
//
//    public void setBotToken(String botToken) {
//        this.botToken = botToken;
//    }
}
