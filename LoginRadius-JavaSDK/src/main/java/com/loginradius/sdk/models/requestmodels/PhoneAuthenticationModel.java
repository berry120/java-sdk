/* 
 * 
 * Created by LoginRadius Development Team
   Copyright 2019 LoginRadius Inc. All rights reserved.
   
 */

package com.loginradius.sdk.models.requestmodels;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

	/**
	 * Model Class containing Definition of payload for PhoneAuthenticationModel API
	 */
	public class PhoneAuthenticationModel extends ReCaptchaModel {
	
		
		@SerializedName("password")
        private String password;
		
		@SerializedName("phone")
        private String phone;
		
		@SerializedName("SecurityAnswer")
        private Map<String,String> securityAnswer;



		/**
		 * Password for the email
		 */
		public String getPassword() {
			return password;
		}
		/**
		 * Password for the email
		 */
		public void setPassword(String password) {
			this.password = password;
		}
		/**
		 * New Phone Number
		 */
		public String getPhone() {
			return phone;
		}
		/**
		 * New Phone Number
		 */
		public void setPhone(String phone) {
			this.phone = phone;
		}
		/**
		 * Valid JSON object of Unique Security Question ID and Answer of set Security Question. It is only required for locked accounts when logging in. Details about this feature
		 */
		public Map<String,String> getSecurityAnswer() {
			return securityAnswer;
		}
		/**
		 * Valid JSON object of Unique Security Question ID and Answer of set Security Question. It is only required for locked accounts when logging in. Details about this feature
		 */
		public void setSecurityAnswer(Map<String,String> securityAnswer) {
			this.securityAnswer = securityAnswer;
		}
    }