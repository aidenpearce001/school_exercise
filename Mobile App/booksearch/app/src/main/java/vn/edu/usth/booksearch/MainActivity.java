package vn.edu.usth.booksearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import java.util.ArrayList;
import android.util.Log;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    SearchView mySearchView;
    ListView myList;
    private TextView mTextViewResult;

    private String _search;
    private Integer _limit;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewResult = findViewById(R.id.text_view_result);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://reqres.in/api/users/")
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();


        _search = "Harry Potter";
        _limit = 10;
//        String url = "http://openlibrary.org/search/lists.json?q="+_search+"&limit="+_limit+"&offset=0";
        String url = "http://openlibrary.org/search/lists.json?q=harry potter&limit=10&offset=0";
//        Request request = new Request.Builder()
//                .url("http://openlibrary.org/search/lists.json?q=harry potter&limit=10&offset=0")
//                .method("GET", null)
//                .build();
        Request request = new Request.Builder()
                .method("GET", null)
                .url(url)
                .build();

        Response response = client.newCall(request).execute();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String myResponse = response.body().string();

                    MainActivity.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Log.i(myResponse);
                            mTextViewResult.setText(myResponse);
                        }
                    });
                }
            }
        });


//        mySearchView=(SearchView)findViewById(R.id.searchView);
//        myList=(ListView)findViewById(R.id.mylist);
//
//        list.add("Monday");
//
//        adapter = new ArrayAdapter<>( context: this, android.R.layout.simple_list_item_1, list);
//        myList.setAdapter(adapter);
//
//        mySearchView.setOnQueryListener (new SearchView.OnQueryTextListener() {
//            public boolean onQueryTextSubmit(String s) {
//                return false;
//            }
//
//            publuc boolean OnQueryTextChange(String s) {
//                return false
//            }
//
//        });
    }

}