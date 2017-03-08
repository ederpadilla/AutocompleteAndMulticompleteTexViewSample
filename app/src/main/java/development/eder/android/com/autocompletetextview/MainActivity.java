package development.eder.android.com.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.multiAutoCompleteTextView1)
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    @BindView(R.id.autoCompleteTextView1)
    AutoCompleteTextView autoCompleteTextView;

    List<String> li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String[] str={"Andoid","Jelly Bean","Froyo",
                "Ginger Bread","Eclipse Indigo","Eclipse Juno"};
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,str);

        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setAdapter(adp);
        li=new ArrayList<String>();
        li.add("Item 1");
        li.add("Item 2");
        li.add("Item 3");
        ArrayAdapter<String> autodp=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,li);
        adp.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(autodp);

    }
}
