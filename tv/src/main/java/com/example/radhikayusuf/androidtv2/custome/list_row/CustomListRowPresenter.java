package com.example.radhikayusuf.androidtv2.custome.list_row;

import android.support.v17.leanback.widget.ListRowPresenter;
import android.support.v17.leanback.widget.RowPresenter;

/**
 * @author radhikayusuf.
 */

public class CustomListRowPresenter extends ListRowPresenter {

    public CustomListRowPresenter() {
        super();
    }

    @Override
    protected void onBindRowViewHolder(RowPresenter.ViewHolder holder, Object item) {
        int numRows = ((CustomListRow) item).getmNumRows();
        ((ListRowPresenter.ViewHolder) holder).getGridView().setNumRows(numRows);
        super.onBindRowViewHolder(holder, item);
    }

    @Override
    protected void initializeRowViewHolder(RowPresenter.ViewHolder holder) {
        super.initializeRowViewHolder(holder);
    }
}
