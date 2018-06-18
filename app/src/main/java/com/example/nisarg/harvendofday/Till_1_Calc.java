package com.example.nisarg.harvendofday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Till_1_Calc extends AppCompatActivity {


    private EditText $2Valuetext;
    private EditText $1Valuetext;
    private EditText $025Valuetext;
    private EditText $010Valuetext;
    private EditText $005Valuetext;
    private TextView $2ValueShow;
    private  String showvalue2;
    private  String showvalue1;
    private  String showvalue025;
    private  String showvalue010;
    private  String showvalue005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_till_1__calc );
        $2Valuetext = findViewById(R.id.ValueOf2);
        $1Valuetext = findViewById(R.id.ValueOf1);
        $025Valuetext = findViewById(R.id.ValueOf025);
        $010Valuetext = findViewById(R.id.ValueOf010);
        $005Valuetext = findViewById(R.id.ValueOf005);



        $2Valuetext.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                $2ValueShow = findViewById(R.id.showSpace2);
                $2ValueShow.setText( null );
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                $2ValueShow = findViewById(R.id.showSpace2);
                showvalue2 = Integer.toString((Integer.parseInt( $2Valuetext.getText().toString() )*2));
                $2ValueShow.setText(showvalue2);
            }
        } );

}

    public void testOnClick(View view) {
        Intent intent = new Intent( this, ClosingClac.class );
        intent.putExtra( "done", 1 );
        startActivity( intent );
    }
}
