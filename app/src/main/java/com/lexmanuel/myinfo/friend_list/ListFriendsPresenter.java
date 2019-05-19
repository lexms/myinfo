package com.lexmanuel.myinfo.friend_list;
/*
 * Tanggal Pengerjaan    : 18/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */

import androidx.annotation.NonNull;


import com.lexmanuel.myinfo.Model.Friend;

import java.util.ArrayList;

import static androidx.core.util.Preconditions.checkNotNull;

public class ListFriendsPresenter implements ListFriendsContract.Presenter{



    private boolean mFirstLoad = true;

 /*   public ListFriendsPresenter(@NonNull ListFriendsContract.View mListFriendsView){

        mListFriendsView = checkNotNull(mListFriendsView, "taskDetailView cannot be null!");;

        mListFriendsView.setPresenter(this);
    }
*/



    private ArrayList<String> names =new ArrayList<>();

    public void save(String name)
    {
        names.add(name);
    }


    public ArrayList<String> getNames()
    {
        return names;
    }


    public Boolean update(int position,String newName)
    {
        try {
            names.remove(position);
            names.add(position,newName);

            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(int position)
    {
        try {
            names.remove(position);

            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
            return false;

        }
    }

    @Override
    public void openDetailFriendDetail(Friend requestedFriend) {

    }

    @Override
    public void start() {

    }
}
