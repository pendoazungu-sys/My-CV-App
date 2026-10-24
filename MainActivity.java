package com.example.mycvapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the XML layout
        setContentView(R.layout.activity_main);

        // Get views from the XML file
        TextView txtName = findViewById(R.id.txtName);
        TextView txtProfile = findViewById(R.id.txtProfile);
        TextView txtAbout = findViewById(R.id.txtAbout);
        TextView txtEducation = findViewById(R.id.txtEducation);
        TextView txtAchievements =
                findViewById(R.id.txtAchievements);
        TextView txtSkills = findViewById(R.id.txtSkills);
        TextView txtObjective = findViewById(R.id.txtObjective);
        TextView txtReferences = findViewById(R.id.txtReferences);

        // Personal information
        txtName.setText("Esther Pendo");

        txtProfile.setText(
                "ICT Student | Aspiring IT Professional"
        );

        txtAbout.setText(
                "I am Esther Pendo, an ICT student at " +
                        "Lukenya University. I am interested in " +
                        "technology, problem-solving and continuous " +
                        "learning. I aim to develop my technical " +
                        "abilities and use technology to solve " +
                        "real-world problems."
        );

        // Education
        txtEducation.setText(

                        "Institution: Lukenya University\n" +
                                "Course: Information and Communication " +
                                "Technology (ICT)\n" +
                                "Qualification: Diploma in Information and " +
                                "Communication Technology (ICT)\n" +
                                "Status: Graduated"
                );



        txtAbout.setText(
                "I am a graduate of Lukenya University, where I " +
                        "obtained a Diploma in Information and Communication " +
                        "Technology (ICT). My academic training has equipped " +
                        "me with knowledge of computer applications, " +
                        "information technology, and digital systems. " +
                        "I possess computer skills, effective communication " +
                        "skills, and the ability to work well in a team. " +
                        "I am a motivated, responsible, and eager-to-learn " +
                        "individual committed to professional growth. " +
                        "I look forward to applying my knowledge and skills " +
                        "to solve problems, support organizational goals, " +
                        "and contribute positively to the ICT field."
        );


        // Sample achievement statements to personalize
        txtAchievements.setText(
                "\u2022 Developing knowledge and skills in ICT.\n\n" +
                        "\u2022 Working towards my academic goals " +
                        "through continuous learning.\n\n" +
                        "\u2022 Improving my computer literacy and " +
                        "digital skills.\n\n" +
                        "\u2022 Developing communication and " +
                        "teamwork abilities.\n\n" +
                        "\u2022 Building problem-solving skills and " +
                        "preparing for a career in technology."
        );

        // Skills
        txtSkills.setText(
                "\u2022 Computer skills\n\n" +
                        "\u2022 Communication\n\n" +
                        "\u2022 Teamwork\n\n"+
                        "\u2022 Website Design\n\n"+
                        "\u2022 Networking\n\n"+
                        "\u2022 Programming\n\n"+
                        "\u2022 Repair and Maintenance"
        );

        // Career objective
        txtObjective.setText(
                "To build a successful career in ICT by " +
                        "applying my knowledge, improving my " +
                        "technical skills and contributing to " +
                        "innovative technology solutions."
        );

        // References
        txtReferences.setText("Available upon request.");
    }
}
