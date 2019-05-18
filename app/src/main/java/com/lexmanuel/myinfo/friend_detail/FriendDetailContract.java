package com.lexmanuel.myinfo.friend_detail;
/*
 * Tanggal Pengerjaan    : 17/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */
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
