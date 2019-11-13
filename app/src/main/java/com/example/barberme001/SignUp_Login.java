package com.example.barberme001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import static com.example.barberme001.MainActivity.EXTRA_MESSAGE;

public class SignUp_Login extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "hi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__login);
    }
    public void barberChoice(View view) {
        Intent intent = new Intent(this, barberSignUp.class);
        popUp(view, intent);
    }
    public void nonbarberChoice(View view) {
        Intent intent = new Intent(this, nonbarberSignUp.class);
        popUp(view, intent);
    }
    public void popUp(View view, Intent next) {

        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.popout_window, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);




    }
    public void next(View popout_window, Intent next) {
        EditText editText = (EditText) findViewById(R.id.textField);
        String message = editText.getText().toString();
        next.putExtra(EXTRA_MESSAGE, message);
        startActivity(next);
    }
}
