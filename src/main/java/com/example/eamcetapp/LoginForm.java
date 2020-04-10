package com.example.eamcetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginForm extends AppCompatActivity {
    private Button bt1,button_confirm;
    private EditText edit_text_username,edit_text_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");

    edit_text_username=findViewById(R.id.edit_text_username);
    edit_text_password=findViewById(R.id.edit_text_password);
    button_confirm=findViewById(R.id.button_confirm);
    edit_text_username.addTextChangedListener(loginTextWatcher);
    edit_text_password.addTextChangedListener(loginTextWatcher);


    }
     private TextWatcher loginTextWatcher=new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {
          String username_input=edit_text_username.getText().toString().trim();
          String password_input=edit_text_password.getText().toString().trim();

          button_confirm.setEnabled(!username_input.isEmpty()&&!password_input.isEmpty());
         }

         @Override
         public void afterTextChanged(Editable s) {

         }
     };
    public void btnsignupForm(View view) {
        startActivity(new Intent(getApplicationContext(),Signup_Form.class));


    }

    public void btnloginForm(View view) {
        Intent  i=new Intent(this,HomeActivity.class);
        startActivity(i);

    }

}
