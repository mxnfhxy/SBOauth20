package com.rszdm.spbtmbtsswg.service;

import com.rszdm.spbtmbtsswg.entity.Casio;
import com.rszdm.spbtmbtsswg.util.DuplicateEntryForPrimaryKeyException;
import org.springframework.stereotype.Service;

@Service
public interface CasioService extends BaseService<Casio> {
    public abstract Integer add02(Casio casio) throws DuplicateEntryForPrimaryKeyException;
}
