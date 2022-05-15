package com.depauw.attributetypes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.depauw.attributetypes.databinding.ActivityAttributeTypesBinding;

public class AttributeTypes extends AppCompatActivity {

    private ActivityAttributeTypesBinding binding;

    public void task1(){
        binding.ratingbarView4.setProgressTintList(ColorStateList.valueOf(getResources().getColor(R.color.metro_red, getTheme())));
    }

    public void task2(){
        String fetch = binding.edittextView2.getText().toString();
        String[] result = fetch.split(" ");
        binding.toggleView7.setTextOff(result[0]);
        binding.toggleView7.setTextOn(result[1]);

    }

    public void task3(){
        binding.linearlayoutView6.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
    }

    public void task4(){
        binding.textviewView1.setAllCaps(true);
    }

    public void task5(){
        binding.seekbarView3.setThumb(getResources().getDrawable(R.drawable.tiger, getTheme()));
    }

    public void task6(){
        binding.edittextView2.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
    }

    public void task7(){
        binding.checkboxView8.setHeight((int)(250 * getResources().getDisplayMetrics().density));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAttributeTypesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
}