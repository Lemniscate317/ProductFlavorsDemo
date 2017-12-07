package com.lemniscate.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lemniscate.BuildConfig;
import com.lemniscate.R;
import com.lemniscate.presenter.MainPresenter;
import com.lemniscate.presenter.contract.MainContract;

public class MainActivity extends AppCompatActivity implements MainContract.View<MainPresenter> {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MainPresenter(this, this);

        String ip = BuildConfig.URL;

        if (BuildConfig.FLAVOR.equals("seller")) {
            //// TODO: 2017/12/7
        }
    }

    @Override
    public void setPresenter(MainPresenter presenter) {
        mPresenter = presenter;
    }
}
