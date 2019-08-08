package learning.vinodsharma.com.expandablelistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView expandableListView;

    private ExpandableListViewAdapter expandableListViewAdapter;

    private List<String> listDataGroup;
    private HashMap<String, List<PersonalityItemDetail>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing the views
        initViews();

        // initializing the objects
        initObjects();

        // preparing list data
        initListData();
    }

    private void initListeners() {

    }

    private void initObjects() {

        // initializing the list of groups
        listDataGroup = new ArrayList<>();

        // initializing the list of child
        listDataChild = new HashMap<>();

        // initializing the adapter object
        expandableListViewAdapter = new ExpandableListViewAdapter(this, listDataGroup, listDataChild);

        // setting list adapter
        expandableListView.setAdapter(expandableListViewAdapter);

    }

    private void initListData() {


        // Adding group data
        listDataGroup.add(getString(R.string.text_intro));
        listDataGroup.add(getString(R.string.text_bio));
        listDataGroup.add(getString(R.string.text_batting_career));
        listDataGroup.add(getString(R.string.text_major_awards));
        listDataGroup.add(getString(R.string.text_definning_movement));
        listDataGroup.add(getString(R.string.text_becomingdhoni));


        // array of strings
        String[] array;
        String[] values;

        // list of alcohol
        List<PersonalityItemDetail> introList = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_intro);
        for (String item : array) {
            PersonalityItemDetail personalityItemDetail = new PersonalityItemDetail();
            personalityItemDetail.setValue(item);
            introList.add(personalityItemDetail);
        }

        array = getResources().getStringArray(R.array.string_array_bio);
        values = getResources().getStringArray(R.array.string_array_bio_second);
        List<PersonalityItemDetail> bioList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            PersonalityItemDetail personalityItemDetail = new PersonalityItemDetail();
            personalityItemDetail.setHeader(array[i]);
            personalityItemDetail.setValue(values[i]);
            bioList.add(personalityItemDetail);
        }

        List<PersonalityItemDetail> BattingCareer = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_array_Batting_Career);
        values = getResources().getStringArray(R.array.string_array_Batting_Career2);

        for (int i = 0; i < array.length; i++) {
            PersonalityItemDetail personalityItemDetail = new PersonalityItemDetail();
            personalityItemDetail.setHeader(array[i]);
            personalityItemDetail.setValue(values[i]);
            BattingCareer.add(personalityItemDetail);
        }

        List<PersonalityItemDetail> MajorAwrdsandPrizes = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_major_awards_and_prizes);
        values = getResources().getStringArray(R.array.string_array_Batting_Career2);

        for (int i = 0; i < array.length; i++) {
            PersonalityItemDetail personalityItemDetail = new PersonalityItemDetail();
            personalityItemDetail.setHeader(array[i]);
            personalityItemDetail.setValue(values[i]);
            MajorAwrdsandPrizes.add(personalityItemDetail);
        }

        List<PersonalityItemDetail> definningmovement = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_definnig_movement);

        for (int i = 0; i < array.length; i++) {
            PersonalityItemDetail personalityItemDetail = new PersonalityItemDetail();
            personalityItemDetail.setValue(values[i]);
            definningmovement.add(personalityItemDetail);
        }
        List<PersonalityItemDetail> becomingDhoni = new ArrayList<>();
        array = getResources().getStringArray(R.array.string_major_awards_and_prizes);
        values = getResources().getStringArray(R.array.string_array_Batting_Career2);

        for (int i = 0; i < array.length; i++) {
            PersonalityItemDetail personalityItemDetail = new PersonalityItemDetail();
            personalityItemDetail.setValue(values[i]);
            personalityItemDetail.setHeader(array[i]);
            becomingDhoni.add(personalityItemDetail);
        }


        // Adding child data
        listDataChild.put(listDataGroup.get(0), introList);
        listDataChild.put(listDataGroup.get(1), bioList);
        listDataChild.put(listDataGroup.get(2), BattingCareer);
        listDataChild.put(listDataGroup.get(3), MajorAwrdsandPrizes);
        listDataChild.put(listDataGroup.get(4), definningmovement);
        listDataChild.put(listDataGroup.get(5), becomingDhoni);


        // notify the adapter
        expandableListViewAdapter.notifyDataSetChanged();
    }

    /**
     * method to initialize the views
     */
    private void initViews() {
        expandableListView = findViewById(R.id.expandableListView);
    }
}
