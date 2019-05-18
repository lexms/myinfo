package com.lexmanuel.myinfo.contact;
/*
 * Tanggal Pengerjaan    : 17/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */
import com.lexmanuel.myinfo.BasePresenter;
import com.lexmanuel.myinfo.BaseView;
import com.lexmanuel.myinfo.Model.Friend;

import java.util.List;

public interface ContactContract {
    interface View extends BaseView<Presenter> {
        void setLoadingIndicator(boolean active);

        void showContact(List<Friend> friends);
    }

    interface Presenter extends BasePresenter {
        void loadContact(Boolean forceUpdate);
    }
}
