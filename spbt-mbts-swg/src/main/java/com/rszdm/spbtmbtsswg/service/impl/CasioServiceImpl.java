package com.rszdm.spbtmbtsswg.service.impl;

import com.rszdm.spbtmbtsswg.dao.CasioMapper;
import com.rszdm.spbtmbtsswg.entity.Casio;
import com.rszdm.spbtmbtsswg.service.CasioService;
import com.rszdm.spbtmbtsswg.util.DuplicateEntryForPrimaryKeyException;
import com.rszdm.spbtmbtsswg.util.ErrorCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CasioServiceImpl implements CasioService {

    //@Autowired
    @Resource
    private CasioMapper CasioMapper;


    public Integer add02(Casio casio) throws DuplicateEntryForPrimaryKeyException {

        //return CasioMapper.insertSelective(casio);
        try {
            Integer intmxn = CasioMapper.insertSelective(casio);
            System.out.println("[MXN DEBUG]:intmxn is:::" + intmxn);
            return intmxn;
        }catch (Exception e){
            throw new DuplicateEntryForPrimaryKeyException("AID is exist!", ErrorCode.DUPLICATE_PRI_INTERNAL_SERVER_ERROR.getCode());
        }

    }
    @Override
    public Integer add(Casio casio) {

        return CasioMapper.insertSelective(casio);
    }

    @Override
    public Integer delete(int id) {
        return CasioMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Casio queryById(int id) {
        return CasioMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Casio> queryAll() {
        return CasioMapper.queryAll();
    }

    @Override
    public Integer update(Casio casio) {
        return CasioMapper.updateByPrimaryKeySelective(casio);
    }


}

