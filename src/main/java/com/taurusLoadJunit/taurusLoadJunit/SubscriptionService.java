package com.taurusLoadJunit.taurusLoadJunit;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface SubscriptionService {

    @GET("/api/v3/subscription/developer/8727cdb5-0b6e-4eb4-8182-3fa559661bed/8c68b3c3-bdd6-4323-9f5d-9cb25caef7fb/")
    public Call<List<Subscription>> getSubscriptions();

}
