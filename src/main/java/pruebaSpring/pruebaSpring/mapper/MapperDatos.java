package pruebaSpring.pruebaSpring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import pruebaSpring.pruebaSpring.modelos.*;

@Mapper
public interface MapperDatos {
	@Select("select id, nombre from tablaPrueba")
    List<Dato> getDatos();
	
	@Select("SELECT id, nombre from tablaPrueba where id = #{id}")
	Dato getDatoById(String id);
}
