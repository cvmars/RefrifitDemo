package com.retrofitdemo.interfaces;

import retrofit2.Callback;

import android.util.Log;

import com.retrofitdemo.BookInfo;

import retrofit2.Call;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

//public abstract class CallBackResult<T> implements CallBack<T> {
//
//    abstract public void onSuccessResult(Call call ,T response);
//
//    abstract public void onFailureResult(Call call ,Throwable t);
//
//    String TAG = "RESULT :";
////    @Override
////    public void onFailure(Call<T> call, Throwable t) {
////        Log.d(TAG + "onFailure", "request url :"+call.request().url().toString() + ", re" + call.request().body()+ t.getMessage().toString());
////        onFailureResult(call,t);
////    }
////
////    @Override
////    public void onSuccess(Call<T> call, T response) {
////
////        onSuccessResult(call,response);
////    }
////}
