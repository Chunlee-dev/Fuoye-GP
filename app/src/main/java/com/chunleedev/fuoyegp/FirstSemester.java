package com.chunleedev.fuoyegp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class FirstSemester extends Fragment {

    private View view;
    private Spinner grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, grade10, grade11,
            grade12, grade13, grade14;
    private int grade1Val, grade2Val, grade3Val, grade4Val, grade5Val, grade6Val, grade7Val,
            grade8Val, grade9Val, grade10Val, grade11Val, grade12Val, grade13Val, grade14Val;
    private int coursePoint1, coursePoint2, coursePoint3, coursePoint4, coursePoint5, coursePoint6, coursePoint7,
            coursePoint8, coursePoint9, coursePoint10, coursePoint11, coursePoint12, coursePoint13, coursePoint14;
    private int coursePointTotal, courseUnitTotal;
    private double gp;
    private String grade1String, grade2String, grade3String, grade4String, grade5String, grade6String, grade7String,
            grade8String, grade9String, grade10String, grade11String, grade12String, grade13String, grade14String;
    private int courseUnit1 = 3;
    private int courseUnit2 = 3;
    private int courseUnit3 = 3;
    private int courseUnit4 = 2;
    private int courseUnit5 = 1;
    private int courseUnit6 = 3;
    private int courseUnit7 = 1;
    private int courseUnit8 = 3;
    private int courseUnit9 = 1;
    private int courseUnit10 = 2;
    private int courseUnit11 = 2;
    private int courseUnit12 = 1;
    private int courseUnit13 = 2;
    private int courseUnit14 = 2;
    public FirstSemester() {
        // Required empty public constructor
    }

    public static FirstSemester newInstance() {
        return new FirstSemester();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton fab = view.findViewById(R.id.fab);

        grade1 = view.findViewById(R.id.grade1);
        grade2 = view.findViewById(R.id.grade2);
        grade3 = view.findViewById(R.id.grade3);
        grade4 = view.findViewById(R.id.grade4);
        grade5 = view.findViewById(R.id.grade5);
        grade6 = view.findViewById(R.id.grade6);
        grade7 = view.findViewById(R.id.grade7);
        grade8 = view.findViewById(R.id.grade8);
        grade9 = view.findViewById(R.id.grade9);
        grade10 = view.findViewById(R.id.grade10);
        grade11 = view.findViewById(R.id.grade11);
        grade12 = view.findViewById(R.id.grade12);
        grade13 = view.findViewById(R.id.grade13);
        grade14 = view.findViewById(R.id.grade14);

        String[] courses = getResources().getStringArray(R.array.grades);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item, courses);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        grade1.setAdapter(arrayAdapter);
        grade2.setAdapter(arrayAdapter);
        grade3.setAdapter(arrayAdapter);
        grade4.setAdapter(arrayAdapter);
        grade5.setAdapter(arrayAdapter);
        grade6.setAdapter(arrayAdapter);
        grade7.setAdapter(arrayAdapter);
        grade8.setAdapter(arrayAdapter);
        grade9.setAdapter(arrayAdapter);
        grade10.setAdapter(arrayAdapter);
        grade11.setAdapter(arrayAdapter);
        grade12.setAdapter(arrayAdapter);
        grade13.setAdapter(arrayAdapter);
        grade14.setAdapter(arrayAdapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                grade1String = grade1.getSelectedItem().toString();
                grade2String = grade2.getSelectedItem().toString();
                grade3String = grade3.getSelectedItem().toString();
                grade4String = grade4.getSelectedItem().toString();
                grade5String = grade5.getSelectedItem().toString();
                grade6String = grade6.getSelectedItem().toString();
                grade7String = grade7.getSelectedItem().toString();
                grade8String = grade8.getSelectedItem().toString();
                grade9String = grade9.getSelectedItem().toString();
                grade10String = grade10.getSelectedItem().toString();
                grade11String = grade11.getSelectedItem().toString();
                grade12String = grade12.getSelectedItem().toString();
                grade13String = grade13.getSelectedItem().toString();
                grade14String = grade14.getSelectedItem().toString();


                grade1Val = checker(grade1String);
                grade2Val = checker(grade2String);
                grade3Val = checker(grade3String);
                grade4Val = checker(grade4String);
                grade5Val = checker(grade5String);
                grade6Val = checker(grade6String);
                grade7Val = checker(grade7String);
                grade8Val = checker(grade8String);
                grade9Val = checker(grade9String);
                grade10Val = checker(grade10String);
                grade11Val = checker(grade11String);
                grade12Val = checker(grade12String);
                grade13Val = checker(grade13String);
                grade14Val = checker(grade14String);


                if (grade1Val == -1 && grade2Val == -1 && grade3Val == -1 && grade4Val == -1 && grade5Val == -1 && grade6Val == -1 && grade7Val == -1 && grade8Val == -1 && grade9Val == -1 && grade10Val == -1 && grade11Val == -1 && grade12Val == -1 && grade13Val == -1 && grade14Val == -1) {
                    Toast.makeText(getContext(), "Please select your grades first!", Toast.LENGTH_LONG).show();
                } else {
                    if (grade1Val == -1) {
                        courseUnit1 = 0;
                        grade1Val = 0;
                    } else {
                        courseUnit1 = 3;
                        grade1Val = checker(grade1String);
                    }
                    coursePoint1 = courseUnit1 * grade1Val;

                    if (grade2Val == -1) {
                        courseUnit2 = 0;
                        grade2Val = 0;
                    } else {
                        courseUnit2 = 3;
                        grade1Val = checker(grade1String);
                    }
                    coursePoint2 = courseUnit2 * grade2Val;

                    if (grade3Val == -1) {
                        courseUnit3 = 0;
                        grade3Val = 0;
                    } else {
                        courseUnit3 = 3;
                        grade3Val = checker(grade3String);
                    }
                    coursePoint3 = courseUnit3 * grade3Val;

                    if (grade4Val == -1) {
                        courseUnit4 = 0;
                        grade4Val = 0;
                    } else {
                        courseUnit4 = 2;
                        grade4Val = checker(grade4String);
                    }
                    coursePoint4 = courseUnit4 * grade4Val;

                    if (grade5Val == -1) {
                        courseUnit5 = 0;
                        grade5Val = 0;
                    } else {
                        courseUnit5 = 1;
                        grade5Val = checker(grade5String);
                    }
                    coursePoint5 = courseUnit5 * grade5Val;

                    if (grade6Val == -1) {
                        courseUnit6 = 0;
                        grade6Val = 0;
                    } else {
                        courseUnit6 = 3;
                        grade6Val = checker(grade6String);
                    }
                    coursePoint6 = courseUnit6 * grade6Val;

                    if (grade7Val == -1) {
                        courseUnit7 = 0;
                        grade7Val = 0;
                    } else {
                        courseUnit7 = 1;
                        grade7Val = checker(grade7String);
                    }
                    coursePoint7 = courseUnit7 * grade7Val;

                    if (grade8Val == -1) {
                        courseUnit8 = 0;
                        grade8Val = 0;
                    } else {
                        courseUnit8 = 3;
                        grade8Val = checker(grade8String);
                    }
                    coursePoint8 = courseUnit8 * grade8Val;

                    if (grade9Val == -1) {
                        courseUnit9 = 0;
                        grade9Val = 0;
                    } else {
                        courseUnit9 = 1;
                        grade9Val = checker(grade9String);
                    }
                    coursePoint9 = courseUnit9 * grade9Val;

                    if (grade10Val == -1) {
                        courseUnit10 = 0;
                        grade10Val = 0;
                    } else {
                        courseUnit10 = 2;
                        grade10Val = checker(grade10String);
                    }
                    coursePoint10 = courseUnit10 * grade10Val;

                    if (grade11Val == -1) {
                        courseUnit11 = 0;
                        grade11Val = 0;
                    } else {
                        courseUnit11 = 2;
                        grade11Val = checker(grade11String);
                    }
                    coursePoint11 = courseUnit11 * grade11Val;

                    if (grade12Val == -1) {
                        courseUnit12 = 0;
                        grade12Val = 0;
                    } else {
                        courseUnit12 = 1;
                        grade12Val = checker(grade12String);
                    }
                    coursePoint12 = courseUnit12 * grade12Val;

                    if (grade13Val == -1) {
                        courseUnit13 = 0;
                        grade13Val = 0;
                    } else {
                        courseUnit13 = 2;
                        grade13Val = checker(grade13String);
                    }
                    coursePoint13 = courseUnit13 * grade13Val;

                    if (grade14Val == -1) {
                        courseUnit14 = 0;
                        grade14Val = 0;
                    } else {
                        courseUnit14 = 2;
                        grade14Val = checker(grade14String);
                    }
                    coursePoint14 = courseUnit14 * grade14Val;


                    coursePointTotal = coursePoint1 + coursePoint2 + coursePoint3 + coursePoint4 +
                            coursePoint5 + coursePoint6 + coursePoint7 + coursePoint8 + coursePoint9 +
                            coursePoint10 + coursePoint11 + coursePoint12 + coursePoint13 + coursePoint14;


                    courseUnitTotal = courseUnit1 + courseUnit2 + courseUnit3 + courseUnit4 +
                            courseUnit5 + courseUnit6 + courseUnit7 + courseUnit8 + courseUnit9 +
                            courseUnit10 + courseUnit11 + courseUnit12 + courseUnit13 + courseUnit14;


                    gp = (double) coursePointTotal / courseUnitTotal;

                    createDialog(approximate(gp));

                }
            }
        });

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_first_semester, container, false);
        }

        return view;
    }

    private int checker(String grade) {

        int multiplier;

        if (grade.toUpperCase().trim().contentEquals("A")) {
            multiplier = 5;
        } else if (grade.toUpperCase().trim().contentEquals("B")) {
            multiplier = 4;
        } else if (grade.toUpperCase().trim().contentEquals("C")) {
            multiplier = 3;
        } else if (grade.toUpperCase().trim().contentEquals("D")) {
            multiplier = 2;
        } else if (grade.toUpperCase().trim().contentEquals("E")) {
            multiplier = 1;
        } else if (grade.toUpperCase().trim().contentEquals("F")) {
            multiplier = 0;
        } else {
            multiplier = -1;
        }
        return multiplier;
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




