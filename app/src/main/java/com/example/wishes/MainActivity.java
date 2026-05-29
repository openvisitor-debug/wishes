package com.example.wishes;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Load native library
        System.loadLibrary("wishes-native");
        
        // Call native method
        TextView textView = findViewById(R.id.sample_text);
        String nativeMessage = stringFromJNI();
        textView.setText(nativeMessage);
    }
    
    // Native method declaration
    public native String stringFromJNI();
}