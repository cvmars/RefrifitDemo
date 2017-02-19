package com.retrofitdemo;

import android.database.Observable;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public interface DouBanApiClient {

    /**
     *@param headers  请求参数头
     *@param url   请求的地址
     *@param params 请求的参数
     */
    @GET()
    Call<ResponseBody> get(@HeaderMap Map<String, String> headers, @Url String url, @QueryMap Map<String, String> params);

    @FormUrlEncoded
    @POST()
    Call<String> post(@HeaderMap Map<String, String> headers, @Url String url, @FieldMap Map<String, String> params);

    @Streaming
    @GET()
    Call<ResponseBody> download(@HeaderMap Map<String, String> headers, @Url String url, @QueryMap Map<String, String> params);
}
