package com.example.janco.spidernest.logoA;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.example.janco.spidernest.MySpidersActivity;
import com.example.janco.spidernest.base.BasePresenter;


/**
 * Created by janco on 27.01.2016.
 */
public class LogoPresenter extends BasePresenter<ILogoView> implements ILogoPresenter {
    public void waitOnLogoActivity(final Context context){

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(context, MySpidersActivity.class);
                context.startActivity(i);
                ((Activity)context).finish();
            }
        }, 10000);
    }

}