package com.company.tgbot.service;

import com.company.tgbot.entity.UserTg;
import com.company.tgbot.tgConfig.MyTelegramBot;
import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.Persistence;
import com.haulmont.cuba.core.Transaction;
import com.haulmont.cuba.core.global.Metadata;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import javax.inject.Inject;

@Service(UserTgService.NAME)
public class UserTgServiceBean implements UserTgService {

    @Inject private Persistence persistence;
    @Inject private Metadata metadata;

    public void createUser(Update update){
        Transaction tx = persistence.createTransaction();

        try {
        EntityManager em = persistence.getEntityManager();
        UserTg userTg = metadata.create(UserTg.class);
        userTg.setUserId(update.getMessage().getFrom().getId());
        userTg.setMessage(update.getMessage().getText());
        em.persist(userTg);
        tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.end();
    }
}
