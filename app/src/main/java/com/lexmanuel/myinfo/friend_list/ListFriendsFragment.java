package com.lexmanuel.myinfo.friend_list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.lexmanuel.myinfo.Model.Friend;
import com.lexmanuel.myinfo.R;


public class ListFriendsFragment extends Fragment implements ListFriendsContract.View {

    private ListFriendsContract.Presenter mPresenter;


    public ListFriendsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_friends, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showListFriends() {

    }

    @Override
    public void showFriendDetailUI(String friend_id) {
        // intent ke friend detail
    }

    @Override
    public void setPresenter(ListFriendsContract.Presenter presenter) {

    }




    ListFriendsListener mItemListener = new ListFriendsListener() {
        @Override
        public void onListFriendClick(Friend clickedListFriend) {
            mPresenter.openDetailFriendDetail(clickedListFriend);
        }
    };

    interface ListFriendsListener {
        void onListFriendClick(Friend clickedListFriend);
    }
}
