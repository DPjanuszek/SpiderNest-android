package com.example.janco.spidernest;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import timber.log.Timber;

/**
 * Created by janco on 27.01.2016.
 */
public class LogoPresenter extends MvpBasePresenter<LogoView> {

    public void keepCalmAndWait(){
        try {
            getView().startLogo();
            Timber.d("keepCalmAndWait  1");
            Thread.sleep(5000);
            Timber.d("keepCalmAndWait  2");
            getView().startActivity();
        } catch (InterruptedException e) { }

    }

}