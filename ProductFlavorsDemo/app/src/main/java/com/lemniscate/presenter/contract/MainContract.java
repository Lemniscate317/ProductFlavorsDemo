package com.lemniscate.presenter.contract;

/**
 * Created by l on 2017/12/7.
 */

public class MainContract {
    public interface View<T>{
        void setPresenter(T presenter);
    }
    public interface Presenter{

    }
}
