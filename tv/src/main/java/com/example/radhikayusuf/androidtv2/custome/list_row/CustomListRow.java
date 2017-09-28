package com.example.radhikayusuf.androidtv2.custome.list_row;

import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.ObjectAdapter;

/**
 * @author radhikayusuf.
 */

public class CustomListRow extends ListRow {

    private int mNumRows = 1;

    public CustomListRow(HeaderItem header, ObjectAdapter adapter) {
        super(header, adapter);
    }

    public CustomListRow(long id, HeaderItem header, ObjectAdapter adapter) {
        super(id, header, adapter);
    }

    public CustomListRow(ObjectAdapter adapter) {
        super(adapter);
    }

    public int getmNumRows() {
        return mNumRows;
    }

    public void setmNumRows(int mNumRows) {
        this.mNumRows = mNumRows;
    }
}
