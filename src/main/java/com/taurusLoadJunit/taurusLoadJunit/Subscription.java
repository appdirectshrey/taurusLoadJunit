package com.taurusLoadJunit.taurusLoadJunit;

import java.io.Serializable;

public class Subscription implements Serializable {

    private String subscriptionId;
    private String developerId;
    private String developerAccountId;
    private String partner;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(String developerId) {
        this.developerId = developerId;
    }

    public String getDeveloperAccountId() {
        return developerAccountId;
    }

    public void setDeveloperAccountId(String developerAccountId) {
        this.developerAccountId = developerAccountId;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "subscriptionId='" + subscriptionId + '\'' +
                ", developerId='" + developerId + '\'' +
                ", developerAccountId='" + developerAccountId + '\'' +
                ", partner='" + partner + '\'' +
                '}';
    }
}
