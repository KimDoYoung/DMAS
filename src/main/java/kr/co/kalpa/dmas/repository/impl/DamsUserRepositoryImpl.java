package kr.co.kalpa.dmas.repository.impl;

import kr.co.kalpa.dmas.model.DmasUser;
import kr.co.kalpa.dmas.repository.DmasUserRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DamsUserRepositoryImpl implements DmasUserRepository {

    private static final String NAMESPACE = "dmasuser";
    @Autowired
    SqlSession session;
    @Override
    public DmasUser selectOne(DmasUser user) {
       return session.selectOne(NAMESPACE+"selectOne", user);
    }
}
