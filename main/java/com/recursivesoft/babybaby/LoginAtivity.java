package com.recursivesoft.babybaby;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginAtivity extends AppCompatActivity {
    String TAG = "mainActivity";

    EditText etEmail;
    EditText etPassword;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener  mAuthListenter;
    private String stEmail;
    private String stpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etEmail = (EditText)findViewById(R.id.idtext);
        final EditText etPassword = (EditText)findViewById(R.id.passwordText);

        mAuth = FirebaseAuth.getInstance();
        mAuthListenter = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null){
                    Log.d(TAG,"signed_in" + user.getUid());

                }
                else {
                    Log.d(TAG,"signed_out");
                }
            }
        };
        Button loginButton = (Button)findViewById(R.id.loginButton);

        TextView registerButton = (TextView)findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent registerintent = new Intent(LoginAtivity.this, RegisterActivity.class);
                startActivity(registerintent);
            }
        });
//
        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                stEmail = etEmail.getText().toString();
                stpassword = etPassword.getText().toString();

                userLogin(stEmail,stpassword);

            }

        });

    }
    @Override
    public void onStart() {

        super.onStart();
        mAuth.addAuthStateListener(mAuthListenter);
    }

    @Override
    public void onStop() {

        super.onStop();
        if(mAuthListenter != null){
            mAuth.removeAuthStateListener(mAuthListenter);
        }
    }

    private void userLogin(String email, String password){
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();

                            Intent in = new Intent(LoginAtivity.this, Main2Activity.class);

                            startActivity(in);

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(LoginAtivity.this, "아이디 또는 비밀번호를 재확인 해주세요",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }

}