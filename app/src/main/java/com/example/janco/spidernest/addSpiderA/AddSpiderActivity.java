package com.example.janco.spidernest.addSpiderA;

import android.support.annotation.NonNull;

import com.example.janco.spidernest.R;
import com.example.janco.spidernest.addSpiderF.AddSpiderPresenter;
import com.example.janco.spidernest.addSpiderF.IAddSpiderView;
import com.example.janco.spidernest.base.BaseActivity;
import com.example.janco.spidernest.utils.ActivityConfig;
import com.example.janco.spidernest.utils.ActivityConfigBuilder;


public class AddSpiderActivity extends BaseActivity<IAddSpiderView, AddSpiderPresenter>
        implements IAddSpiderView {
    @Override
    protected ActivityConfig getConfig() {
        return new ActivityConfigBuilder(R.layout.activity_add_spiders).build();
    }

    @Override
    protected void addToCreate() {

    }

    @NonNull
    @Override
    public AddSpiderPresenter createPresenter() {
        return new AddSpiderPresenter();
    }
}

