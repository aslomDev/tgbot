package com.company.tgbot.service;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface UserTgService {
    String NAME = "tgbot_UserTgService";

     void createUser(Update update);




}