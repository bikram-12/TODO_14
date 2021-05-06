package gcit.edu.todo_13;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    public static final String EXTRA_MESSAGE="TODO_12";
    String orderMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.nav_menu, menu);
        return true;

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
    @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.action_order:
            Intent intent = new Intent(this,shopping.class);
            intent.putExtra(EXTRA_MESSAGE, orderMessage);
            startActivity(intent);
            return true;
            case R.id.action_contact:
                Toast.makeText(this, "you have select contact", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_fav:
                Toast.makeText(this, "You have selected favorites", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_setting:
                Toast.makeText(this, "You have selected Setting", Toast.LENGTH_SHORT).show();
                return true;
            default:
                break;

        }
        return false;
    }




}