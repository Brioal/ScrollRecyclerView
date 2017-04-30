package com.brioal.scrollrecyview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * email:brioal@foxmail.com
 * github:https://github.com/Brioal
 * Created by brioa on 2017/4/30.
 */

public class ScrollRecyclerView extends RecyclerView {
    public ScrollRecyclerView(Context context) {
        this(context, null);
    }

    public ScrollRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setAutoMeasureEnabled(true);
        setLayoutManager(manager);
        setHasFixedSize(true);
        setNestedScrollingEnabled(false);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(
                Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
