package kr.co.kalpa.dmas.service;

import kr.co.kalpa.dmas.model.DmasUser;
import kr.co.kalpa.dmas.repository.DmasUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DmasUserService {

    @Autowired
    private  DmasUserRepository userRepository;

    public DmasUser selectOne(DmasUser user) {
            return userRepository.selectOne(user);
        }
}
