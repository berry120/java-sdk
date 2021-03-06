/* 
 * 
 * Created by LoginRadius Development Team
   Copyright 2019 LoginRadius Inc. All rights reserved.
   
 */

package com.loginradius.sdk.models.responsemodels.userprofile.objects;
import java.util.List;

import com.google.gson.annotations.SerializedName;

	/**
	 * Response containing Definition for Registration Data
	 */
	public class RegistrationData {
	
		
		@SerializedName("Data")
        private List<DataValue> data;



		/**
		 * Data
		 */
		public List<DataValue> getData() {
			return data;
		}
		/**
		 * Data
		 */
		public void setData(List<DataValue> data) {
			this.data = data;
		}
    }