package com.lexmanuel.myinfo.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.lexmanuel.myinfo.Model.Profile;
import com.lexmanuel.myinfo.R;

import java.util.List;

public class ProfileFragment extends Fragment implements ProfileContract.View {

    private ProfileContract.Presenter mPresenter;
    private ProgressBar progressBar;
    private TextView nim, nama, kelas, deskripsi;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new ProfilePresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        nim = view.findViewById(R.id.tvprofile_nim);
        nama = view.findViewById(R.id.tvprofile_nama);
        kelas = view.findViewById(R.id.tvprofile_kelas);
        deskripsi = view.findViewById(R.id.tvprofile_deskripsi);

        progressBar = view.findViewById(R.id.pb_profile);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void setLoadingIndicator(boolean active) {
        if (active){
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void setPresenter(ProfileContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showProfile(List<Profile> profile) {
        nim.setText(profile.get(0).getNim());
        nama.setText(profile.get(0).getNama());
        kelas.setText(profile.get(0).getKelas());
        deskripsi.setText(profile.get(0).getDeskripsi());
    }
}
