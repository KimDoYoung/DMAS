package kr.co.kalpa.dmas.repository;

import kr.co.kalpa.dmas.model.DmasUser;

public interface DmasUserRepository {
    DmasUser selectOne(DmasUser user);
}
