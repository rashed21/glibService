package com.programmer.gate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programmer.gate.model.Us002;
import com.programmer.gate.repository.Us002Repository;

@Service("us002Service")
public class Us002ServiceImpl implements Us002Service{

	@Autowired
	Us002Repository us002Repository;

	@Override
	public Us002 findByUserNameAndPassword(String userName, String password) {
		return us002Repository.findByUserNameAndPassword(userName,password);
	}

/*	@Override
	public Us002 findById(double id, double roleId) {
		return us002Repository.findById(id, roleId);
	}*/
}
