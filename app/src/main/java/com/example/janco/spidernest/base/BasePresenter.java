package com.example.janco.spidernest.base;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;

/**
 * Created by janco on 29.01.2016.
 */
public abstract class BasePresenter<VIEW extends IBaseView> extends MvpBasePresenter<VIEW> implements MvpPresenter<VIEW> {


}
