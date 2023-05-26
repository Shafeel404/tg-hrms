package tg.hrms.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tg.hrms.dto.UserNumberRegDto;
import tg.hrms.entities.UserNumberReg;
import tg.hrms.repository.UserNumberRegRepository;
import tg.hrms.service.UserNumberRegService;

@Service
public class UserNumberRegServiceImpl implements UserNumberRegService {

	@Autowired
	private UserNumberRegRepository userNumberRegRepository;

	@Override
	public void saveUser(UserNumberRegDto userNumberReg) {

		UserNumberReg reg = new UserNumberReg();
		reg.setId(userNumberReg.getId());
		reg.setPhoneNumber(userNumberReg.getPhoneNumber());
		reg.setRegId(userNumberReg.getRegId());
		reg.setTgId(userNumberReg.getTgId());
//		userNumberRegRepository.save(reg);
	}

	public Optional<UserNumberReg> findByID(Integer id) {
		Optional<UserNumberReg> userNumberReg = userNumberRegRepository.findById(id);
		if (userNumberReg.isPresent()) {
			UserNumberReg application = userNumberReg.get();
			System.out.println(application);
		}
		return null;
	}

}
