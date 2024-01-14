package com.projectzeta.zeta.service;

import com.projectzeta.zeta.models.InstadeathDto;
import com.projectzeta.zeta.models.Stage;

public interface GameService {

    Stage getStageInfoById(Long idStage);

    InstadeathDto getInstadeathInfo(Long idOption);


}
