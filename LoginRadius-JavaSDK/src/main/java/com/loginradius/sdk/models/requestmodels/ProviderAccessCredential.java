/* 
 * 
 * Created by LoginRadius Development Team
   Copyright 2019 LoginRadius Inc. All rights reserved.
   
 */

package com.loginradius.sdk.models.requestmodels;
import com.google.gson.annotations.SerializedName;

	/**
	 * Model Class containing Definition for ProviderAccessCredential Property
	 */
	public class ProviderAccessCredential {
	
		
		@SerializedName("AccessToken")
        private String accessToken;
		
		@SerializedName("TokenSecret")
        private String tokenSecret;



		/**
		 * Uniquely generated identifier key by LoginRadius that is activated after successful authentication.
		 */
		public String getAccessToken() {
			return accessToken;
		}
		/**
		 * Uniquely generated identifier key by LoginRadius that is activated after successful authentication.
		 */
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}
		/**
		 * secret token of the provider
		 */
		public String getTokenSecret() {
			return tokenSecret;
		}
		/**
		 * secret token of the provider
		 */
		public void setTokenSecret(String tokenSecret) {
			this.tokenSecret = tokenSecret;
		}
    }