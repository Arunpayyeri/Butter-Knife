package com.example.signet.buttereknifesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {
    @BindView(R.id.lbl_title)
    TextView lblTitle;

    @BindView(R.id.input_name)
    EditText inputName;
    @BindView(R.id.txtgettxt)
    TextView txtGet;
    @BindView(R.id.btn_enter)
    Button btn;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "You have entered: " + inputName.getText().toString(),
                Toast.LENGTH_SHORT).show();
        txtGet.setText(""+inputName.getText());
    }
});
    }
 /*   @OnClick(R.id.btn_enter)
    public void onButtonClick() {
        Toast.makeText(getApplicationContext(), "You have entered: " + inputName.getText().toString(),
                Toast.LENGTH_SHORT).show();
        txtGet.setText(""+inputName.getText());
    }
*/

}
