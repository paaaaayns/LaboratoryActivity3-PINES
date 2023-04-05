package com.example.laboratoryactivity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    String[] CivilStatus_items = {"Single", "Married", "Divorced", "Separated", "Widow"};

    String[] Years = {"Present", "2023", "2022", "2021", "2020",
            "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010",
            "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000",
            "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990",
            "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980"};

    Button btnClear, btnSubmit;

    TextInputLayout layoutName, layoutAddress, layoutContact, layoutEmail, layoutAge, layoutBirthdayDD, layoutBirthdayMM, layoutBirthdayYYYY,
            layoutBirthplace, layoutCitizenship, layoutCivilStatus, layoutReligion,
            layoutFatherName, layoutFatherOccupation,
            layoutMotherName, layoutMotherOccupation,
            layoutPrimarySchool, layoutPrimaryStartYear, layoutPrimaryEndYear,
            layoutSecondarySchoolJHS, layoutSecondaryStartYearJHS, layoutSecondaryEndYearJHS,
            layoutSecondarySchoolSHS, layoutSecondaryStartYearSHS, layoutSecondaryEndYearSHS,
            layoutTertiarySchool, layoutTertiaryStartYear, layoutTertiaryEndYear,
            layoutEmergencyName, layoutEmergencyRelationship, layoutEmergencyAddress, layoutEmergencyContact;

    TextInputEditText edtName, edtAddress, edtContact, edtEmail, edtAge, edtBirthdayMM, edtBirthdayDD, edtBirthdayYYYY,
            edtBirthplace, edtCitizenship, edtReligion,
            edtFatherName, edtFatherOccupation,
            edtMotherName, edtMotherOccupation,
            edtPrimarySchool,
            edtSecondarySchoolJHS,
            edtSecondarySchoolSHS,
            edtTertiarySchool,
            edtEmergencyName, edtEmergencyRelationship, edtEmergencyAddress, edtEmergencyContact;

    AutoCompleteTextView ddownCivilStatus,
            ddownPrimaryStartYear, ddownPrimaryEndYear,
            ddownSecondaryStartYearJHS, ddownSecondaryEndYearJHS,
            ddownSecondaryStartYearSHS, ddownSecondaryEndYearSHS,
            ddownTertiaryStartYear, ddownTertiaryEndYear;

    ArrayAdapter<String> adapter_CSitems, adapter_Yearitems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View rootView = findViewById(android.R.id.content);

        layoutName = findViewById(R.id.layoutName);
        layoutAddress = findViewById(R.id.layoutAddress);
        layoutContact = findViewById(R.id.layoutContact);
        layoutEmail = findViewById(R.id.layoutEmail);
        layoutAge = findViewById(R.id.layoutAge);
        layoutBirthdayMM = findViewById(R.id.layoutBirthdayMM);
        layoutBirthdayDD = findViewById(R.id.layoutBirthdayDD);
        layoutBirthdayYYYY = findViewById(R.id.layoutBirthdayYYYY);
        layoutBirthplace = findViewById(R.id.layoutBirthplace);
        layoutCitizenship = findViewById(R.id.layoutCitizenship);
        layoutCivilStatus = findViewById(R.id.layoutCivilStatus);
        layoutReligion = findViewById(R.id.layoutReligion);
        layoutFatherName = findViewById(R.id.layoutFatherName);
        layoutFatherOccupation = findViewById(R.id.layoutFatherOccupation);
        layoutMotherName = findViewById(R.id.layoutMotherName);
        layoutMotherOccupation = findViewById(R.id.layoutMotherOccupation);
        layoutPrimarySchool = findViewById(R.id.layoutPrimarySchool);
        layoutSecondarySchoolJHS = findViewById(R.id.layoutSecondarySchoolJHS);
        layoutSecondarySchoolSHS = findViewById(R.id.layoutSecondarySchoolSHS);
        layoutTertiarySchool = findViewById(R.id.layoutTertiarySchool);
        layoutEmergencyName = findViewById(R.id.layoutEmergencyName);
        layoutEmergencyRelationship = findViewById(R.id.layoutEmergencyRelationship);
        layoutEmergencyAddress = findViewById(R.id.layoutEmergencyAddress);
        layoutEmergencyContact = findViewById(R.id.layoutEmergencyContact);

        layoutPrimaryStartYear = findViewById(R.id.layoutPrimaryStartYear);
        layoutPrimaryEndYear = findViewById(R.id.layoutPrimaryEndYear);
        layoutSecondaryStartYearJHS = findViewById(R.id.layoutSecondaryStartYearJHS);
        layoutSecondaryEndYearJHS = findViewById(R.id.layoutSecondaryEndYearJHS);
        layoutSecondaryStartYearSHS = findViewById(R.id.layoutSecondaryStartYearSHS);
        layoutSecondaryEndYearSHS = findViewById(R.id.layoutSecondaryEndYearSHS);
        layoutTertiaryStartYear = findViewById(R.id.layoutTertiaryStartYear);
        layoutTertiaryEndYear = findViewById(R.id.layoutTertiaryEndYear);

        edtName = findViewById(R.id.edtName);
        edtAddress = findViewById(R.id.edtAddress);
        edtContact = findViewById(R.id.edtContact);
        edtEmail = findViewById(R.id.edtEmail);
        edtAge = findViewById(R.id.edtAge);
        edtBirthdayMM = findViewById(R.id.edtBirthdayMM);
        edtBirthdayDD = findViewById(R.id.edtBirthdayDD);
        edtBirthdayYYYY = findViewById(R.id.edtBirthdayYYYY);
        edtBirthplace = findViewById(R.id.edtBirthplace);
        edtCitizenship = findViewById(R.id.edtCitizenship);
        edtReligion = findViewById(R.id.edtReligion);
        edtFatherName = findViewById(R.id.edtFatherName);
        edtFatherOccupation = findViewById(R.id.edtFatherOccupation);
        edtMotherName = findViewById(R.id.edtMotherName);
        edtMotherOccupation = findViewById(R.id.edtMotherOccupation);
        edtPrimarySchool = findViewById(R.id.edtPrimarySchool);
        edtSecondarySchoolJHS = findViewById(R.id.edtSecondarySchoolJHS);
        edtSecondarySchoolSHS = findViewById(R.id.edtSecondarySchoolSHS);
        edtTertiarySchool = findViewById(R.id.edtTertiarySchool);
        edtEmergencyName = findViewById(R.id.edtEmergencyName);
        edtEmergencyRelationship = findViewById(R.id.edtEmergencyRelationship);
        edtEmergencyAddress = findViewById(R.id.edtEmergencyAddress);
        edtEmergencyContact = findViewById(R.id.edtEmergencyContact);

        ddownCivilStatus = findViewById(R.id.ddownCivilStatus);
        ddownPrimaryStartYear = findViewById(R.id.ddownPrimaryStartYear);
        ddownPrimaryEndYear = findViewById(R.id.ddownPrimaryEndYear);
        ddownSecondaryStartYearJHS = findViewById(R.id.ddownSecondaryStartYearJHS);
        ddownSecondaryEndYearJHS = findViewById(R.id.ddownSecondaryEndYearJHS);
        ddownSecondaryStartYearSHS = findViewById(R.id.ddownSecondaryStartYearSHS);
        ddownSecondaryEndYearSHS = findViewById(R.id.ddownSecondaryEndYearSHS);
        ddownTertiaryStartYear = findViewById(R.id.ddownTertiaryStartYear);
        ddownTertiaryEndYear = findViewById(R.id.ddownTertiaryEndYear);

        // Array - TextInputLayouts of EditTexts
        TextInputLayout[] Arr_edtLayouts = {layoutName, layoutAddress, layoutContact, layoutEmail, layoutAge, layoutBirthdayMM, layoutBirthdayDD, layoutBirthdayYYYY,
                layoutBirthplace, layoutCitizenship, layoutReligion,
                layoutFatherName, layoutFatherOccupation,
                layoutMotherName, layoutMotherOccupation,
                layoutPrimarySchool,
                layoutSecondarySchoolJHS,
                layoutSecondarySchoolSHS,
                layoutTertiarySchool,
                layoutEmergencyName, layoutEmergencyRelationship, layoutEmergencyAddress, layoutEmergencyContact};

        // Array - TextInputEditTexts
        TextInputEditText[] Arr_edtTexts = {edtName, edtAddress, edtContact, edtEmail, edtAge, edtBirthdayMM, edtBirthdayDD, edtBirthdayYYYY,
                edtBirthplace, edtCitizenship, edtReligion,
                edtFatherName, edtFatherOccupation,
                edtMotherName, edtMotherOccupation,
                edtPrimarySchool,
                edtSecondarySchoolJHS,
                edtSecondarySchoolSHS,
                edtTertiarySchool,
                edtEmergencyName, edtEmergencyRelationship, edtEmergencyAddress, edtEmergencyContact};

        // Validation - EditTexts
        for (int i = 0; i < Arr_edtLayouts.length; i++) {
            int index = i;
            Arr_edtLayouts[index].setHelperTextEnabled(false);

            Arr_edtTexts[index].setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean hasFocus) {
                    Arr_edtLayouts[index].setHelperTextEnabled(false);

                    if (!hasFocus) {
                        Arr_edtLayouts[index].setEndIconVisible(false);

                        if (Arr_edtTexts[index].getText().toString().isEmpty()) {
                            Arr_edtLayouts[index].setHelperText("Required*");
                            Arr_edtLayouts[index].setHelperTextEnabled(true);
                        } else {
                            Arr_edtLayouts[index].setHelperTextEnabled(false);
                        }
                    }
                }
            });
        }


        // Array - TextInputLayouts of Dropdown Menus
        TextInputLayout[] Arr_ddownLayouts = {layoutCivilStatus,
                layoutPrimaryStartYear, layoutPrimaryEndYear,
                layoutSecondaryStartYearJHS, layoutSecondaryEndYearJHS,
                layoutSecondaryStartYearSHS, layoutSecondaryEndYearSHS,
                layoutTertiaryStartYear, layoutTertiaryEndYear};

        // Array - Dropdown Menus
        AutoCompleteTextView[] Arr_ddownTexts = {ddownCivilStatus,
                ddownPrimaryStartYear, ddownPrimaryEndYear,
                ddownSecondaryStartYearJHS, ddownSecondaryEndYearJHS,
                ddownSecondaryStartYearSHS, ddownSecondaryEndYearSHS,
                ddownTertiaryStartYear, ddownTertiaryEndYear};

        // Validation - DropDownTexts
        for (int i = 0; i < Arr_ddownLayouts.length; i++) {
            int index = i;
            Arr_ddownLayouts[index].setHelperTextEnabled(false);

            Arr_ddownTexts[index].setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean hasFocus) {
                    Arr_ddownLayouts[index].setHelperTextEnabled(false);

                    if (!hasFocus) {
                        Arr_ddownLayouts[index].setEndIconVisible(false);

                        if (Arr_ddownTexts[index].getText().toString().isEmpty()) {
                            Arr_ddownLayouts[index].setHelperText("Required*");
                            Arr_ddownLayouts[index].setHelperTextEnabled(true);
                        } else {
                            Arr_ddownLayouts[index].setHelperTextEnabled(false);
                        }
                    }
                }
            });
        }


        // ADAPTER - CIVIL STATUS
        adapter_CSitems = new ArrayAdapter<String>(this, R.layout.dropdown_item, CivilStatus_items);
        // ADAPTER - YEARS
        adapter_Yearitems = new ArrayAdapter<>(this, R.layout.dropdown_item, Years);

        // DROPDOWN - CIVIL STATUS
        ddownCivilStatus.setAdapter(adapter_CSitems);
        // DROPDOWN - PRIMARY - START YEAR
        ddownPrimaryStartYear.setAdapter(adapter_Yearitems);
        // DROPDOWN - PRIMARY - END YEAR
        ddownPrimaryEndYear.setAdapter(adapter_Yearitems);
        // DROPDOWN - SECONDARY JHS - START YEAR
        ddownSecondaryStartYearJHS.setAdapter(adapter_Yearitems);
        // DROPDOWN - SECONDARY JHS - END YEAR
        ddownSecondaryEndYearJHS.setAdapter(adapter_Yearitems);
        // DROPDOWN - SECONDARY SHS - START YEAR
        ddownSecondaryStartYearSHS.setAdapter(adapter_Yearitems);
        // DROPDOWN - SECONDARY SHS - END YEAR
        ddownSecondaryEndYearSHS.setAdapter(adapter_Yearitems);
        // DROPDOWN - TERTIARY - START YEAR
        ddownTertiaryStartYear.setAdapter(adapter_Yearitems);
        // DROPDOWN - TERTIARY - END YEAR
        ddownTertiaryEndYear.setAdapter(adapter_Yearitems);


        // BUTTON - CLEAR
        btnClear = findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String auto = edtName.getText().toString();

                if (auto.equals("auto")){
                    edtName.setText("Exiquiel John A. Pines");
                    edtAddress.setText("Sta. Mesa, Manila");
                    edtContact.setText("9460895333");
                    edtEmail.setText("ejpines21");
                    edtAge.setText("21");
                    edtBirthdayMM.setText("10");
                    edtBirthdayDD.setText("26");
                    edtBirthdayYYYY.setText("2001");
                    edtBirthplace.setText("Sta. Mesa, Manila");
                    edtCitizenship.setText("Filipino");

                    edtReligion.setText("Catholic");
                    edtFatherName.setText("Geronimo A. Pines");
                    edtFatherOccupation.setText("Self-Employed");
                    edtMotherName.setText("Eleonor A. Pines");
                    edtMotherOccupation.setText("Self-Employed");
                    edtPrimarySchool.setText("Jose Rizal University");
                    edtSecondarySchoolJHS.setText("Jose Rizal University");
                    edtSecondarySchoolSHS.setText("Jose Rizal University");
                    edtTertiarySchool.setText("Jose Rizal University");
                    edtEmergencyName.setText("Elenor A. Pines");
                    edtEmergencyRelationship.setText("Mother");
                    edtEmergencyAddress.setText("Sta. Mesa, Manila");
                    edtEmergencyContact.setText("9399351002");

                    ddownCivilStatus.setText("Single");
                    ddownPrimaryStartYear.setText("2008");
                    ddownPrimaryEndYear.setText("2014");
                    ddownSecondaryStartYearJHS.setText("2014");
                    ddownSecondaryEndYearJHS.setText("2018");
                    ddownSecondaryStartYearSHS.setText("2018");
                    ddownSecondaryEndYearSHS.setText("2020");
                    ddownTertiaryStartYear.setText("2020");
                    ddownTertiaryEndYear.setText("Present");

                    layoutEmail.setEndIconVisible(false);
                    rootView.clearFocus();
                    Toast.makeText(MainActivity.this, "AUTO INPUT FIELDS", Toast.LENGTH_SHORT).show();
                } else {
                    edtName.setText("");
                    edtAddress.setText("");
                    edtContact.setText("");
                    edtEmail.setText("");
                    edtAge.setText("");
                    edtBirthdayMM.setText("");
                    edtBirthdayDD.setText("");
                    edtBirthdayYYYY.setText("");
                    edtBirthplace.setText("");
                    edtCitizenship.setText("");

                    edtReligion.setText("");
                    edtFatherName.setText("");
                    edtFatherOccupation.setText("");
                    edtMotherName.setText("");
                    edtMotherOccupation.setText("");
                    edtPrimarySchool.setText("");
                    edtSecondarySchoolJHS.setText("");
                    edtSecondarySchoolSHS.setText("");
                    edtTertiarySchool.setText("");
                    edtEmergencyName.setText("");
                    edtEmergencyRelationship.setText("");
                    edtEmergencyAddress.setText("");
                    edtEmergencyContact.setText("");

                    ddownCivilStatus.setText("");
                    ddownPrimaryStartYear.setText("");
                    ddownPrimaryEndYear.setText("");
                    ddownSecondaryStartYearJHS.setText("");
                    ddownSecondaryEndYearJHS.setText("");
                    ddownSecondaryStartYearSHS.setText("");
                    ddownSecondaryEndYearSHS.setText("");
                    ddownTertiaryStartYear.setText("");
                    ddownTertiaryEndYear.setText("");

                    rootView.clearFocus();
                    Toast.makeText(MainActivity.this, "All fields cleared!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // BUTTON - SUBMIT
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean edt_is_complete = true;
                boolean ddown_is_complete = true;

                for (int i = 0; i < Arr_edtLayouts.length; i++) {
                    int index = i;
                    if (Arr_edtTexts[index].getText().toString().isEmpty()) {
                        edt_is_complete = false;
                        break;
                    }
                }
                for (int i = 0; i < Arr_ddownLayouts.length; i++) {
                    int index = i;
                    if (Arr_ddownTexts[index].getText().toString().isEmpty()) {
                        ddown_is_complete = false;
                        break;
                    }
                }

                if (!(edt_is_complete && ddown_is_complete)) {
                    Toast.makeText(MainActivity.this, "Please complete all fields!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Successful Submission!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    String disName = edtName.getText().toString();
                    String disAddress = edtAddress.getText().toString();
                    String disContact = edtContact.getText().toString();
                    String disEmail = edtEmail.getText().toString();
                    String disAge = edtAge.getText().toString();
                    String disBirthdayMM = edtBirthdayMM.getText().toString();
                    String disBirthdayDD = edtBirthdayDD.getText().toString();
                    String disBirthdayYYYY = edtBirthdayYYYY.getText().toString();
                    String disBirthplace = edtBirthplace.getText().toString();
                    String disCitizenship = edtCitizenship.getText().toString();
                    String disReligion = edtReligion.getText().toString();
                    String disFatherName = edtFatherName.getText().toString();
                    String disFatherOccupation = edtFatherOccupation.getText().toString();
                    String disMotherName = edtMotherName.getText().toString();
                    String disMotherOccupation = edtMotherOccupation.getText().toString();
                    String disPrimarySchool = edtPrimarySchool.getText().toString();
                    String disSecondarySchoolJHS = edtSecondarySchoolJHS.getText().toString();
                    String disSecondarySchoolSHS = edtSecondarySchoolSHS.getText().toString();
                    String disTertiarySchool = edtTertiarySchool.getText().toString();
                    String disEmergencyName = edtEmergencyName.getText().toString();
                    String disEmergencyRelationship = edtEmergencyRelationship.getText().toString();
                    String disEmergencyAddress = edtEmergencyAddress.getText().toString();
                    String disEmergencyContact = edtEmergencyContact.getText().toString();

                    intent.putExtra("disName", disName);
                    intent.putExtra("disAddress", disAddress);
                    intent.putExtra("disContact", disContact);
                    intent.putExtra("disEmail", disEmail);
                    intent.putExtra("disAge", disAge);
                    intent.putExtra("disBirthdayMM", disBirthdayMM);
                    intent.putExtra("disBirthdayDD", disBirthdayDD);
                    intent.putExtra("disBirthdayYYYY", disBirthdayYYYY);
                    intent.putExtra("disBirthplace", disBirthplace);
                    intent.putExtra("disCitizenship", disCitizenship);
                    intent.putExtra("disReligion", disReligion);
                    intent.putExtra("disFatherName", disFatherName);
                    intent.putExtra("disFatherOccupation", disFatherOccupation);
                    intent.putExtra("disMotherName", disMotherName);
                    intent.putExtra("disMotherOccupation", disMotherOccupation);
                    intent.putExtra("disPrimarySchool", disPrimarySchool);
                    intent.putExtra("disSecondarySchoolJHS", disSecondarySchoolJHS);
                    intent.putExtra("disSecondarySchoolSHS", disSecondarySchoolSHS);
                    intent.putExtra("disTertiarySchool", disTertiarySchool);
                    intent.putExtra("disEmergencyName", disEmergencyName);
                    intent.putExtra("disEmergencyRelationship", disEmergencyRelationship);
                    intent.putExtra("disEmergencyAddress", disEmergencyAddress);
                    intent.putExtra("disEmergencyContact", disEmergencyContact);

                    String disCivilStatus = ddownCivilStatus.getText().toString();
                    String disPrimaryStartYear = ddownPrimaryStartYear.getText().toString();
                    String disPrimaryEndYear = ddownPrimaryEndYear.getText().toString();
                    String disSecondaryStartYearJHS = ddownSecondaryStartYearJHS.getText().toString();
                    String disSecondaryEndYearJHS = ddownSecondaryEndYearJHS.getText().toString();
                    String disSecondaryStartYearSHS = ddownSecondaryStartYearSHS.getText().toString();
                    String disSecondaryEndYearSHS = ddownSecondaryEndYearSHS.getText().toString();
                    String disTertiaryStartYear = ddownTertiaryStartYear.getText().toString();
                    String disTertiaryEndYear = ddownTertiaryEndYear.getText().toString();

                    intent.putExtra("disCivilStatus", disCivilStatus);
                    intent.putExtra("disPrimaryStartYear", disPrimaryStartYear);
                    intent.putExtra("disPrimaryEndYear", disPrimaryEndYear);
                    intent.putExtra("disSecondaryStartYearJHS", disSecondaryStartYearJHS);
                    intent.putExtra("disSecondaryEndYearJHS", disSecondaryEndYearJHS);
                    intent.putExtra("disSecondaryStartYearSHS", disSecondaryStartYearSHS);
                    intent.putExtra("disSecondaryEndYearSHS", disSecondaryEndYearSHS);
                    intent.putExtra("disTertiaryStartYear", disTertiaryStartYear);
                    intent.putExtra("disTertiaryEndYear", disTertiaryEndYear);

                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        View rootView = findViewById(android.R.id.content);
        rootView.clearFocus();
    }
}