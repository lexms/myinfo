package com.lexmanuel.myinfo.repo;
/*
 * Tanggal Pengerjaan    : 16/05/2019
 * NIM                   : 10116370
 * Nama                  : Alexander M S
 * Kelas                 : IF - 8
 * */
import com.lexmanuel.myinfo.Model.Profile;
import com.lexmanuel.myinfo.Model.Friend;

import java.util.ArrayList;

public class Repository {
     static String[] profileData = new String[]{
            "",
            "10116370",
            "Alexander M S",
            "IF - 8",
            "Do. Or do not. There is no try. Just like Master Yoda said in my life there shall not be any doubt, life have to be determent. Determent to persevere in good and righteousness." +
                    "\n\n I'm an informatics student in UNIKOM and also part timer photographic designer in Barless Online Advertising."
    };

     static String[] contactData = new String[]{
             "",
             "",
             "",
             "0853 4806 0131",
             "alexandermanuel.s@gmail.com",
             "lexmanuel",
             "lexms",
             "Alexander M S"

     };

    public static ArrayList<Profile> getProfileData(){
        Profile p = null;

        ArrayList<Profile> list = new ArrayList<>();

            p = new Profile();
            p.setFoto(profileData[0]);
            p.setNim(profileData[1]);
            p.setNama(profileData[2]);
            p.setKelas(profileData[3]);
            p.setDeskripsi(profileData[4]);
            list.add(p);

            return list;
    }

    public static ArrayList<Friend> getContactData(){
        Friend friend = null;

        ArrayList<Friend> list = new ArrayList<>();

        friend = new Friend();
        friend.setTelepon(contactData[3]);
        friend.setEmail(contactData[4]);
        friend.setTwitter(contactData[5]);
        friend.setInstagram(contactData[6]);
        friend.setFacebook(contactData[7]);
        list.add(friend);

        return list;
    }



}
