package com.example.janco.spidernest.logoA;


import android.os.Handler;

import com.example.janco.spidernest.base.BasePresenter;


/**
 * Created by janco on 27.01.2016.
 */
public class LogoPresenter extends BasePresenter<ILogoView> implements ILogoPresenter {
    public void waitOnLogoActivity(){

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                getView().newActivity();
            }
        }, 10000);
    }

}