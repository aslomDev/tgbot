package com.company.tgbot.web.screens.queryresult;

import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.core.entity.QueryResult;

@UiController("sys$QueryResult.browse")
@UiDescriptor("query-result-browse.xml")
@LookupComponent("queryResultsTable")
@LoadDataBeforeShow
public class QueryResultBrowse extends StandardLookup<QueryResult> {
}