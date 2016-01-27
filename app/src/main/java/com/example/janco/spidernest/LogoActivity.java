package com.example.janco.spidernest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.hannesdorfmann.mosby.mvp.MvpActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import timber.log.Timber;

public class LogoActivity extends MvpActivity<LogoView, LogoPresenter>
        implements LogoView {



    @Bind(R.id.textView)
    TextView textView;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_logo);
        ButterKnife.bind(this);
        textView.setText("nie wiem sam");
        Timber.plant(new Timber.DebugTree());
        presenter.keepCalmAndWait(this);
    }


    @Override
    public LogoPresenter createPresenter() {
        return new LogoPresenter();
    }

    @Override
    public void startLogo(){
    textView.setText("LogoActivity");
    }

    @Override
    public void startActivity() {
        Timber.d("startActivity ok");
        textView.setText("Działa czy nie działa");
       // startActivity(new Intent(this, MySpidersActivity.class));
    }
}
