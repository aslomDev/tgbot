package com.company.tgbot.web.screens.queryresult;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.core.entity.QueryResult;

@UiController("sys$QueryResult.edit")
@UiDescriptor("query-result-edit.xml")
@EditedEntityContainer("queryResultDc")
@LoadDataBeforeShow
public class QueryResultEdit extends StandardEditor<QueryResult> {
}