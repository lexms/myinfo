package com.lexmanuel.myinfo.contact;

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
