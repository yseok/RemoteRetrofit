package com.yuseok.android.remoteretrofit;

import com.yuseok.android.remoteretrofit.domain.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by YS on 2017-03-07.
 */

public interface SeoulOpenService {

    // full adress : http://openapi.seoul.go.kr:8088/54776675767973393732674e697876/json/SearchParkingInfoRealtime/1/10/
    @GET("54776675767973393732674e697876/json/SearchParkingInfoRealtime/1/1000/{gu}")
    Call<Data> getData(@Path("gu") String gu);
}
