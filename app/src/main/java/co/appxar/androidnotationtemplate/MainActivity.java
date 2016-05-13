package co.appxar.androidnotationtemplate;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.name)
    TextView name ;

    @ViewById
    TextView greeting ;

    @Click(R.id.button_click)
    void onClick(){
        Toast.makeText(this, "Hello xxxx" ,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    void setGreeting(){
        greeting.setText("Hello AndroidNotation");
        name.setText("Chaichon");
    }
}

