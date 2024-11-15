package com.example.tictactoe;

import android.app.Dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;


public class ResultDialog extends Dialog {

    private final String message;
    private final MainActivity mainActivity;

    public ResultDialog(@NonNull Context context, String message,MainActivity mainActivity) {
        super(context);
        this.message = message;
        this.mainActivity=mainActivity;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_dialog);
        TextView messageText = findViewById(R.id.messageText);
        TextView startAgainButton = findViewById(R.id.startAgainButton);
        messageText.setText(message);
        startAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.restartMatch();
                dismiss();
            }
        });
    }

}
