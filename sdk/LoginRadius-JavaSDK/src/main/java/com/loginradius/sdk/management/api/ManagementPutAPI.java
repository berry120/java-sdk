package com.loginradius.sdk.management.api;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;

import com.loginradius.sdk.resource.Endpoint;
import com.loginradius.sdk.resource.LoginRadiusException;
import com.loginradius.sdk.util.ArgumentValidator;

public class ManagementPutAPI extends LRManagementAPI {

	private final String method;
	private String finalpath = "";
	private String objectRecordId = "";
	private String uid = "";
	private String role = "";
	private Map<String, String> map = new HashMap<String, String>();

	private JsonObject json;

	public ManagementPutAPI(String method, Map<String, String> map, JsonObject data) {

		this.method = method;
		this.map = map;
		if (data != null) {
			this.json = data;
		} else {
			JsonObject registerdata = new JsonObject();
			registerdata.addProperty("", "");
			this.json = registerdata;
		}

	}

	@Override
	public String getResponse(String token) {
		// TODO Auto-generated method stub

		// write the validator

		if (!ArgumentValidator.pathValidator(this.method)) {

			throw new LoginRadiusException(
					"Invalid Argument used. Please refer documentation and use the correct argument");

		}

		Map<String, String> params = new HashMap<String, String>();
		if (this.map != null && !this.map.isEmpty()) {
			params.putAll(map);
			if (map.containsKey("objectRecordId")) {
				objectRecordId = map.get("objectRecordId");
			}
			if (map.containsKey("uid")) {
				uid = map.get("uid");
			}
			if (map.containsKey("role")) {
				role = map.get("role");
			}
		}

		switch (method) {
		case "updateaccount":
			params.remove("uid");
			finalpath = Endpoint.getV2_ManagementCreateAccount() + "/" + uid;
			break;
		case "setpassword":
			params.remove("uid");
			finalpath = Endpoint.getV2_ManagementCreateAccount() + "/" + uid + "/password";
			break;

		case "updateobjectbyrecordid":
			params.remove("objectRecordId");
			params.remove("uid");
			finalpath = Endpoint.getV2_ManagementCreateAccount() + "/" + uid + "/customobject/" + objectRecordId;
			break;
		case "addpermissionstorole":
			params.remove("role");
			finalpath = Endpoint.getV2_ManagementCreateRole() + "/" + role + "/permission";
			break;
		case "assignroles":
			params.remove("uid");
			finalpath = Endpoint.getV2_ManagementCreateCustomObject() + "/" + uid + "/role";
			break;
		default:
			break;

		}

		return executePut(finalpath, params, json);
	}

}