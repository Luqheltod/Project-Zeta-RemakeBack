package com.projectzeta.zeta.service.imp;

import com.projectzeta.zeta.mapper.GameMapper;
import com.projectzeta.zeta.models.InstadeathDto;
import com.projectzeta.zeta.models.Stage;
import com.projectzeta.zeta.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImp implements GameService {

    @Autowired
    GameMapper gameMapper;

    @Override
    public Stage getStageInfoById(Long idStage) {

        return this.gameMapper.getStageInfoById(idStage);
    }

    @Override
    public InstadeathDto getInstadeathInfo(Long idOption) {
        return this.gameMapper.getInstadeathInfo(idOption);
    }


}
