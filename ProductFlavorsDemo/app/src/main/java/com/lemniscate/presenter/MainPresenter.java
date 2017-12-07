package com.lemniscate.presenter;

import android.content.Context;

import com.lemniscate.presenter.contract.MainContract;

/**
 * Created by l on 2017/12/7.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;
    private Context mContext;

    public MainPresenter(MainContract.View view, Context mContext) {
        mView = view;
        this.mContext = mContext;
    }
}
