package com.example.janco.spidernest.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import com.example.janco.spidernest.MySpidersActivity;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by janco on 29.01.2016.
 */
public abstract class BasePresenter<VIEW extends IBaseView> extends MvpBasePresenter<VIEW> implements MvpPresenter<VIEW> {


}
