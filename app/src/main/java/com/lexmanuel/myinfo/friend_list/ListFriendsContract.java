package com.lexmanuel.myinfo.friend_list;

import com.lexmanuel.myinfo.BasePresenter;
import com.lexmanuel.myinfo.BaseView;
import com.lexmanuel.myinfo.Model.Friend;

public class ListFriendsContract {
    interface View extends BaseView<Presenter>{
        void setLoadingIndicator(boolean active);

        void showListFriends();

        void showFriendDetailUI(String friend_id);
    }

    interface Presenter extends BasePresenter {
        void loadListFriends();

        void addNewFriend();

        void openDetailFriendDetail(Friend requestedFriend);
    }
}
