package vn.edu.usth.booksearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView mySearchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    mySearchView =  (SearchView)findViewById(R.id.searchView);
    myList = (ListView)findViewById(R.id.mylist);

    list.add("Monday")

    adapter = new ArrayAdapter<>( context: this, android.R.layout.simple_list_item_1, list)
    myList.setAdapter(adapter);

    mySearchView.setOnQueryListener (new SearchView.OnQueryTextListener() {
        public boolean onQueryTextSubmit(String s) {
            return false;
        }

        publuc boolean OnQueryTextChange (String s) {
            return false
        }

    });


}