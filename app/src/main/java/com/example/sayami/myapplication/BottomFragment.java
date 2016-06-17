package com.example.sayami.myapplication;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.FragmentManager;

/**
 * Created by sayami on 6/16/2016.
 */
public class BottomFragment extends Fragment {

    private static TextView topMemeTxt;
    private static TextView botMemeTxt;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_layout,container,false);
        topMemeTxt = (TextView) view.findViewById(R.id.topTxt);
        botMemeTxt = (TextView) view.findViewById(R.id.botTxt);
        return view;
    }

    public void SetMemeText( String top, String bot){
        topMemeTxt.setText(top);
        botMemeTxt.setText(bot);
    }
}
