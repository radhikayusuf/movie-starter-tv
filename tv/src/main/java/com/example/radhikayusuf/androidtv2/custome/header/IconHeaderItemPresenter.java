package com.example.radhikayusuf.androidtv2.custome.header;

import android.content.Context;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.Presenter;
import android.support.v17.leanback.widget.RowHeaderPresenter;
import android.support.v17.leanback.widget.RowHeaderView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.radhikayusuf.androidtv2.R;

/**
 * @author radhikayusuf.
 */

public class IconHeaderItemPresenter extends RowHeaderPresenter{
    private static final String TAG = IconHeaderItemPresenter.class.getSimpleName();

    private float mUnselectedAlpha;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        mUnselectedAlpha = viewGroup.getResources()
                .getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1);
        LayoutInflater inflater = (LayoutInflater) viewGroup.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.custom_header_item, null);
        view.setAlpha(mUnselectedAlpha);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object o) {
        HeaderItem iconHeaderItem = ((ListRow) o).getHeaderItem();
        View rootView = viewHolder.view;
        rootView.setFocusable(true);
//        ((RowHeaderView) viewHolder.view).setText(iconHeaderItem.getName());
        TextView label = (TextView) rootView.findViewById(R.id.header_label);
        label.setText(iconHeaderItem.getName());
    }


    @Override
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        // no op
    }

    // TODO: TEMP - remove me when leanback onCreateViewHolder no longer sets the mUnselectAlpha,AND
    // also assumes the xml inflation will return a RowHeaderView
    @Override
    protected void onSelectLevelChanged(RowHeaderPresenter.ViewHolder holder) {
        // this is a temporary fix
        holder.view.setAlpha(mUnselectedAlpha + holder.getSelectLevel() *
                (1.0f - mUnselectedAlpha));
    }
}
