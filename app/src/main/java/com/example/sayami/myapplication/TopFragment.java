package com.example.sayami.myapplication;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by sayami on 6/16/2016.
 */


public class TopFragment extends Fragment {


    private static EditText topText;
    private static EditText bottomText;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme( String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;

        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        topText = (EditText) view.findViewById(R.id.topText);
        bottomText = (EditText) view.findViewById(R.id.botText);
        Button button = (Button) view.findViewById(R.id.topButton);


        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v){
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }

    void buttonClicked(View view){
            activityCommander.createMeme(topText.getText().toString(), bottomText.getText().toString());
    }
}
