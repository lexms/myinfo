package com.lexmanuel.myinfo.friend_detail;

import com.lexmanuel.myinfo.BasePresenter;
import com.lexmanuel.myinfo.BaseView;

public class FriendDetailContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showFriend();

    }

    interface Presenter extends BasePresenter {

        void loadFriendProfile();

        void editFriendProfile();

        void deleteFriendProfile();
    }
}
