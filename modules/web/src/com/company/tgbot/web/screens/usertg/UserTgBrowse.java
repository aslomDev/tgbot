package com.company.tgbot.web.screens.usertg;

import com.haulmont.cuba.gui.screen.*;
import com.company.tgbot.entity.UserTg;

@UiController("tgbot_UserTg.browse")
@UiDescriptor("user-tg-browse.xml")
@LookupComponent("userTgsTable")
@LoadDataBeforeShow
public class UserTgBrowse extends StandardLookup<UserTg> {
}