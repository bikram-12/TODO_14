package gcit.edu.todo_13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class shopping extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        Intent intent = getIntent();
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.display);
        textView.setText(message);

        Spinner spinner = findViewById(R.id.spin);

        if(spinner != null){
            spinner.setOnItemSelectedListener(this);

        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spin, android.R.layout.simple_spinner_dropdown_item);
        if(spinner!=null){
            spinner.setAdapter(adapter);
            spinner.getDisplay();
        }

    }


    public void radio_onclick(View view) {
        boolean check=((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.radioButton:
                Toast.makeText(this,"you have choose wrong choice", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(this,"you ahve choose right choice", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String message = parent.getItemAtPosition(position).toString();
        displayToast(message);

    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}