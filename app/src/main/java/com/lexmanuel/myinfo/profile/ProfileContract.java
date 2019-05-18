package com.lexmanuel.myinfo.profile;

import com.lexmanuel.myinfo.BasePresenter;
import com.lexmanuel.myinfo.BaseView;
import com.lexmanuel.myinfo.Model.Profile;

import java.util.List;

public class ProfileContract {

    interface View extends BaseView<Presenter>{
        void setLoadingIndicator(boolean active);

        void showProfile(List<Profile> profile);
    }

    interface Presenter extends BasePresenter {
        void loadProfile(boolean forceUpdate);
    }
}
