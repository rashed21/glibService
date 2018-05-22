package com.programmer.gate.service;

import com.programmer.gate.model.Us002;

public interface Us002Service {
	Us002 findByUserNameAndPassword(String userName, String password);
	//Us002 findByUs002Id(Double id);
	
}
