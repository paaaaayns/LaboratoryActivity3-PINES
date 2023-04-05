package com.example.laboratoryactivity3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity2 extends AppCompatActivity {

    Button btnBack;
    TextInputEditText disName, disAddress, disContact, disEmail, disAge,
            disBirthday, disBirthplace, disCitizenship, disCivilStatus, disReligion,
            disFatherName, disFatherOccupation,
            disMotherName, disMotherOccupation,
            disPrimarySchool, disPrimaryInclusiveYear,
            disSecondarySchoolJHS, disSecondaryInclusiveYearJHS,
            disSecondarySchoolSHS, disSecondaryInclusiveYearSHS,
            disTertiarySchool, disTertiaryInclusiveYear,
            disEmergencyName, disEmergencyRelationship, disEmergencyAddress, disEmergencyContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        disName = findViewById(R.id.disName);
        disAddress = findViewById(R.id.disAddress);
        disContact = findViewById(R.id.disContact);
        disEmail = findViewById(R.id.disEmail);
        disAge = findViewById(R.id.disAge);
        disBirthday = findViewById(R.id.disBirthday);
        disBirthplace = findViewById(R.id.disBirthplace);
        disCitizenship = findViewById(R.id.disCitizenship);
        disCivilStatus = findViewById(R.id.disCivilStatus);
        disReligion = findViewById(R.id.disReligion);
        disFatherName = findViewById(R.id.disFatherName);
        disFatherOccupation = findViewById(R.id.disFatherOccupation);
        disMotherName = findViewById(R.id.disMotherName);
        disMotherOccupation = findViewById(R.id.disMotherOccupation);
        disPrimarySchool = findViewById(R.id.disPrimarySchool);
        disPrimaryInclusiveYear = findViewById(R.id.disPrimaryInclusiveYear);
        disSecondarySchoolJHS = findViewById(R.id.disSecondarySchoolJHS);
        disSecondaryInclusiveYearJHS = findViewById(R.id.disSecondaryInclusiveYearJHS);
        disSecondarySchoolSHS = findViewById(R.id.disSecondarySchoolSHS);
        disSecondaryInclusiveYearSHS = findViewById(R.id.disSecondaryInclusiveYearSHS);
        disTertiarySchool = findViewById(R.id.disTertiarySchool);
        disTertiaryInclusiveYear = findViewById(R.id.disTertiaryInclusiveYear);
        disEmergencyName = findViewById(R.id.disEmergencyName);
        disEmergencyRelationship = findViewById(R.id.disEmergencyRelationship);
        disEmergencyAddress = findViewById(R.id.disEmergencyAddress);
        disEmergencyContact = findViewById(R.id.disEmergencyContact);

        Bundle extras = getIntent().getExtras();
        String intName = extras.getString("disName");
        String intAddress = extras.getString("disAddress");
        String intContact = extras.getString("disContact");
        String intEmail = extras.getString("disEmail");
        String intAge = extras.getString("disAge");
        String intBirthdayMM = extras.getString("disBirthdayMM");
        String intBirthdayDD = extras.getString("disBirthdayDD");
        String intBirthdayYYYY = extras.getString("disBirthdayYYYY");
        String intBirthplace = extras.getString("disBirthplace");
        String intCitizenship = extras.getString("disCitizenship");
        String intReligion = extras.getString("disReligion");
        String intFatherName = extras.getString("disFatherName");
        String intFatherOccupation = extras.getString("disFatherOccupation");
        String intMotherName = extras.getString("disMotherName");
        String intMotherOccupation = extras.getString("disMotherOccupation");
        String intPrimarySchool = extras.getString("disPrimarySchool");
        String intSecondarySchoolJHS = extras.getString("disSecondarySchoolJHS");
        String intSecondarySchoolSHS = extras.getString("disSecondarySchoolSHS");
        String intTertiarySchool = extras.getString("disTertiarySchool");
        String intEmergencyName = extras.getString("disEmergencyName");
        String intEmergencyRelationship = extras.getString("disEmergencyRelationship");
        String intEmergencyAddress = extras.getString("disEmergencyAddress");
        String intEmergencyContact = extras.getString("disEmergencyContact");

        String intCivilStatus = extras.getString("disCivilStatus");
        String intPrimaryStartYear = extras.getString("disPrimaryStartYear");
        String intPrimaryEndYear = extras.getString("disPrimaryEndYear");
        String intSecondaryStartYearJHS = extras.getString("disSecondaryStartYearJHS");
        String intSecondaryEndYearJHS = extras.getString("disSecondaryEndYearJHS");
        String intSecondaryStartYearSHS = extras.getString("disSecondaryStartYearSHS");
        String intSecondaryEndYearSHS = extras.getString("disSecondaryEndYearSHS");
        String intTertiaryStartYear = extras.getString("disTertiaryStartYear");
        String intTertiaryEndYear = extras.getString("disTertiaryEndYear");

        disName.setText(intName);
        disAddress.setText(intAddress);
        disContact.setText(intContact);
        disEmail.setText(intEmail);
        disAge.setText(intAge);
        disBirthday.setText(intBirthdayMM + "/" + intBirthdayDD + "/" + intBirthdayYYYY);
        disBirthplace.setText(intBirthplace);
        disCitizenship.setText(intCitizenship);
        disCivilStatus.setText(intCivilStatus);
        disReligion.setText(intReligion);
        disFatherName.setText(intFatherName);
        disFatherOccupation.setText(intFatherOccupation);
        disMotherName.setText(intMotherName);
        disMotherOccupation.setText(intMotherOccupation);
        disPrimarySchool.setText(intPrimarySchool);
        disPrimaryInclusiveYear.setText(intPrimaryStartYear + " - " + intPrimaryEndYear);
        disSecondarySchoolJHS.setText(intSecondarySchoolJHS);
        disSecondaryInclusiveYearJHS.setText(intSecondaryStartYearJHS + " - " + intSecondaryEndYearJHS);
        disSecondarySchoolSHS.setText(intSecondarySchoolSHS);
        disSecondaryInclusiveYearSHS.setText(intSecondaryStartYearSHS + " - " + intSecondaryEndYearSHS);
        disTertiarySchool.setText(intTertiarySchool);
        disTertiaryInclusiveYear.setText(intTertiaryStartYear + " - " + intTertiaryEndYear);
        disEmergencyName.setText(intEmergencyName);
        disEmergencyRelationship.setText(intEmergencyRelationship);
        disEmergencyAddress.setText(intEmergencyAddress);
        disEmergencyContact.setText(intEmergencyContact);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                //startActivity(intent);
                finish();
            }
        });

    }
}