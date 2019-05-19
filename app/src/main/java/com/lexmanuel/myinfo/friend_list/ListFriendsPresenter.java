package com.lexmanuel.myinfo.friend_list;
/*
 * Tanggal Pengerjaan    : 18/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */

import com.lexmanuel.myinfo.Model.Friend;
import com.lexmanuel.myinfo.repo.Repository.*;
import java.util.ArrayList;

public class ListFriendsPresenter implements ListFriendsContract.Presenter{

    private boolean mFirstLoad = true;

    public ArrayList<String> names =new ArrayList<>();
    public ArrayList<String> getNames()
    {
        return names;
    }


    public void save(String friend)
    {
        names.add(friend);
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
