package com.retrofitdemo;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 *
 * 网络请求类
 * Created by Administrator on 2017/2/13 0013.
 */

public class ApiClient {

    static ApiClient instance;


    public final static  String BASE_API = "http://app.youxiake.com";

    /**
     * 请求的接口
     * */
    public static String Api_BookInfo = "/api/discover/list/hot";


    /***
     *
     * 构建 retrofit请求
     * */
    private final static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(ApiClient.BASE_API)
            .build();


    /**
     * 获得 DouBanApiClient实例
     * @return
     */
    public DouBanApiClient getDbService(){

        return retrofit.create(DouBanApiClient.class);
    }

    /**
     * 创建请求单例
     * @return
     */
    public static ApiClient getInstance(){

        if(instance == null){
            synchronized (ApiClient.class){
                if(instance ==null){
                    instance = new ApiClient();
                }
            }
        }
        return instance;
    }



    /**
     *
     * get请求
     * @param builder  request构建的参数 包含 url header params
     * @param onCallback  rquest 回调
     * @param classOf   指定请求的model类型
     * @param <T>
     */
    public <T> void doGet(ApiBuilder builder ,final com.retrofitdemo.interfaces.CallBack<T> onCallback,final Class classOf){

        DouBanApiClient dbService = getDbService();
        Call<ResponseBody> stringCall = dbService.get(checkHeaders(builder.headers),
                checkUrl(builder.url), checkParams(builder.params));

        stringCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {

                Object o = null;
                try {
                    Log.d("TAG","----"+response.body().string());
                    o = new Gson().fromJson(response.body().string(), classOf);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                onCallback.onSuccess(call, (T) o);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                onCallback.onFailure(call,t);
                Log.d("TAG","----"+t.getMessage());
            }
        });
    }



    private String checkUrl(String url) {
        if (checkNULL(url)) {

            return null;
        }
        return url;
    }
    // 判断是否NULL
    public static boolean checkNULL(String str) {
        return str == null || "null".equals(str) || "".equals(str);

    }

    // 判断是否NULL
    public static void Error(Context context, String msg) {
        if (checkNULL(msg)) {
            msg = "未知异常";
        }
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static Map<String, String> checkHeaders(Map<String, String> headers) {
        if (headers == null) {
            headers = new HashMap<>();
        }
        //retrofit的headers的值不能为null，此处做下校验，防止出错
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            if (entry.getValue() == null) {
                headers.put(entry.getKey(), "");
            }
        }
        return headers;
    }

    public static Map<String, String> checkParams(Map<String, String> params) {
        if (params == null) {
            params = new HashMap<>();
        }
        //retrofit的params的值不能为null，此处做下校验，防止出错
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() == null) {
                params.put(entry.getKey(), "");
            }
        }
        return params;
    }
}
