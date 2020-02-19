package com.taurusLoadJunit.taurusLoadJunit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TaurusLoadJunitApplicationTests {

	private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
	private static HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

	@Test
	public void testCase1(){
		System.out.println("Reached!");

		String baseUrl = "https://od-pky2m545rcancom.od22.appdirectondemand.com/";
		String consumerKey = "appdirect";
		String consumerSecret = "mysecret";

		Retrofit.Builder builder = new Retrofit.Builder()
				.baseUrl(baseUrl)
				.addConverterFactory(JacksonConverterFactory.create());

		httpClient.addInterceptor(logging);
		OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(consumerKey, consumerSecret);
		httpClient.interceptors().add(new SigningInterceptor(consumer));

		builder.client(httpClient.build());

		Retrofit retrofit = builder.build();

		SubscriptionService service = retrofit.create(SubscriptionService.class);
		Call<List<Subscription>> callSync = service.getSubscriptions();

		System.out.println("callSync:" +callSync);

		List<Subscription> subscriptionList = new ArrayList<>();

		try {
			Response<List<Subscription>> response = callSync.execute();
			subscriptionList = response.body();
		} catch (Exception ex) {
			System.out.println("Exception: "+ex);
		}

		if(subscriptionList.size()!=0) {
			for (Subscription subscription : subscriptionList) {
				System.out.println("Subscription: " + subscription);
			}
		}
	}


}
