package com.example.janco.spidernest;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import timber.log.Timber;

/**
 * Created by janco on 27.01.2016.
 */
public class LogoPresenter extends MvpBasePresenter<LogoView> {

    public void keepCalmAndWait(final Context context){
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(context, MySpidersActivity.class);
                context.startActivity(i);

            }
        }, 5000);
    }



}