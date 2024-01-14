package com.projectzeta.zeta.service.imp;

import com.projectzeta.zeta.mapper.RestMapper;
import com.projectzeta.zeta.models.RestDto;
import com.projectzeta.zeta.service.RestService;
import com.projectzeta.zeta.utils.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestServiceImp implements RestService {

    @Autowired
    RestMapper restMapper;

    @Override
    public RestDto getRestInfo(Long restModifier) {

        Long idRest = this.GetIdRestByRestModifier(restModifier);

        return this.restMapper.getRestInfoByIdRest(idRest);
    }

    private Long GetIdRestByRestModifier(Long restModifier) {


        //Descansar con un modificador 10 es un 100% de fracaso, son descansos en situaciones insolitas
        if(restModifier ==10L) {
            return 10L;
        }


        //Modificador 0 es lo normal, 75% de descansar estandar y 25% de descanso aleatorio
        if(restModifier == 0L) {

            if(	NumberUtils.generateRandomNumber(1, 100) >70) {
                //Si es mayor a 70, debemos obtener un descanso random negativo del 2 al 9
                return  Long.valueOf(NumberUtils.generateRandomNumber(2, 10));
            } else {
                return 1L;
            }



        } else {
            return this.getIdRestByChance(restModifier);
        }

    }

    private Long getIdRestByChance(Long restModifier) {
        // Switch para determinar que idRest devolvemos
        Integer restModifierInt = (int) (long) restModifier;

        switch (restModifierInt)
        {
            case 2:
                return  Long.valueOf(NumberUtils.generateRandomNumber(2, 5));


            case 3:
                return  Long.valueOf(NumberUtils.generateRandomNumber(3, 6));


            case 4:
                return  Long.valueOf(NumberUtils.generateRandomNumber(4, 7));


            case 5:
                return  Long.valueOf(NumberUtils.generateRandomNumber(5, 8));


            case 6:
                return  Long.valueOf(NumberUtils.generateRandomNumber(6, 9));


            case 7:
                return  Long.valueOf(NumberUtils.generateRandomNumber(7, 10));


            case 8:
                return  Long.valueOf(NumberUtils.generateRandomNumber(8, 10));

            case 9:
                return  9L;

            default:
                return 9L;
        }}

}





