package com.retrofitdemo.interfaces;

import com.retrofitdemo.BookInfo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Api请求回掉
 * Created by Administrator on 2017/2/13 0013.
 */

public interface CallBack<T> {


    void onSuccess(Call<ResponseBody> call, T response);

    void onFailure(Call<ResponseBody> call, Throwable t);
}
