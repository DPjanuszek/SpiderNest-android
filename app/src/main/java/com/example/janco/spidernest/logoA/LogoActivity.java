package com.example.janco.spidernest.logoA;



import android.app.Activity;
import android.content.Intent;

import com.example.janco.spidernest.R;
import com.example.janco.spidernest.base.BaseActivity;
import com.example.janco.spidernest.mySpidersA.MySpidersActivity;
import com.example.janco.spidernest.utils.ActivityConfig;
import com.example.janco.spidernest.utils.ActivityConfigBuilder;


public class LogoActivity extends BaseActivity<ILogoView, LogoPresenter>
        implements ILogoView {

    @Override
    protected void addToCreate(){
        presenter.waitOnLogoActivity();
    }

    @Override
    public LogoPresenter createPresenter() {
        return new LogoPresenter();
    }

    @Override
    protected ActivityConfig getConfig() {
        return new ActivityConfigBuilder(R.layout.activity_logo).build();
    }

    public void newActivity(){
        Intent i = new Intent(this, MySpidersActivity.class);
        this.startActivity(i);
        this.finish();
    }
}
