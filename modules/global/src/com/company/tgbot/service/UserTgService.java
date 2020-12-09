package com.company.tgbot.service;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface UserTgService {
    String NAME = "tgbot_UserTgService";

     void createUser(Message update);




}
