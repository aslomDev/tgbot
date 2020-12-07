package com.company.tgbot.tgConfig;
import com.haulmont.cuba.core.sys.AppContext;
import org.springframework.stereotype.Component;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Component
public class TelegramBotComponent {



    @PostConstruct
    protected void init() throws IOException{


        AppContext.isStarted();


    }





}
