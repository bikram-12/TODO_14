package gcit.edu.todo_13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_MESSAGE="TODO_12";
    String orderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donut(View view) {
        Toast toast = Toast.makeText(this, "you have order donut!", Toast.LENGTH_SHORT);
        String msm = "you have ordered donut!";
        orderMessage = msm;
        toast.show();
    }

    public void icecream(View view) {
        Toast toast = Toast.makeText(this, "you have order Ice cream!", Toast.LENGTH_SHORT);
        String msm = "you have order icecream";
        orderMessage = msm;
        toast.show();

    }

    public void froyo(View view) {
        Toast toast = Toast.makeText(this, "you have order Froyo!", Toast.LENGTH_SHORT);
        String msm = "you have ordered froyo";
        orderMessage = msm;
        toast.show();

    }

    public void call(View view) {

        Intent intent = new Intent(this, shopping.class);
        intent.putExtra(EXTRA_MESSAGE,intent);
        startActivity(intent);
    }
}