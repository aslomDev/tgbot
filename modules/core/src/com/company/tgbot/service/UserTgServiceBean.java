package com.company.tgbot.service;

import com.company.tgbot.entity.UserTg;
import com.company.tgbot.tgConfig.MyTelegramBot;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.Metadata;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import javax.inject.Inject;
import org.telegram.telegrambots.meta.api.objects.Message;

@Service(UserTgService.NAME)
public class UserTgServiceBean implements UserTgService {

    @Inject private Persistence persistence;
    @Inject private Metadata metadata;
    @Inject private Logger log;

    public void createUser(Message message){
        Transaction tx = persistence.createTransaction();
        try {
            EntityManager em = persistence.getEntityManager();
            UserTg userTg = metadata.create(UserTg.class);
            userTg.setUserId(message.getFrom().getId());
            userTg.setMessage(message.getText());
            em.persist(userTg);
            tx.commit();
        } catch (Exception e) {
            log.error("Error", e);
        }
        tx.end();
    }
}
