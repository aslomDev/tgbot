package com.company.tgbot.core;

import com.company.tgbot.tgConfig.MyTelegramBot;
import com.haulmont.cuba.core.global.Events;
import com.haulmont.cuba.core.sys.AppContext;
import com.haulmont.cuba.core.sys.events.AppContextInitializedEvent;
import com.haulmont.cuba.core.sys.events.AppContextStartedEvent;
import com.haulmont.cuba.core.sys.events.AppContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component(TelegramBean.NAME)
public class TelegramBean {
    public static final String NAME = "tgbot_TelegramBean";

//    @EventListener(AppContextInitializedEvent.class)


//    @Order(Events.LOWEST_PLATFORM_PRECEDENCE + 100)
//    protected void appInitialized() {
//        System.out.println("Initialized");
//    }

//    // event type is defined by method parameter
//    @EventListener
//    protected MyTelegramBot appStarted(AppContextStartedEvent event) {
//
//
//        try {
//            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
//            telegramBotsApi.registerBot(new MyTelegramBot());
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

//    @EventListener
//    protected void appStopped(AppContextStoppedEvent event) {
//        System.out.println("Stopped");
//    }
//
//    @PostConstruct
//    protected void init() throws IOException{
//
//
//        AppContext.isStarted();
//
//
//    }
}
