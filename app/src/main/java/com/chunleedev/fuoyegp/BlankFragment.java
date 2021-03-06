package com.chunleedev.fuoyegp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {

    private View v;
    private EditText first_smst_gp, first_smst_units, second_smst_gp, second_smst_units;
    private double firstGp, secondGp, firstUnit, secondUnit, ans;
    public BlankFragment() {
    }

    public static BlankFragment newInstance() {
        return new BlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (v == null) {

            v = inflater.inflate(R.layout.fragment_blank, container, false);

        }
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        first_smst_gp = v.findViewById(R.id.first_smst_gp);
        second_smst_gp = v.findViewById(R.id.second_smst_gp);
        first_smst_units = v.findViewById(R.id.first_smst_units);
        second_smst_units = v.findViewById(R.id.second_smst_units);

        Button compute = v.findViewById(R.id.compute);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstGp = Double.parseDouble(first_smst_gp.getText().toString());
                secondGp = Double.parseDouble(second_smst_gp.getText().toString());
                secondUnit = Double.parseDouble(second_smst_units.getText().toString());
                firstUnit = Double.parseDouble(first_smst_units.getText().toString());

                ans = ((firstGp * firstUnit) + (secondGp * secondUnit)) / (firstUnit + secondUnit);

                createDialog(approximate(ans));
            }
        });

    }

    private void createDialog(double gpa) {
        if (getContext() == null)
            return;
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Result")
                .setMessage("GP: " + gpa)
                .create().show();
    }

    private double approximate(double cgpa) {

        if (Double.toString(cgpa).length() >= 5) {

            String stringVal = Double.toString(cgpa);

            char five = stringVal.charAt(4);

            double value = Double.parseDouble(stringVal.substring(0, 4));

            if (Integer.parseInt(Character.toString(five)) >= 5) {
                value += 0.01;
            }

            return value;

        } else {
            return cgpa;
        }
    }

}
