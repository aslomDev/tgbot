package com.company.tgbot.core;

import com.company.tgbot.tgConfig.MyTelegramBot;
import com.haulmont.cuba.core.global.Events;
import com.haulmont.cuba.core.sys.events.AppContextInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.BotSession;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Component(AppLifecycleBean.NAME)
public class AppLifecycleBean {
    public static final String NAME = "tgbot_AppLifecycleBean";

    @Inject private Logger log;

    // event type is defined by annotation parameter
    @EventListener(AppContextInitializedEvent.class)
    // run after all platform listeners
    @Order(Events.LOWEST_PLATFORM_PRECEDENCE + 100)
    public void appInitialized() {
        log.info("Initialized");

        try {
//            DefaultBotSession botSession = new DefaultBotSession();

            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            BotSession session = telegramBotsApi.registerBot(new MyTelegramBot(
                    "lolMessagBot",
                    "1487031714:AAHaJ8OGUOpDycK0Mq-Z4vNQjN_58DYcGmE"));
//            telegramBotsApi.registerBot(new MyTelegramBot());
        } catch (TelegramApiException e) {
            log.error("Error", e);
        }
    }
}
