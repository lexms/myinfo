package com.lexmanuel.myinfo.friend_list;
/*
 * Tanggal Pengerjaan    : 18/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.lexmanuel.myinfo.Model.Friend;
import com.lexmanuel.myinfo.R;


public class ListFriendsFragment extends Fragment implements ListFriendsContract.View {
    ListView lv;
    ArrayAdapter<String> adapter;
    ListFriendsPresenter crud = new ListFriendsPresenter();
    Dialog d;

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
        View view = inflater.inflate(R.layout.fragment_list_friends, container, false);
        FloatingActionButton fab = view.findViewById(R.id.fab2);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListFriendsActivity.class);
                startActivity(intent);

            }
        });

        setHasOptionsMenu(true);

        return view;


        /*return inflater.inflate(R.layout.fragment_list_friends, container, false);*/
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
        ListView lv;
        lv = getView().findViewById(R.id.lv);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(d != null) {
                    if(!d.isShowing())
                    {
                        showInputDialog(i);
                    }else
                    {
                        d.dismiss();
                    }
                }
            }
        });
    }

    @Override
    public void showToolbar() {

    }

    @Override
    public void showFloatingActionButton() {
        final FloatingActionButton fab = getView().findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInputDialog(-1);
            }
        });
    }

    @Override
    public void showFriendDetailUI(String friend_id) {
        // intent ke friend detail
    }

    @Override
    public void showInputDialog(int pos) {

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
