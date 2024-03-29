package com.projectzeta.zeta.mapper;


import com.projectzeta.zeta.models.InstadeathDto;
import com.projectzeta.zeta.models.Stage;
import org.apache.ibatis.annotations.*;



@Mapper
public interface GameMapper {

	
	@Select({
	"SELECT * FROM pzz.stage WHERE id_stage =#{idStage}"})
	@Results(value = {
			
			@Result(property = "options", column = "id_stage", many = @Many(select = "com.projectzeta.zeta.mapper.OptionsMapper.getOptionsFromStageId"))
		
	})
	public Stage getStageInfoById(@Param("idStage")Long id);

	@Select({
	"SELECT * FROM pzz.instadeath i WHERE id_options =#{idOption}"})
	public InstadeathDto getInstadeathInfo(@Param("idOption")Long idOption);
}
