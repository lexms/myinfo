package com.lexmanuel.myinfo.friend_list;
/*
 * Tanggal Pengerjaan    : 18/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */

import com.lexmanuel.myinfo.BasePresenter;
import com.lexmanuel.myinfo.BaseView;
import com.lexmanuel.myinfo.Model.Friend;

public interface ListFriendsContract {
    interface View extends BaseView<Presenter>{
        void setLoadingIndicator(boolean active);

        void showListFriends();

        void showToolbar();

        void showFloatingActionButton();

        void showFriendDetailUI(String friend_id);

        void showInputDialog(int pos);
    }

    interface Presenter extends BasePresenter {
        void save(String name);

        Boolean update(int position,String newName);

        Boolean delete(int position);


        void openDetailFriendDetail(Friend requestedFriend);
    }
}
