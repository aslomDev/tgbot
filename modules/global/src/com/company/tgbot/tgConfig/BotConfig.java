//package com.company.tgbot.tgConfig;
//
//
//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.telegram.telegrambots.bots.DefaultBotOptions;
//import org.telegram.telegrambots.meta.ApiContext;
//
//
//@Configuration
//@ConfigurationProperties(prefix = "telegrambot")
//public class BotConfig {
//    private String botUserName;
//    private String botToken;
//
//
//    @Bean
//    public MyTelegramBot MySuperTelegramBot() {
//        DefaultBotOptions options = ApiContext
//                .getInstance(DefaultBotOptions.class);
//
//        MyTelegramBot mySuperTelegramBot = new MyTelegramBot(options);
////        mySuperTelegramBot.setBotUserName(botUserName);
////        mySuperTelegramBot.setBotToken(botToken);
//
//        return mySuperTelegramBot;
//    }
//
////
////    public String getBotUserName() {
////        return botUserName;
////    }
////
////    public void setBotUserName(String botUserName) {
////        this.botUserName = botUserName;
////    }
////
////    public String getBotToken() {
////        return botToken;
////    }
////
////    public void setBotToken(String botToken) {
////        this.botToken = botToken;
////    }
//}
