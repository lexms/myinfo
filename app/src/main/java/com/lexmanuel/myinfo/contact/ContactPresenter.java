package com.lexmanuel.myinfo.contact;
/*
 * Tanggal Pengerjaan    : 17/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */
import com.lexmanuel.myinfo.Model.Friend;
import com.lexmanuel.myinfo.repo.Repository;

import java.util.ArrayList;
import java.util.List;

public class ContactPresenter implements ContactContract.Presenter {
    private final ContactContract.View mContactView;
    private boolean mFirstLoad = true;

    private ArrayList<Friend> repository = new ArrayList<>();

    public ContactPresenter(ContactContract.View mContactView) {
        this.mContactView = mContactView;
        this.mContactView.setPresenter(this);
    }


    @Override
    public void start() {
        loadContact(true);
    }

    @Override
    public void loadContact(Boolean forceUpdate) {
        loadContact(forceUpdate || mFirstLoad, true);
    }

    public void loadContact(boolean forceUpdate, final boolean showLoadingUI){
        if (showLoadingUI){
            mContactView.setLoadingIndicator(true);
        }

        if (forceUpdate){
            repository.clear();
            repository.addAll(Repository.getContactData());
        }

        if (showLoadingUI){
            mContactView.setLoadingIndicator(false);
        }

    }

    public void processProfile(List<Friend> friends){
        mContactView.showContact(friends);
    }
}
