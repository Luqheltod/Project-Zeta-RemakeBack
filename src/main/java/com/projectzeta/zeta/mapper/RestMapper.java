package com.projectzeta.zeta.mapper;



import com.projectzeta.zeta.models.RestDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RestMapper {
	
	@Select({
		"SELECT * FROM pzz.rest_info ri WHERE ri.id_rest_info = #{idRest} "
	})
	public RestDto getRestInfoByIdRest(@Param("idRest")Long idRest);

}
