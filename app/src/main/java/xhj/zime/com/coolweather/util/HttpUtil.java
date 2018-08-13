package xhj.zime.com.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/*
        Http工具类，定义一个方法用来发送http请求，参数要传到活动或者fragment中是使用接口，回调函数
 */

public class HttpUtil {
    public static void sendOkHttpResquest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
