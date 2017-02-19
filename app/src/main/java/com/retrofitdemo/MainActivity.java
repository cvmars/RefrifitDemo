package com.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.retrofitdemo.interfaces.CallBack;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class MainActivity extends AppCompatActivity {

    String TAG = getClass().getSimpleName();
    TextView mContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContent = (TextView) findViewById(R.id.content);

        ApiBuilder builder = new ApiBuilder(ApiClient.Api_BookInfo)
                .Headers("header1","this is request header")
                .Headers("header2","this is request header2")
                .Params("params","this is request params");
        ApiClient.getInstance().doGet(builder, new CallBack<FindContent>() {
            @Override
            public void onSuccess(Call<ResponseBody> call, FindContent response) {

                mContent.setText(response.toString());
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {


            }
        },FindContent.class);
    }
}
