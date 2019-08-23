package android.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    Button btn;
    String p,e;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        pass=findViewById(R.id.password);
        btn=findViewById(R.id.button);
        e=email.getText().toString();
        p=pass.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e.isEmpty()||p.isEmpty())
                    Toast.makeText(MainActivity.this,"Fill all the fields!!",Toast.LENGTH_LONG).show();
                else if(e.equals("akanksha6@gmail.com")&&p.equals("a1234"))
                    Toast.makeText(MainActivity.this,"You have successfully logged in!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Invalid ID or password!!",Toast.LENGTH_LONG).show();
            }
        });

    }

}
