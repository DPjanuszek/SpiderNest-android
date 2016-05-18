package com.example.janco.spidernest.mySpidersA;

import com.example.janco.spidernest.base.BasePresenter;

/**
 * Created by janco on 10.05.2016.
 */
public class MySpidersPresenter extends BasePresenter<IMySpidersView> implements IMySpidersPresenter {

    private Boolean a=false;

    public void tarantula () {
        if (a==false) {
            getView().showTarantula("Tarantula");
            a=true;
        }
        else {
            getView().showTarantula("");
            a=false;
        }
    }
}