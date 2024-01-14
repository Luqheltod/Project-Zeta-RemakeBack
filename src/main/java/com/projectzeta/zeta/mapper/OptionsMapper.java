package com.projectzeta.zeta.mapper;

import com.projectz.back.model.Options;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface OptionsMapper {

	@Select({
		"SELECT * FROM pzz.options o WHERE o.id_stage = #{idStage} "
	})
	public List<Options> getOptionsFromStageId(@Param("idStage")Long idStage);
}
