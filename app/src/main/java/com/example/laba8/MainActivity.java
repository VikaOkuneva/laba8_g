package com.example.laba8;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public static boolean isInternetAvailable(Context context) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }


    public void onCl(View v) {
        if (isInternetAvailable(this)) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Вы подключены к интернету", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast2 = Toast.makeText(getApplicationContext(),
                    "Нет додключения", Toast.LENGTH_LONG);
            toast2.show();
        }
    }

}
