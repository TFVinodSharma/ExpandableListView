package learning.vinodsharma.com.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class HerosActivity extends AppCompatActivity {
    int logos[] = {R.drawable.dhoni, R.drawable. dhoni, R.drawable.dhoni, R.drawable.dhoni,
            R.drawable.dhoni, R.drawable.dhoni};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heros);

        RecyclerView ChooseHeros=findViewById(R.id.choose_heros);

        ChooseHeros.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ChooseHeros.setAdapter(new ChooseHerosAdaptertwo(logos));


    }
}
