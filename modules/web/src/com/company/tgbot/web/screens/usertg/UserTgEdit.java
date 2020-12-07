package com.company.tgbot.web.screens.usertg;

import com.company.tgbot.tgConfig.MyTelegramBot;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.global.CommitContext;
import com.haulmont.cuba.gui.components.HasContextHelp;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.tgbot.entity.UserTg;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import javax.inject.Inject;
import java.util.Set;

@UiController("tgbot_UserTg.edit")
@UiDescriptor("user-tg-edit.xml")
@EditedEntityContainer("userTgDc")
@LoadDataBeforeShow
public class UserTgEdit extends StandardEditor<UserTg> {
//    @Inject
//    private final MyTelegramBot myTelegramBot;
//    public UserTgEdit(MyTelegramBot myTelegramBot) {
//        this.myTelegramBot = myTelegramBot;
//    }
//
//

    @Inject
    MyTelegramBot myTelegramBot;
    @Inject
    private TextField<String> messageField;
    @Inject
    private TextField<String> userIdField;


    @Subscribe(target = Target.DATA_CONTEXT)
    public void onPostCommit(DataContext.PostCommitEvent event) {
        SendMessage sendMessage = new SendMessage();
       String msg = String.valueOf(messageField);
       sendMessage.setChatId(userIdField.getId());
       sendMessage.setText(msg);

        myTelegramBot.message(sendMessage);
    }

    @Subscribe("messageField")
    public void onMessageFieldValueChange(HasValue.ValueChangeEvent<String> event) {

        SendMessage sendMessage = new SendMessage();
        String msg = String.valueOf(messageField);
        sendMessage.setChatId(userIdField.getId());
        sendMessage.setText(msg);

        myTelegramBot.message(sendMessage);
    }

    @Subscribe
    public void onInitEntity(InitEntityEvent<UserTg> event) {
        SendMessage sendMessage = new SendMessage();
        String msg = String.valueOf(messageField);
        sendMessage.setChatId(userIdField.getId());
        sendMessage.setText(msg);

        myTelegramBot.message(sendMessage);
    }



 

 


}