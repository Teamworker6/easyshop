package itschool.okhttp.mapper;

import itschool.okhttp.dto.TestDTO;
import itschool.okhttp.entity.Test;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestMapper{

    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);
    Test toEntity(TestDTO testDTO);
    TestDTO toDTO(Test test);



}
